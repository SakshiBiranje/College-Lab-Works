import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Client } from './client/client';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Client],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('HttpClient');
}
