import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-blockshow',
  standalone: true,  // ✅ makes this a standalone component
  imports: [CommonModule, FormsModule], // ✅ required for *ngIf, *ngFor, [(ngModel)]
  templateUrl: './blockshow.html',
  styleUrls: ['./blockshow.css']  // ✅ must be plural
})
export class Blockshow {
  // Block 1
  myName: string = "Omkar Barad";
  isNameVisible: boolean = false;

  showName() {
    this.isNameVisible = true;
  }
  hideName() {
    this.isNameVisible = false;
  }

  // Block 2
  toggleText: string = "OFF";
  toggleState() {
    this.toggleText = this.toggleText === "OFF" ? "ON" : "OFF";
  }

  // Block 3
  num1: number | null = null;
  num2: number | null = null;
  showNum1Input: boolean = false;
  showNum2Input: boolean = false;

  // Block 4
  options: string[] = ["Angular", "React", "Vue", "Svelte"];
  selectedOption: string = "";
}
