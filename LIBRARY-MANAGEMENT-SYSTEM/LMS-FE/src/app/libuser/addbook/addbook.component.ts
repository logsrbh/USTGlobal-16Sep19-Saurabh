import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LoginService } from 'src/app/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit, OnDestroy {
  error: string;

  constructor(private auth: LoginService, private router: Router) { }

  addBook(form: NgForm) {
    this.error = null;
    this.auth.addBook(form.value).subscribe(res => {
      console.log('addbook response', res);
      this.router.navigateByUrl('/libuser');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }

  ngOnInit() {
  }


  ngOnDestroy() {

  }

}
