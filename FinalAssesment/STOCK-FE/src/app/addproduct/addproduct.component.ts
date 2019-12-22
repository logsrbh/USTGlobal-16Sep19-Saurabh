import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  error: string;

  constructor(private auth: AuthService, private router: Router) { }
  addProduct(form: NgForm) {
    this.error = null;
    this.auth.addProduct(form.value).subscribe(res => {
      console.log('addproduct response', res);
      this.router.navigateByUrl('/user');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }

  ngOnInit() {
  }

}
