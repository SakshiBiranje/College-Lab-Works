import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-student-details',
  imports: [FormsModule,CommonModule],
  templateUrl: './student-details.html',
  styleUrl: './student-details.css'
})
export class StudentDetails{
 query: string = '';
  student: any = null;

  students = [
    { id: 1, name: 'Sakshi', age: 21, course: 'Angular', email: 'sakshi@example.com', address: 'Pune, India' },
    { id: 2, name: 'Sana', age: 22, course: 'React', email: 'sana@example.com', address: 'Mumbai, India' },
    { id: 3, name: 'Suadrshan', age: 23, course: 'Vue', email: 'suadrshan@example.com', address: 'Delhi, India' }
  ];

  search() {
    const q = this.query.toLowerCase().trim();
    this.student = this.students.find(
      s => s.id.toString() === q || s.name.toLowerCase() === q
    ) || null;
  }
}
