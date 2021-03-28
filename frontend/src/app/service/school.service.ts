
import { School } from './../model/dto/school';
import { environment } from './../../environments/environment';

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SchoolService {
  
  private apiUrl: string = environment.apiUrl;
  
  constructor(private http: HttpClient) {
    this.apiUrl = this.apiUrl + "/schools";
  }
  
  public findAll(): Observable<School[]> {
    return this.http.get<School[]>(this.apiUrl);
  }
  
  public findById(schoolId: number): Observable<School> {
    return this.http.get<School>(this.apiUrl + schoolId);
  }
  
  public save(school: School): Observable<School> {
    return this.http.post<School>(this.apiUrl, school);
  }
  
  public update(school: School): Observable<School> {
    return this.http.put<School>(this.apiUrl, school);
  }
  
  public deleteById(schoolId: number): Observable<any> {
    return this.http.delete<any>(this.apiUrl + "/" + schoolId);
  }
  
  
  
}




