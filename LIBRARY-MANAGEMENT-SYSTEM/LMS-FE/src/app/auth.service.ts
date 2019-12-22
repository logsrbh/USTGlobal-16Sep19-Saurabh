import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/lms/registerstud', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post(
      'http://localhost:8080/lms/student/login',
      user);
  }
  libloginUser(user): Observable<any> {
    return this.http.post(
      'http://localhost:8080/lms/librarian/login',
      user);
  }

  libregisterUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/lms/registerlib', user);
  }


}
