import { Component, OnInit } from '@angular/core';
import { AlertServiceService } from './../../../generic-services/alert-service.service';
@Component({
  selector: 'app-snackbar',
  templateUrl: './snackbar.component.html',
  styleUrls: ['./snackbar.component.css']
})
export class SnackbarComponent implements OnInit {

  constructor(private AlertServiceService:AlertServiceService) { }
  resFlag:boolean;
  showAlert:boolean;
  successMessage: string = "Its completed successfully";
  failureMessage: string = "There is an error occured"
  ngOnInit() {
    this.showAlert=this.AlertServiceService.resFlag;
  }

}
