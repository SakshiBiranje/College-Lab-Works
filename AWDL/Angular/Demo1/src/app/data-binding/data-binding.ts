import { CommonModule } from '@angular/common';
import { Component, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  imports: [CommonModule],
  templateUrl:'./data-binding.html',
  styleUrl: './data-binding.css'
})
export class DataBinding {
  //Interpolation
  name:String='Omkar'
  //Properties
  rollno:number=6
  //event
  showName(name:string){
      this.name=name;
  }
  Isactive:boolean=true;
}



