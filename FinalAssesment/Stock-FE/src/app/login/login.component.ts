import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string;

  constructor(private auth: AuthService, private router: Router) { }

  login(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.bean.role === 'user') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/user');
      }else if(data&& data.bean.role==='admin')
      {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/admin');
      
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
