import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { throws } from 'assert';

const headeroption = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
@Injectable({
  providedIn: 'root'
})

export class AuthService {
  
  constructor(private http: HttpClient) { }

  addproduct(user): Observable<any> {
    return this.http.post('http://localhost:8081/addproduct', user);
  }
  
  deleteproduct(id): Observable<any> {
    return this.http.delete(`http://localhost:8081/delete/${id}`,headeroption);
  }
  addtocart(price) : Observable<any>
  {
    return this.http.post(`http://localhost:8081/addproducttocart/${price}`,price );
  }

  loginUser(user): Observable<any> {
    return this.http.post(
      'http://localhost:8081/login',
      user);
  }
  updateproduct(user)
  {
    return this.http.post('http://localhost:8081/modifyproduct', user);
    
  }
  viewproduct():Observable<any>
  {
    return this.http.get('http://localhost:8081/getallproducts');
  }
  
  viewcart():Observable<any>
  {
    return this.http.get('http://localhost:8081/viewcart');
  }
}
