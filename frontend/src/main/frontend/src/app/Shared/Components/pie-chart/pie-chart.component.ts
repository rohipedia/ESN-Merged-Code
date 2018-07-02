import { Component, OnInit } from '@angular/core';
import { ChartsModule } from 'ng2-charts';
import { Http, Response } from '@angular/http';
import { ServiceWrapperService } from './../../../generic-services/service-wrapper.service';
import { AlertServiceService } from './../../../generic-services/alert-service.service';
import { GetEsnserviceService } from '../../../ESN-Manage/Services/get-esnservice.service';
import * as pieData from "./pieData.json";
import * as esnData from "./esnData.json";
import { isDefined } from '@angular/compiler/src/util';
import { FlashMessagesService } from 'angular2-flash-messages';
import { LoadingModule } from 'ngx-loading';
@Component({
  selector: 'app-piechart',
  templateUrl: './pie-chart.component.html',
  styleUrls: ['./pie-chart.component.css']
})
export class PiechartComponent implements OnInit {
  constructor(private http: Http, private ServiceWrapperService:ServiceWrapperService,private AlertServiceService:AlertServiceService,private GetEsnserviceService:GetEsnserviceService,private _flashMessagesService: FlashMessagesService) { }
  inputs: any;
  pieData=JSON.parse(JSON.stringify(pieData));
  esnData=JSON.parse(JSON.stringify(esnData));
  ngOnInit() {
    console.log(this.pieData.data[0].v1);
  }
  public pieChartLabels:string[] = ['Used ESNs', 'Unused ESNs'];
  public loading = false;
  public pieChartData:any[] = [this.pieData.data[0].v1,this.pieData.data[0].v2];
  public pieChartType:string = 'pie';
  resFlag :boolean;
  public chartClicked(e:any):void {
    console.log(e);
  }

  public chartHovered(e:any):void {
    console.log(e);
  }

  // getDataImport() {
  // this.loading = true;
  // this.resFlag=(Boolean) (this.ServiceWrapperService.doGET(`/api/importExcel`));
  // if (this.resFlag == true) {
  //   this.loading = true;
  //   console.log(this.resFlag);
  //   console.log(this.loading);
  //   this._flashMessagesService.show('Import Successful, Please Click on Validate', { cssClass: 'alert-success', timeout: 3000 });
  // } else {
  //   this.loading = false;
  // }
  // console.log(this.resFlag + "coming component")
  // }

  public getDataImport() {
    this.loading = true;
    this.http.get('http://localhost:8080/api/importExcel')
      .subscribe(res => {
          if (res.status==200 || res.status== 201){
            console.log(res.status);
            this.loading = false;
            this._flashMessagesService.show('Import Successful, Please Click on Validate', { cssClass: 'alert-success', timeout: 3000 });
          }
          else {
			  if (res.status==400){
				  this.loading = false;
				this._flashMessagesService.show('Import Unsuccessful, Please Check the data', { cssClass: 'alert-danger', timeout: 3000 });
			  }
			  if (res.status==404){
				  this.loading = false;
				this._flashMessagesService.show('Import Unsuccessful, File not Found', { cssClass: 'alert-danger', timeout: 3000 });
			  }
          }
        });
  }

 /* validateData() {
  this.resFlag=(Boolean) (this.ServiceWrapperService.doGET(`/api/validateEsn`));
  if (this.resFlag == true) {
    this._flashMessagesService.show('Trigger Validation', { cssClass: 'alert-success', timeout: 3000 });
  }
  console.log(this.resFlag + "coming component")
  this.GetEsnserviceService.getDataService();
  }*/
}
