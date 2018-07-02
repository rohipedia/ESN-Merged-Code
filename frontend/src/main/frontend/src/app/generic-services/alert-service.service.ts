import { Injectable } from '@angular/core';
@Injectable()
export class AlertServiceService {

  constructor() { }
  resFlag:boolean;
  alertMessage(resFlag) {
        console.log(resFlag + "coming");
        this.resFlag=resFlag;
        return resFlag;         
  }
}
