
import { School } from './school';

export class Student {
	
	public studentId: number;
	public firstName: string;
	public lastName: string;
	public imageUrl: string;
	public enterDate: Date;
	public email: string;
	public phone: string;
	public school: School;
	
	public constructor(studentId: number, firstName: string, lastName: string, imageUrl: string, enterDate: Date, email: string, phone: string, school: School) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.imageUrl = imageUrl;
		this.enterDate = enterDate;
		this.email = email;
		this.phone = phone;
		this.school = school;
	}
	
	
	
}



