export interface Task {
  "name": string,
  "deadline": Date,
  "daysToComplete" : number,
  "dateStart": object,
  "dateFinish": object,
  "lateness": number

}

export type Tasks = Array<Task>;
