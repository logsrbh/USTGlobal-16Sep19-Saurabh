import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/login.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-updatebook',
  templateUrl: './updatebook.component.html',
  styleUrls: ['./updatebook.component.css']
})
export class UpdatebookComponent implements OnInit {

  error: string;
  constructor(private loginService: LoginService, private router: Router) { }

  updateBook(form: NgForm) {
    this.error = null;
    this.loginService.updateBook(form.value).subscribe(res => {
      console.log('Response',res);
      this.router.navigateByUrl('/libuser');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
