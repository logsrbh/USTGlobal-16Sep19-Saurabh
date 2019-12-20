import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { RouterModule, Router } from '@angular/router';

@Component({
  selector: 'app-addproducts',
  templateUrl: './addproducts.component.html',
  styleUrls: ['./addproducts.component.css']
})
export class AddproductsComponent implements OnInit {

  constructor(private service:AuthService,private router:Router) { }

  ngOnInit() {
  }
  
  addProduct(form:NgForm) {
    return this.service.addproduct(form.value).subscribe(
      (data) => {
        console.log(data.userBean);
        localStorage.setItem('details:', JSON.stringify(data));
        console.log(data);
        this.router.navigateByUrl("/products")
    },
      (error) => { console.log('some error'); },
    );
  }

}
