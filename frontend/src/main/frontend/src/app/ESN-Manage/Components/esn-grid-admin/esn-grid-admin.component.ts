import { Component, OnInit } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Subject } from 'rxjs/Subject';
import 'rxjs/add/operator/map';
//import { HttpClient, HttpResponse } from '@angular/common/http';
import { GetEsnserviceService } from './../../Services/get-esnservice.service';

class ESN {
  ASSIGNED: string;
  ESN: number;
  ESN_HEX: number;
  MODEL_NUMBER: string;
  MODEL_NAME: string;
  MANF_NAME: string;
  ICC_ID: number;
  IMEI: number;
  LTE_SKU: string;
  LTE_IMSI: number
}
@Component({
  selector: 'app-esn-grid-admin',
  templateUrl: './esn-grid-admin.component.html',
  styleUrls: ['./esn-grid-admin.component.css']
})
export class EsnGridAdminComponent implements OnInit {
  dtOptions: DataTables.Settings = {};
  //dtOptions: any;
  esns: ESN[] = [];
  dtTrigger: Subject<any> = new Subject();

  constructor(private http: Http) { }

  ngOnInit(): void {
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 10,
      columns: [{
        title: 'ASSIGNED',
        data: 'ASSIGNED'
      }, {
        title: 'ESN',
        data: 'ESN'
      }, {
        title: 'ESN_HEX',
        data: 'ESN_HEX'
      }, {
        title: 'MODEL_NUMBER',
        data: 'MODEL_NUMBER'
      }, {
        title: 'MODEL_NAME',
        data: 'MODEL_NAME'
      }, {
        title: 'MANF_NAME',
        data: 'MANF_NAME'
      }, {
        title: 'ICC_ID',
        data: 'ICC_ID'
      }, {
        title: 'IMEI',
        data: 'IMEI'
      }, {
        title: 'LTE_SKU',
        data: 'LTE_SKU'
      }, {
        title: 'LTE_IMSI',
        data: 'LTE_IMSI'
      }, {
        title: 'Edit',
        data: ''
      }]
    };
    
  }
  
  public getUserData() {
    this.http.get('http://www.mocky.io/v2/5b07b8fa320000aa006fffff')
      .map(this.extractData)
      .subscribe(esns => {
        this.esns = esns;
        this.dtTrigger.next();
      });
  }
  public extractData(res: Response) {
    const body = res.json();
    return body.data || {};
  }
}

