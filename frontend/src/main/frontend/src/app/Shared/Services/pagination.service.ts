import { Subject } from "rxjs/Subject";

export class PaginationService {
    pageChanged = new Subject();

    getPageSizes() {
      return [5, 10, 20, 25, 50];
    }

    getPageData(data, size: number) {
        let pageNumber = 1;
        let count = 0;
        let pageData = [];
        let i = 0, j = data.length;
        let pageSpecificData = [];
        for (i = 0, j = data.length; i<j; i+= size) {
          pageData = data.slice(i, i + size);
          pageSpecificData.push({
            "pageNumber": pageNumber++,
            "pageData": pageData
          });
        }
        return pageSpecificData;
      }
}