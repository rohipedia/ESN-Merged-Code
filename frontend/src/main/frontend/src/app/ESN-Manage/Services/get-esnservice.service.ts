import { Injectable } from '@angular/core';
import { Subject } from 'rxjs/Subject';
import { Http, Response, Headers, RequestOptions, URLSearchParams } from '@angular/http';

@Injectable()
export class GetEsnserviceService {
  constructor(private http: Http) { }
  private componentMethodCallSource = new Subject<any>();
  esnDataReceived = new Subject;
  //componentMethodCalled$ = this.componentMethodCallSource.asObservable();
  componentMethodCalled$ = this.componentMethodCallSource.asObservable();
  
  getDataService() {
    this.http.get('http://www.mocky.io/v2/5b07b8fa320000aa006fffff')
      .subscribe(data => {
        this.esnDataReceived.next(JSON.parse(data["_body"]).data);
      },
      err => {
        console.log("Response not found");
      });
  }

}
