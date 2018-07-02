import { Injectable, OnInit } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AuthenticateService implements CanActivate, OnInit {

  loggedIn: boolean = false;

  constructor(private router: Router) {}

  ngOnInit() {
    this.loggedIn = false;
  }

  canActivate(route: ActivatedRouteSnapshot, 
              state: RouterStateSnapshot): boolean {
    if (this.loggedIn) {
      return true;
    } else {
      this.router.navigate(['/']);
    }
  }

}
