import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { StudentForm } from './student-form/student-form';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,StudentForm],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Studentregistration');
}
