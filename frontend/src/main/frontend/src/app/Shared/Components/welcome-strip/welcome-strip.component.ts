import { Component, OnInit } from '@angular/core';
import * as authData from "./authentication.json";
import { ActivatedRoute, Params } from '@angular/router';
import { Data } from '@angular/router/src/config';
@Component({
  selector: 'app-welcome-strip',
  templateUrl: './welcome-strip.component.html',
  styleUrls: ['./welcome-strip.component.css']
})
export class WelcomeStripComponent implements OnInit {

  isAdminMode: boolean = false;

  constructor(private route: ActivatedRoute) { }

  authData1=JSON.parse(JSON.stringify(authData));
  ngOnInit() {
    this.route.data.subscribe(
      (data: Data) => {
        this.isAdminMode = data['adminMode'];
      }
    )
  } 
}