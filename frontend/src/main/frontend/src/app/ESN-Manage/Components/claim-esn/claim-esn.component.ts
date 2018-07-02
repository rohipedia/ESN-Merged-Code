import { Component, OnInit } from '@angular/core';
import { ServiceWrapperService } from './../../../generic-services/service-wrapper.service';
import { GetEsnserviceService } from '../../../ESN-Manage/Services/get-esnservice.service';

@Component({
  selector: 'app-claim-esn',
  templateUrl: './claim-esn.component.html',
  styleUrls: ['./claim-esn.component.css']
})
export class ClaimEsnComponent implements OnInit {

  constructor(private ServiceWrapperService:ServiceWrapperService,private GetEsnserviceService:GetEsnserviceService) { }
  getResponse :boolean;

  ngOnInit() {
  }

  claimEsn() {
    let obj: any;
    this.ServiceWrapperService.doPOST(obj);
    this.getResponse=(Boolean) (this.ServiceWrapperService.doGET(`/api/validateEsn`));
    console.log(this.getResponse + "coming component")
    this.GetEsnserviceService.getDataService();
  }
}
