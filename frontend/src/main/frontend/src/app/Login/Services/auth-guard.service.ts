import { OnInit, Injectable } from "@angular/core";
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, ActivatedRoute, Router } from "@angular/router";
import { Observable } from "rxjs/Observable";

@Injectable()
export class AuthGuardService implements CanActivate, OnInit {
    isAdmin: boolean = false;

    constructor(private route: ActivatedRoute,
                private router: Router) {}

    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
        if (this.isAdmin) {
            return true;
        } else {
            this.router.navigate(['/']);
        }
    }

    ngOnInit() {
        this.isAdmin = false;
    }

}