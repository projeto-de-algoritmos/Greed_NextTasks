import { Component } from '@angular/core';
import {FormBuilder, FormsModule} from '@angular/forms'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public items = [];

  taskForm = this.formBuilder.group({
    description: [''],
    date: [''],
    timeToComplete: ['']
  });

  public addToList() {

  }

  constructor(private formBuilder: FormBuilder) {
  }
}
