
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { SchoolComponent } from './school/school.component';
import { HttpClientModule } from '@angular/common/http';
import { StudentService } from './service/student.service';
import { SchoolService } from './service/school.service';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    SchoolComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    StudentService,
    SchoolService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
