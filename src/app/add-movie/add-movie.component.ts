import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { from } from 'rxjs';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {
  get movie() {
    return this.form.get('movie');
  }

  get moviet() {
    return this.form.get('moviet');
  }
  get movieu() {
    return this.form.get('movieu');
  }


  form = new FormGroup({
    movie: new FormControl('', [Validators.required]),
    moviet: new FormControl('', [Validators.required]),
    movieu: new FormControl('', [Validators.required]),
  })
  constructor() { }

  ngOnInit() {
  }
  addMovie(form){
    console.log(form)
  }


}
