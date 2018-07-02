import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Router } from '@angular/router';

import { ServiceWrapperService } from './../../../generic-services/service-wrapper.service';
import { FlashMessagesService } from 'angular2-flash-messages';
import { AuthGuardService } from '../../Services/auth-guard.service';
import { AuthenticateService } from '../../Services/authenticate.service';

//var bcrypt= require('bcrypt');
declare var require: any
@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  model: any = {};
  hash:any;
  constructor(private ServiceWrapperService:ServiceWrapperService,
              private _flashMessagesService: FlashMessagesService,
              private authenticateService: AuthenticateService,
              private authGuardService: AuthGuardService,
              private http: Http,
              private router: Router) { }
  
  
  ngOnInit() {
    
  }

  login(username, password) {
    // if (username == "admin" && password =="admin") {
    //   this._flashMessagesService.show('Hello Admin! Login Successful', { cssClass: 'alert-success', timeout: 3000 });
    //   this.router.navigate(['/ClaimESN']);
    //   this.authenticateService.loggedIn = true;
    //   this.authGuardService.isAdmin = true;
    // }
    // else if (username == "users" && password =="users") {
    //   this._flashMessagesService.show('Hello User! Login Successful', { cssClass: 'alert-success', timeout: 3000 });
    //   this.router.navigate(['/ClaimESN_user']);
    //   this.authenticateService.loggedIn = true;
    //   this.authGuardService.isAdmin = false;
    // }
    const url = '/api/login/' + username + '/' + password;
    return this.http.get(url).subscribe(
      (responseObject: any) => {
        if (responseObject !== null) {
          const response = JSON.parse(responseObject['_body']);
          if (response.isAdmin) {
            this._flashMessagesService.show('Hello Admin! Login Successful', { cssClass: 'alert-success', timeout: 3000 });
            this.router.navigate(['/ClaimESN']);
            this.authGuardService.isAdmin = true;
          } else {
            this._flashMessagesService.show('Hello User! Login Successful', { cssClass: 'alert-success', timeout: 3000 });
            this.router.navigate(['/ClaimESN_user']);
            this.authGuardService.isAdmin = false;
          }          
          this.authenticateService.loggedIn = true;
          this.model.username = username;
          this.model.password = password;
          //this.ServiceWrapperService.doPOST(this.model);
        }
    });
  }

}
