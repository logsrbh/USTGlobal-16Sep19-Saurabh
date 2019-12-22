import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-searchproduct',
  templateUrl: './searchproduct.component.html',
  styleUrls: ['./searchproduct.component.css']
})
export class SearchproductComponent implements OnInit {

  searchbyname;
  product;
  constructor(private http: HttpClient) { }

  getProduct() {
    this.http.get<any>(`http://localhost:8080/searchbyname/${this.searchbyname}`).subscribe(data => {
      this.product = data.Search;
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data got successfully');
    });
  }
  ngOnInit() {
  }

}
