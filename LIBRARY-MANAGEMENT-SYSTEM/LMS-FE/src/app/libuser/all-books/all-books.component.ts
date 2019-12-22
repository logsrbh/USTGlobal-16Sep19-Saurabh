import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/login.service';
import { Router } from '@angular/router';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-all-books',
  templateUrl: './all-books.component.html',
  styleUrls: ['./all-books.component.css']
})
export class AllBooksComponent implements OnInit {

  myBook;
  book: any = [];
  constructor(private loginService: LoginService, private router: Router ) {
    this.getBook();
  }

  getBook() {
    this.loginService.getAllBook().subscribe(res => {
      this.book = res.book as string [];
      console.log('res', res);
      console.log(this.book);
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
