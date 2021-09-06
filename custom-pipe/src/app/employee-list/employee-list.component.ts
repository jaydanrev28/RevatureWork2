import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees = [
    { code: 'emp101', name: 'Anakin', gender: 'Male', salary: 6000, dateOfBirth: '12/12/2000' },
    { code: 'emp102', name: 'Harry', gender: 'Male', salary: 7500, dateOfBirth: '05/06/2000' },
    { code: 'emp103', name: 'Frodo', gender: 'Male', salary: 9000, dateOfBirth: '05/24/2000' },
    { code: 'emp104', name: 'Gandalf', gender: 'Male', salary: 56000, dateOfBirth: '12/22/2000' },
    { code: 'emp105', name: 'Leia', gender: 'Female', salary: 87500, dateOfBirth: '01/12/2000' }
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
