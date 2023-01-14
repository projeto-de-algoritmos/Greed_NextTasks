import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Tasks} from "./tasks";

const API = 'api'

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http: HttpClient) { }

  processTask(tasks: any): Observable<Tasks>{
    return this.http.post<Tasks>(`${API}/processTasks`, tasks);
  }
}
