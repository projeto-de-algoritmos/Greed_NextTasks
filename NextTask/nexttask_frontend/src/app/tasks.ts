export interface Task {
  "name": string,
  "deadline": object,
  "daysToComplete" : number,
  "dateStart": object,
  "dateFinish": object,
  "lateness": object

}

export type Tasks = Array<Task>;
