import { Component, OnInit } from '@angular/core';
import { ServiceWrapperService } from './../../../generic-services/service-wrapper.service';
import { GetEsnserviceService } from '../../../ESN-Manage/Services/get-esnservice.service';
@Component({
  selector: 'app-esn-workflow',
  templateUrl: './esn-workflow.component.html',
  styleUrls: ['./esn-workflow.component.css']
})
export class EsnWorkflowComponent implements OnInit {

  constructor(private ServiceWrapperService:ServiceWrapperService,private GetEsnserviceService:GetEsnserviceService) { }
  resFlag :boolean;
  esnData: any;
  ngOnInit() {
  }

  refresh() {

  }
  triggerValidation() {
    //this.resFlag=(Boolean) (this.ServiceWrapperService.doGET(`/api/validateEsn`));
    //this.resFlag=(Boolean) (this.ServiceWrapperService.doGET('http://localhost:8080/api/validateEsn'));
    //console.log(this.resFlag + "coming component")
    this.GetEsnserviceService.getDataService();
  }
}
