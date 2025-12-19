import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormsModule, ReactiveFormsModule,FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-student-form',
  imports: [FormsModule, CommonModule, ReactiveFormsModule],
  templateUrl: './student-form.html',
  styleUrl: './student-form.css'
})
export class StudentForm {
  isSubmitted = false;
  studentForm: FormGroup= new FormGroup({
  firstname: new FormControl("",[Validators.required,Validators.minLength(3)]),
  lastname: new FormControl("",[Validators.required,Validators.minLength(3)]),
  username: new FormControl("",[Validators.required,Validators.minLength(3)]),
  city: new FormControl("",[Validators.required,Validators.minLength(3)]),
  state: new FormControl("",[Validators.required,Validators.minLength(3)]),
  zip: new FormControl("",[Validators.required,Validators.minLength(3)]),
  agree: new FormControl(false)
});


OnSubmit(){

  console.log(this.studentForm.value);
  this.isSubmitted=true;
}
OnReset(){
  this.studentForm.reset();
  this.isSubmitted=false;
}
}
