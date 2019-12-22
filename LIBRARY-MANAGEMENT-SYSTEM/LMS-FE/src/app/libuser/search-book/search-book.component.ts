import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {

  myBook;
  constructor(private loginService: LoginService, private router : Router ) { }

  getBook(id) {
    this.loginService.getData(id).subscribe(res => {
      console.log(res);
      this.myBook = res.book;
    }, err => {
      console.log(err);
    });
  }
 
  deleteBook(id: any) {
    this.loginService.deleteBook(id).subscribe(res => {
      console.log(res);
      this.myBook = res.book;
      this.router.navigateByUrl('/libuser');
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
