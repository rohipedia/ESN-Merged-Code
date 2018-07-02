import { NgModule } from '@angular/core';
import { AppModule } from "./app.module";

import { Routes, RouterModule } from "@angular/router";
import { HomeComponentComponent } from "./Home/Components/home-component/home-component.component";
import { RegistrationPageComponent } from "./Login/Components/registration-page/registration-page.component";
import { LoginPageComponent } from "./Login/Components/login-page/login-page.component";
import { WelcomeStripComponent } from "./Shared/Components/welcome-strip/welcome-strip.component";
import { HelpComponentComponent } from "./Home/Components/help-component/help-component.component";
import { ForgotPasswordComponent } from "./Login/Components/forgot-password/forgot-password.component";
import { PiechartComponent } from "./Shared/Components/pie-chart/pie-chart.component";
import { ManageUsersComponent } from "./Shared/Components/manage-users/manage-users.component";
import { ValidateEsnComponent } from "./Shared/Components/validate-esn/validate-esn.component";
import { AuthGuardService } from './Login/Services/auth-guard.service';
import { AuthenticateService } from './Login/Services/authenticate.service';

const appRoutes: Routes = [
    { path: '', component: HomeComponentComponent },
    { path: 'Register', component: RegistrationPageComponent, data: { breadcrumb: "Register"} },
    { path: 'Login', component: LoginPageComponent, data:{ breadcrumb: "Login" }, children: [
      {
        path: 'ClaimESN',
        component: WelcomeStripComponent
      }
    ]},
    { path: 'Help', component: HelpComponentComponent, data: { breadcrumb: "Help"} },
    { path: 'ClaimESN', component: WelcomeStripComponent, canActivate:[AuthGuardService, AuthenticateService], data: { breadcrumb: "Claim ESN", adminMode: true} },
    { path: 'Forgot', component: ForgotPasswordComponent, data: { breadcrumb: "Forgot"} },
    { path: 'PieChart', component: PiechartComponent, data: { breadcrumb: "Dashboard(Admin)"} },
    { path: 'ManageUsers', component: ManageUsersComponent, canActivate:[AuthGuardService, AuthenticateService],  data: { breadcrumb: "User Management(Admin)"} },
    { path: 'Validate', component: ValidateEsnComponent, canActivate:[AuthGuardService, AuthenticateService], data: { breadcrumb: "Validation ESN(Admin)"} },
    { path: 'ClaimESN_user', component: WelcomeStripComponent, canActivate:[AuthenticateService], data: { breadcrumb: "Claim ESN", adminMode: false} }
    //{ path: 'ClaimESN_user', component: ValidateEsnComponent, data: { breadcrumb: "Claim ESN"} }
  ];

@NgModule({
    imports: [RouterModule.forRoot(appRoutes)],
    exports: [RouterModule]
})
export class AppRoutingModule {

}