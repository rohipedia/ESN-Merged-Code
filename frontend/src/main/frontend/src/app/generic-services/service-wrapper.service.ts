import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions, URLSearchParams } from '@angular/http';
import { AlertServiceService } from './alert-service.service';
@Injectable()
export class ServiceWrapperService {
  constructor(private http: Http) { }

  apiRoot: string = "http://localhost:8080";
  resFlag: boolean;

  doGET(urlRoot :string) {
    //let url = `${this.apiRoot}`+urlRoot;
    let url = urlRoot;
    return this.http.get(url).subscribe(res => {
        if (res.status==200){
          this.resFlag = true;
        }
        else {
          this.resFlag = false;  
        }
        return this.resFlag;
      }
    );  
  }

  doPOST(object:any) { 
    let url = `${this.apiRoot}/post`;
    this.http.post(url, object).subscribe(res => console.log(res.json()));
  }

  doPUT() {
    let url = `${this.apiRoot}/put`;
    let search = new URLSearchParams();
    search.set('a', 'esn');
    search.set('c', 'deviceprop');
    this.http.put(url, {a:"esn",c:"deviceprop"}, {search}).subscribe(res => console.log(res.json()));
  }

  doDELETE() {
  let url = `${this.apiRoot}/delete`;
  let search = new URLSearchParams();
  search.set('a', 'esn');
  search.set('c', 'devicename');
  this.http.delete(url, {search}).subscribe(res => console.log(res.json()));
  }

  
  
}
