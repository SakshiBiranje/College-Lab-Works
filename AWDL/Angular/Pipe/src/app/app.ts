import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Case} from './case/case';
@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Case],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Pipe');
}
