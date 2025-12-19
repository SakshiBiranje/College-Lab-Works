import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterLink, RouterModule, RouterOutlet } from '@angular/router';
interface Student {
  id: number;
  name: string;
  age: number;
  course: string;
}
@Component({
  selector: 'app-student-list',
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './student-list.html',
  styleUrl: './student-list.css'
})
export class StudentList {
 students = [
    { id: 1, name: 'Sakshi', age: 21, course: 'Angular' },
    { id: 2, name: 'Sana', age: 22, course: 'React' },
    { id: 3, name: 'Suadrshan', age: 20, course: 'Vue' }
  ];

}
