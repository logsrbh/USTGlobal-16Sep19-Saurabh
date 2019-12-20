import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
products
  constructor(private service:AuthService,private router:Router) {this.viewCart() }
  ngOnInit() {
  }
  
  viewCart() {
    return this.service.viewcart().subscribe(
      (data) => {
        console.log(data.userBean);
        localStorage.setItem('cart:', JSON.stringify(data));
        this.products=data.orderBean;
        this.router.navigateByUrl("/cart");
        console.log(data);
      
    },
      (error) => { console.log('some error'); },
    );
  }

}
