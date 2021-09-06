// inbuild module
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

// router module
import { AppRoutingModule } from './app-routing.module';

// components
import { AppComponent } from './app.component';
import { DepartmentComponent } from './department/department.component';
import { EmployeeComponent } from './employee/employee.component';
import { DepartmentDetailComponent } from './department-detail/department-detail.component';


@NgModule({
  declarations: [
    AppComponent,
    DepartmentComponent,
    DepartmentDetailComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
