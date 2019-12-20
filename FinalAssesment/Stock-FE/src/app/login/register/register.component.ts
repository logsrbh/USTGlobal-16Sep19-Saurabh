import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/student.service';
import { FormGroup, FormControl, FormArray } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  // constructor(private student: StudentService) { }

  // ngOnInit() {
  //   console.log(this.student.name);
  //   console.log(this.student.printData());
  // }

  registrationForm: FormGroup;

  constructor() { }

  ngOnInit() {

    this.registrationForm = new FormGroup({
      name: new FormControl(),
      email: new FormControl(),
      password: new FormControl(),
      skills: new FormArray([
        this.skillfield()
      ])
    });
  }

  skillfield() {
    return new FormGroup({
      skill: new FormControl(),
      rating: new FormControl()
    });
  }

  addSkill() {
    (this.registrationForm.get('skills') as FormArray).push(this.skillfield());
  }

  printForm() {
    console.log(this.registrationForm);
  }

  removeSkill(i: number) {
    (this.registrationForm.get('skills') as FormArray).removeAt(i);
  }

}