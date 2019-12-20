import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
books;
userDetails;
  constructor(private service:AuthService) { }

  ngOnInit() {
  }
  
  // // viewBook() {
  // //   return this.service.viewuser().subscribe(
  // //     (data) => {
  // //       console.log(data.userBean);
  // //       localStorage.setItem('details:', JSON.stringify(data));
  // //       this.userDetails=data.userBean;
  // //       for(var i=0;i<5;i++)
  // //       {
  // //       if(data.userBean[i].role==='admin')
  // //       {
  // //         this.books = data.userBean;   
  // //       console.log(data);
  // //     }
     
  // //   }
  // //   },
  //     (error) => { console.log('some error'); },
  //   );
  // }
}
