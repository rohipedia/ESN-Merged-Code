import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-registration-page',
  templateUrl: './registration-page.component.html',
  styleUrls: ['./registration-page.component.css']
})
export class RegistrationPageComponent  {
  email: string;
  password: string;
    
    constructor() { }
    registration(email,password) {
    }
}

