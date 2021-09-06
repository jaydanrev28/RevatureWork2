import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css" integrity="sha384-3fdgwJw17Bi87e1QQ4fsLn4rUFqWw//KU0g8TvV6quvahISRewev6/EocKNuJmEw" crossorigin="anonymous">
<h2>Show or Hide table in JavaScript</h2>
<script>
function showTable(){
document.getElementById('table').style.visibility = "visible";
}
function hideTable(){
document.getElementById('table').style.visibility = "hidden";
}
</script>
<body onload="javascript:hideTable()">
<input type='button' onClick='javascript:showTable();' value='show'>
<input type='button' onClick='javascript:hideTable();' value='hide'>
<table id='table' border=1>
<tr><th>id</th><th>Name</th><th>Gender</th><th>Email</th></tr>
<tr><td> 1</td><td> Angelina</td><td> Female </td><td>a@outlook.com</td></tr>
<tr><td> 2</td><td> Simran </td><td> Male </td><td>S@gmail.com</td></tr>
<tr><td> 3</td><td> Sania </td><td> Female </td><td>S@gmail.com</td></tr>
<tr><td> 4</td><td> Martina </td><td> female </td><td>M@gmail.com</td></tr>
</table>
</body>
</html>
  
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

 employees = [
   {code:1, name: 'adam', email: 'a@gmail.com', age: 30},
   {code:2, name: 'felix', email: 'f@gmail.com', age: 20},
   {code:3, name: 'james', email: 'j@gmail.com', age: 50},
   {code:4, name: 'antigone', email: 'as@gmail.com', age: 40},
 ]

  constructor() { }

  ngOnInit(): void {
  }

  onButtonClicked(){
    console.log('button clicked')
    this.message = 'Hello Watson';
  }

  onChange(){
    this.message = 'Change happed'
  }

  onGetValue(input: any){
    console.log(input)
  }

  onKeyUp(data: any){
    this.comment = data
  }

}
