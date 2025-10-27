import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Blockshow } from './blockshow/blockshow';
import { Ifelse } from './ifelse/ifelse';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,  // ✅ Add this, since you’re using imports directly in the component
  imports: [RouterOutlet, Blockshow, Ifelse, CommonModule, FormsModule],
  templateUrl: './app.html',
  styleUrls: ['./app.css']  // ✅ must be "styleUrls" (plural), not "styleUrl"
})
export class App {
  protected readonly title = signal('Block');
}
