import { Student } from './../model/dto/student';
import { Observable } from 'rxjs';
import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  
  private apiUrl: string = environment.apiUrl;
  
  constructor(private http: HttpClient) {
    this.apiUrl = this.apiUrl + "/students";
  }
  
  public findAll(): Observable<Student> {
    return this.http.get<Student>(this.apiUrl);
  }
  
  public findById(studentId: number): Observable<Student> {
    return this.http.get<Student>(this.apiUrl + "/" + studentId);
  }
  
  public save(student: Student): Observable<Student> {
    return this.http.post<Student>(this.apiUrl, student);
  }
  
  public update(student: Student): Observable<Student> {
    return this.http.put<Student>(this.apiUrl, student);
  }
  
  public deleteById(studentId: number): Observable<any> {
    return this.http.delete<any>(this.apiUrl + "/" + studentId);
  }
  
  
  
}





