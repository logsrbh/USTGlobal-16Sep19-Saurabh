import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/register', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post(
      'http://localhost:8080/login', user);
  }

  addProduct(data): Observable<any> {
    return this.http.post('http://localhost:8080/add', data);
  }

  modifyProduct(data): Observable<any> {
    return this.http.post('http://localhost:8080/modify', data);
  }



}
