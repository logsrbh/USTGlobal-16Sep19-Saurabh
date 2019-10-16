import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  movie;
  search;
  constructor(private http: HttpClient) { }


  getMovie() {
    this.http.get<any>(`http://www.omdbapi.com/?s=${this.search}&apikey=e7cc6362`).subscribe(data => {
      this.movie = data.Search;
    }, err => {
      console.log(err);
    }, () => {
      console.log("Data got successfully");
    })
  }

  ngOnInit() {
  }

}
