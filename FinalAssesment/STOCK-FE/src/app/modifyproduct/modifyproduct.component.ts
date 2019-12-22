import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-modifyproduct',
  templateUrl: './modifyproduct.component.html',
  styleUrls: ['./modifyproduct.component.css']
})
export class ModifyproductComponent implements OnInit {

  error: string;
  constructor(private auth: AuthService, private router: Router) { }

  modifyProduct(form: NgForm) {
    this.error = null;
    this.auth.modifyProduct(form.value).subscribe(res => {
      console.log('modifyproduct response', res);
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
