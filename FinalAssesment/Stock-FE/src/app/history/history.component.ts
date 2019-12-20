import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

const user=JSON.parse(localStorage.getItem('details'));
@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.css']
})

export class HistoryComponent implements OnInit {
products;
orders;
  constructor(private service:AuthService) { this.viewProduct();
  this.viewCart();}

  ngOnInit() {}

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
  viewCart() {
    return this.service.viewcart().subscribe(
      (data) => {
        console.log(data.userBean);
        localStorage.setItem('cart:', JSON.stringify(data));
        this.orders=data.orderBean;
        console.log(data);
      
    },
      (error) => { console.log('some error'); },
    );
  }

}
