import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-libuser',
  templateUrl: './libuser.component.html',
  styleUrls: ['./libuser.component.css']
})
export class LibuserComponent implements OnInit {

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
