import { StudentService } from './../service/student.service';
import { Component, OnInit } from '@angular/core';
import { Student } from '../model/dto/student';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  
  public students: Student[];
  public student: Student;
  
  constructor(private studentService: StudentService) {
    
  }
  
  ngOnInit(): void {
    this.findAll();
  }
  
  public findAll() : void {
    this.studentService.findAll().subscribe(
      (students: Student[]) => {
        this.students = students;
      },
      (error: HttpErrorResponse) => {
        console.log(error.message);
      }
    );
  }
  
  public findById(studentId: number) : void {
    this.studentService.findById(studentId).subscribe(
      (student: Student) => {
        this.student = student;
      },
      (error: HttpErrorResponse) => {
        console.log(error.message);
      }
    );
  }
  
  
  
}



