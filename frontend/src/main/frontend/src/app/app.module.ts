import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';
import { DataTablesModule } from 'angular-datatables';
import { ChartsModule } from 'ng2-charts';
import { AppComponent } from './app.component';
import { RegistrationPageComponent } from './Login/Components/registration-page/registration-page.component';
import { LoginPageComponent } from './Login/Components/login-page/login-page.component';
import { ForgotPasswordComponent } from './Login/Components/forgot-password/forgot-password.component';
import { ClaimEsnComponent } from './ESN-Manage/Components/claim-esn/claim-esn.component';
import { BreadcrumbComponent } from './Shared/Components/breadcrumb/breadcrumb.component';
import { HomeComponentComponent } from './Home/Components/home-component/home-component.component';
import { HelpComponentComponent } from './Home/Components/help-component/help-component.component';
import { EsnWorkflowComponent } from './ESN-Manage/Components/esn-workflow/esn-workflow.component';
import { EsnGridComponent } from './ESN-Manage/Components/esn-grid/esn-grid.component';
import { WelcomeStripComponent } from './Shared/Components/welcome-strip/welcome-strip.component';
import { ServwrapperComponent } from './Shared/Components/servwrapper/servwrapper.component';
import { PiechartComponent } from './Shared/Components/pie-chart/pie-chart.component';
import { DataTableModule } from 'angular5-data-table';
import { ManageUsersComponent } from './Shared/Components/manage-users/manage-users.component';
import { ValidateEsnComponent } from './Shared/Components/validate-esn/validate-esn.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SnackbarComponent } from './Shared/Components/snackbar/snackbar.component';
import { ServiceWrapperService } from './generic-services/service-wrapper.service';
import { GetEsnserviceService } from './ESN-Manage/Services/get-esnservice.service';
import { SnackbarModule } from 'ngx-snackbar';
import { AlertServiceService } from './generic-services/alert-service.service';
import { BreadcrumbsModule } from 'ng2-breadcrumbs';
import { FlashMessagesModule } from 'angular2-flash-messages';
import { ClaimEsnUserComponent } from './ESN-Manage/Components/claim-esn-user/claim-esn-user.component';
import { EsnGridAdminComponent } from './ESN-Manage/Components/esn-grid-admin/esn-grid-admin.component';
import { ValidateGridComponent } from './ESN-Manage/Components/validate-grid/validate-grid.component';
import { LoadingModule } from 'ngx-loading';
import { AppRoutingModule } from './app-routing.module';
import { UsersGridComponent } from './users/users-grid/users-grid.component';
import { PaginationComponent } from './Shared/Components/pagination/pagination.component';
import { PaginationService } from './Shared/Services/pagination.service';
import { SearchDataPipe } from './Shared/search.pipe';
import { FetchDataService } from './generic-services/fetch-data.service';
import { AuthGuardService } from './Login/Services/auth-guard.service';
import { AuthenticateService } from './Login/Services/authenticate.service';
//import * as bcrypt  from 'bcrypt';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationPageComponent,
    LoginPageComponent,
    ForgotPasswordComponent,
    ClaimEsnComponent,
    BreadcrumbComponent,
    HomeComponentComponent,
    HelpComponentComponent,
    EsnWorkflowComponent,
    EsnGridComponent,
    WelcomeStripComponent,
    ServwrapperComponent,
    PiechartComponent,
    ManageUsersComponent,
    ValidateEsnComponent,
    SnackbarComponent,
    ClaimEsnUserComponent,
    EsnGridAdminComponent,
    ValidateGridComponent,
    UsersGridComponent,
    PaginationComponent
  ],
  imports: [HttpModule,
    BrowserModule,
    DataTablesModule,
    ChartsModule,
    FormsModule,
    BreadcrumbsModule,
    AppRoutingModule,
    SnackbarModule.forRoot(),
    FlashMessagesModule.forRoot(),
    LoadingModule,
  ],
  providers: [ServiceWrapperService,
    AlertServiceService,
    GetEsnserviceService,
    PaginationService,
    FetchDataService,
    SearchDataPipe,
    AuthenticateService,
    AuthGuardService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
