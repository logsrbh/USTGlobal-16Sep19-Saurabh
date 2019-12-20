import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(myService: ProductService) {
    console.log('Hi From ProductComponent');
    myService.getData().subscribe(responseData => {
      console.log('This is my data');
      console.log(responseData);
      //this.products = responseData;
    },error => {console.log(error);
    });
    console.log('subscription ended');
   }

  ngOnInit() {
  }

}
