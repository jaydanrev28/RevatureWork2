import { NgModule } from "@angular/core";
import { Routes, RouterModule } from '@angular/router';
import { DepartmentDetailComponent } from "./department-detail/department-detail.component";
import { DepartmentComponent } from "./department/department.component";
import { EmployeeComponent } from "./employee/employee.component";

const routes: Routes = [
    { path: 'department', component: DepartmentComponent },
    { path: 'department/:id', component: DepartmentDetailComponent },
    { path: 'employee', component: EmployeeComponent }
]


@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{

}