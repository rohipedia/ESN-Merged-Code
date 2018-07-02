import { Http } from "@angular/http";
import { Response } from "@angular/http/src/static_response";
import { PaginationService } from "../Shared/Services/pagination.service";
import { OnInit, Injectable } from "@angular/core";
import { Subject } from "rxjs/Subject";

@Injectable()
export class FetchDataService {
    allPagesSpecificData = [];
    selectedPageSize: number;
    dataReceived = new Subject();

    constructor(private http: Http,
                private paginationService: PaginationService) {}

    getData(dataUrl: string) {
        this.http.get(dataUrl)
        .map(this.extractData)
        .subscribe(fetchedData => {
            this.loadData(fetchedData, false);
        });
    }

    extractData(res: Response) {
        const body = res.json();
        return body.data || body.users;
    }

    loadData(data, filter) {
        if (data.length > 0) {
            this.allPagesSpecificData = this.paginationService.getPageData(data, this.paginationService.getPageSizes()[0]);
            this.dataReceived.next({
                "rawData": !filter ? data : null,
                "allPagesSpecificData": this.allPagesSpecificData,
                "pageData": this.allPagesSpecificData[0].pageData
            });
            this.paginationService.pageChanged.next(0);
        }
    }

    changePageSize(data, selectedPageSize) {
        return this.paginationService.getPageData(data, selectedPageSize);
    }
}