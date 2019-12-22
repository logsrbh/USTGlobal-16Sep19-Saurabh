import { LoginService } from './../login.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  myBook = null;

  constructor(private loginService: LoginService) { }

  getBook(id) {
    this.loginService.getData(id).subscribe(res => {
      console.log(res);
      this.myBook = res.book;
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
