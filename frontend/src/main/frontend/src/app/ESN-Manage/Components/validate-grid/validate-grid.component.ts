import { Component, Input, OnInit, OnDestroy } from '@angular/core';
import { Subject } from 'rxjs/Subject';

import { EsnModel } from '../../../Shared/esn.model';
import { PaginationService } from '../../../Shared/Services/pagination.service';
import { FetchDataService } from '../../../generic-services/fetch-data.service';
import { SearchDataPipe } from '../../../Shared/search.pipe';
import { Subscription } from 'rxjs/Subscription';

@Component({
  selector: 'app-validate-grid',
  templateUrl: './validate-grid.component.html',
  styleUrls: ['./validate-grid.component.css']
})
export class ValidateGridComponent implements OnInit, OnDestroy {
  esns;
  pageSizes: number[];
  selectedPageSize: number;
  dataUrl: string = 'http://www.mocky.io/v2/5b34f4202f00006e00376153';
  noEsnInfo: boolean = false;
  pageSpecificEsns = [];
  filteredEsns = [];
  currentPageEsns = [];
  dataRetrievalSubscription: Subscription;
  paginationSubscription: Subscription;

  constructor(private paginationService: PaginationService,
              private fetchData: FetchDataService,
              private searchDataPipe: SearchDataPipe) {}

  ngOnInit(): void {
    this.pageSizes = this.paginationService.getPageSizes();
    this.selectedPageSize = this.pageSizes[0];
    this.getEsnData();
    this.getPageSpecificData();
  }

  ngOnDestroy() {
    this.dataRetrievalSubscription.unsubscribe();
    this.paginationSubscription.unsubscribe();
  }

  getEsnData() {
    this.fetchData.getData(this.dataUrl);
    this.dataRetrievalSubscription = this.fetchData.dataReceived.subscribe(
      (data: any) => {
        this.esns = (data.rawData !== null) ? data.rawData : this.esns;
        this.pageSpecificEsns = data.allPagesSpecificData;
        this.currentPageEsns = data.pageData;
        this.noEsnInfo = (this.esns.length === 0);
      }
    );
  }

  changePageSize() {
    let esns = this.esns;
    //handle for filtering
    this.pageSpecificEsns = this.fetchData.changePageSize(esns, this.selectedPageSize);
    this.paginationService.pageChanged.next(0);
  }

  searchUser(searchUserText: string) {
    this.filteredEsns = this.searchDataPipe.transform(this.esns, searchUserText);
    this.fetchData.loadData(this.filteredEsns, true);
  }

  getPageSpecificData() {
    this.paginationSubscription = this.paginationService.pageChanged.subscribe(
      (number: number) => {
        this.currentPageEsns = this.pageSpecificEsns[number].pageData;
      }
    );
  }
}