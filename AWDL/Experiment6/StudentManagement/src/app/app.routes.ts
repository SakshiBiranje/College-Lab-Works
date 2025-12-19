import { Routes } from '@angular/router';
import { Home } from './home/home';
import { About } from './about/about';
import { StudentList } from './student-list/student-list';
import { StudentDetails } from './student-details/student-details';

export const routes: Routes = [
  { path: 'home', component: Home },
  { path: 'about', component: About },
  { path: 'students', component: StudentList },
  { path: 'view', component: StudentDetails },   // ✅ view page
  { path: '', redirectTo: 'home', pathMatch: 'full' },
];
