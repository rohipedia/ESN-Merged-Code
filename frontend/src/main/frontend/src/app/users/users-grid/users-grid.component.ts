import { Component, OnInit, OnDestroy } from '@angular/core';

import { PaginationService } from '../../Shared/Services/pagination.service';
import { SearchDataPipe } from '../../Shared/search.pipe';
import { FetchDataService } from '../../generic-services/fetch-data.service';
import { Subscription } from 'rxjs/Subscription';

@Component({
  selector: 'app-users-grid',
  templateUrl: './users-grid.component.html',
  styleUrls: ['./users-grid.component.css']
})
export class UsersGridComponent implements OnInit, OnDestroy {

  constructor(private paginationService: PaginationService,
              private fetchData: FetchDataService,
              private searchDataPipe: SearchDataPipe) { }

  dataUrl: string = 'http://www.mocky.io/v2/5b336c36320000ad12d1e0c0';
  users = [];
  pageSizes: number[];
  selectedPageSize: number;
  pageData: object[];
  searchUserText: string;
  pageSpecificUsers = [];
  filteredUsers = [];
  noUserInfo: boolean = false;
  dataRetrievalSubscription: Subscription;
  paginationSubscription: Subscription;

  ngOnInit() {
    this.pageSizes = [5, 10, 20, 25, 50];
    this.selectedPageSize = this.pageSizes[0];
    this.getUserData();
    this.getPageSpecificData();
  }

  ngOnDestroy() {
    this.dataRetrievalSubscription.unsubscribe();
    this.paginationSubscription.unsubscribe();
  }

  getUserData() {
    this.fetchData.getData(this.dataUrl);
    this.dataRetrievalSubscription = this.fetchData.dataReceived.subscribe(
      (data: any) => {
        this.users = (data.rawData !== null) ? data.rawData : this.users;
        this.pageSpecificUsers = data.allPagesSpecificData;
        this.pageData = data.pageData;
        this.noUserInfo = (this.users.length === 0);
      }
    );
  }

  changePageSize() {
    let users = (this.filteredUsers.length > 0) ? this.filteredUsers : this.users;
    this.pageSpecificUsers = this.paginationService.getPageData(users, this.selectedPageSize);
    this.paginationService.pageChanged.next(0);    
  }

  searchUser(searchUserText: string) {
    this.filteredUsers = this.searchDataPipe.transform(this.users, searchUserText);
    this.fetchData.loadData(this.filteredUsers, true);
  }

  getPageSpecificData() {
    this.paginationSubscription = this.paginationService.pageChanged.subscribe(
      (number: number) => {
        this.pageData = this.pageSpecificUsers[number].pageData;
      }
    );
  }
}
