import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-liblogin',
  templateUrl: './liblogin.component.html',
  styleUrls: ['./liblogin.component.css']
})
export class LibloginComponent implements OnInit {
  error: string;

  constructor(private auth: AuthService, private router: Router) { }

  liblogin(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.libloginUser(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.description === 'Login Successfully') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/libuser');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
