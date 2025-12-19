import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

@Component({
  selector: 'app-client',
  imports: [FormsModule,CommonModule],
  templateUrl: './client.html',
  styleUrl: './client.css'
})
export class Client implements OnInit {
  users: any[] = [];
  selectedUser: any = null;
  selectedUserId: string = '';
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http.get<any[]>('https://jsonplaceholder.typicode.com/users').subscribe( (user : any) => {
      this.users = user;
    });
  }
  onUserSelect(event: any): void {
    this.selectedUserId = event.target.value;
    console.log('Selected User ID:', this.selectedUserId);
}
}   