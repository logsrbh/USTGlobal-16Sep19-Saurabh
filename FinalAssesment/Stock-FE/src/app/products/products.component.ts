import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
products;
  constructor(private service:AuthService,private router:Router) {this.viewProduct(); }
  
  ngOnInit() {
  }

  viewProduct() {
    return this.service.viewproduct().subscribe(
      (data) => {
        console.log(data.userBean);
        localStorage.setItem('details:', JSON.stringify(data));
        this.products=data.productBean;
        console.log(data);
    },
      (error) => { console.log('some error'); },
    );
  }
  delete(product)
  {
    return this.service.deleteproduct(product.id).subscribe(
      (data) => {
        console.log(data.userBean);
        localStorage.setItem('details:', JSON.stringify(data));
        this.products=data.productBean;
        console.log(data);
        this.router.navigateByUrl("/products");
    },
      (error) => { console.log('some error'); },
    );
  }
  
  addtocart(product)
  {
    return this.service.addtocart(product.price).subscribe(
      (data) => {
        localStorage.setItem('details:', JSON.stringify(data));
        this.products=data.productBean;
        alert("product added to cart!!");
        console.log(data);
        this.router.navigateByUrl("/products");
    },
      (error) => { console.log('some error'); },
    );
  }
}
