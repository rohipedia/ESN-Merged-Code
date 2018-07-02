import { Component, OnInit } from '@angular/core';
import * as adminData from "./adminData.json";
import { GetEsnserviceService } from '../../../ESN-Manage/Services/get-esnservice.service';
@Component({
  selector: 'app-validate-esn',
  templateUrl: './validate-esn.component.html',
  styleUrls: ['./validate-esn.component.css']
})
export class ValidateEsnComponent implements OnInit {

  constructor(private getEsnserviceService: GetEsnserviceService) { }

  adminData=JSON.parse(JSON.stringify(adminData));

  esnDataForGrid: object;

  ngOnInit() {
    this.getEsnserviceService.esnDataReceived.subscribe(
      (data) => {
        this.esnDataForGrid = data;
      }
    )
  }  
}
