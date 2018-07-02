import { Component, OnInit, Input } from '@angular/core';
import { Subject } from 'rxjs/Subject';
import { PaginationService } from '../../Services/pagination.service';

@Component({
  selector: 'app-pagination',
  templateUrl: './pagination.component.html',
  styleUrls: ['./pagination.component.css']
})
export class PaginationComponent implements OnInit {
  @Input() pageSpecificData;
  currentPageNumber: number = 0;
  pageChanged = new Subject();

  constructor(private paginationService: PaginationService) { }

  ngOnInit() {
    this.paginationService.pageChanged.subscribe(
      (number: number) => {
        this.currentPageNumber = number;
      }
    )
  }

  getPageData(number: number) {
    this.currentPageNumber = number;
    this.paginationService.pageChanged.next(number);
  }

}
