import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updateproducts',
  templateUrl: './updateproducts.component.html',
  styleUrls: ['./updateproducts.component.css']
})
export class UpdateproductsComponent implements OnInit {

  constructor(private service:AuthService,private router:Router) { }

  ngOnInit() {
  }
  modifyProduct(form:NgForm) {
    return this.service.updateproduct(form.value).subscribe(
      (data) => {
        console.log(data);
        localStorage.setItem('details:', JSON.stringify(data));
        console.log(data);
        this.router.navigateByUrl("/products")
    },
      (error) => { console.log('some error'); },
    );
  }
}
