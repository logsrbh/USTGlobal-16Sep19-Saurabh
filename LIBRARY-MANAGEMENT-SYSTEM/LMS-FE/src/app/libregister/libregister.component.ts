import { Component, OnInit, OnDestroy } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-libregister',
  templateUrl: './libregister.component.html',
  styleUrls: ['./libregister.component.css']
})
export class LibregisterComponent implements OnInit, OnDestroy {
  error: string;

  constructor(private auth: AuthService, private router: Router) { }
  

  libregister(form: NgForm) {
    this.error = null;
    this.auth.libregisterUser(form.value)
      .subscribe(res => {
        console.log('registration response', res);
        this.router.navigateByUrl('/liblogin');
        form.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }
  ngOnInit() {
  }


  ngOnDestroy() {
    this.error = null;
  }



}
