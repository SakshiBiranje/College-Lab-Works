import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Admin } from './admin/admin';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Admin],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  
}
