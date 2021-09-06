import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
  providers: [DataService]
})
export class EmployeeListComponent implements OnInit {

  employees: any[] = [];

  constructor(private dataService: DataService) {
    this.employees =   dataService.getEmployees();
   }

  ngOnInit(): void {
  }

}