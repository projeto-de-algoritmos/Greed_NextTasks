import { Component } from '@angular/core';
import {FormBuilder, FormsModule} from '@angular/forms'
import {TaskService} from "./task.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public items = [];
  public index: number = 0;

  task = this.formBuilder.group({
    name: [''],
    deadline: [''],
    daysToComplete: ['']
  });

  public addToList() {

      // @ts-ignore
      this.items.push(this.task);
      this.service.processTask(this.items);
      // @ts-ignore
      console.log(this.task.get('name').value);
  }

  // @ts-ignore
  public deleteTask(index) {
    this.items.splice(index, 1);
  }

  constructor(private formBuilder: FormBuilder,
              private service: TaskService) {
  }
}
