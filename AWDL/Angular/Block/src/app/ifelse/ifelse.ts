import { Component } from '@angular/core';

@Component({
  selector: 'app-ifelse',
  standalone: true,   // ✅ mark it standalone
  imports: [],        // ✅ keep empty or add CommonModule, FormsModule if needed
  templateUrl: './ifelse.html',
  styleUrls: ['./ifelse.css']  // ✅ must be styleUrls
})
export class Ifelse {

}