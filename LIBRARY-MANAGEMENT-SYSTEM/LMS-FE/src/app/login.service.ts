import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root'
  })

export class LoginService {
    constructor(private http: HttpClient) {}

    getData(id): Observable<any> {
        return this.http.get<any>(`http://localhost:8080/lms/searchbook?id=${id}`);
      }

    addBook(data): Observable<any> {
        return this.http.post('http://localhost:8080/lms/addbook', data);
    }

    getAllBook(): Observable<any> {
      return this.http.get<any>('http://localhost:8080/lms/show');
    }

    deleteBook(id: any): Observable<any> {
      return this.http.delete<any>(`http://localhost:8080/lms/delete?id=${id}`);
    }

    updateBook(book: any): Observable<any> {
      return this.http.put<any>('http://localhost:8080/lms/updatebook', book);
    }

    }
