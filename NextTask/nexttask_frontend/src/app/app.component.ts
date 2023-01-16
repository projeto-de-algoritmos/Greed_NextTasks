import { Component } from '@angular/core';
import {FormBuilder, FormsModule, Validators} from '@angular/forms'
import {TaskService} from "./task.service";
import {Tasks} from "./tasks";
import {Observable} from "rxjs";
import {DatePipe} from "@angular/common";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public items: any = [];
  public result$: Observable<Tasks> | undefined;
  public index: number = 0;

  task = this.formBuilder.group({
    name: ['', Validators.required],
    deadline: ['', Validators.required],
    daysToComplete: ['', Validators.required],
  });

  public addToList() {

    if(this.task.valid){
      this.items.push(this.task.value);
      console.log(this.items)
      this.result$ = this.service.processTask(this.items);
      this.task.reset();
    }
  }

  // @ts-ignore
  public deleteTask(index) {
    this.items.splice(index, 1);
    this.result$ = this.service.processTask(this.items);
  }

  constructor(private formBuilder: FormBuilder,
              private service: TaskService) {
  }

  getLatenessMessage(lateness: number) {
    if(lateness > 0){
      return 'Atraso de ' + lateness + ' dias'
    } else {
      return 'Sem Atraso'
    }
  }

  getDataEntrega(deadline: any) {
    const datepipe: DatePipe = new DatePipe('en-US')
    let formattedDate = datepipe.transform(deadline, 'dd/MM/YYYY')

    return 'Data Limite | '+ formattedDate
  }

  getDataFim(dateFinish: any) {
    const datepipe: DatePipe = new DatePipe('en-US')
    let formattedDate = datepipe.transform(dateFinish, 'dd/MM/YYYY')

    return 'Data de entrega | '+ formattedDate
  }
}
