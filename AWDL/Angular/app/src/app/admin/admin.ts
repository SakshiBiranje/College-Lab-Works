import { Component } from '@angular/core';

@Component({
  selector: 'app-admin',
  standalone: true,     
  imports: [],
  templateUrl: './admin.html',
  styleUrls: ['./admin.css']
})
export class Admin {
  //data binding interpolation
  name: string = 'Angular';
    date: Date = new Date();
  //data binding property

  age: number = 5;
  //data binding event

  message: string = '';

  onClick() {
    this.message = 'Button was clicked!';
  }
  //data binding two-way


}
