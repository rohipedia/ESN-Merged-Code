import { Component, OnInit } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Subject } from 'rxjs/Subject';
import 'rxjs/add/operator/map';

class USER {
  User_Id : number;
  UserName: string;
  Email: string;
  Date_Created: string;
}
@Component({
  selector: 'app-manage-users',
  templateUrl: './manage-users.component.html',
  styleUrls: ['./manage-users.component.css']
})
export class ManageUsersComponent implements OnInit {

  dtOptions: DataTables.Settings = {};
  users: USER[] = [];
  dtTrigger: Subject<any> = new Subject();
  adminData = [{
    "username":"Vishal",
    "lastLogin":"18/04/2018 07:55",
    "role":"admin"
  }];

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
    this.http.get('https://demo3885646.mockable.io/gridData')
      .map(this.extractData)
      .subscribe(users => {
        this.users = users;
        this.dtTrigger.next();
      });
  }
  public extractData(res: Response) {
    const body = res.json();
    return body.data || {};
  }
}
