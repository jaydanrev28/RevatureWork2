import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent  {
  name = 'Mark smith';
  message = 'welcome to angular training'
  person = {
    firstName: 'Paul',
    lastName: 'Watson'
  }
  currentDate = new Date();
  constructor() { }

}
