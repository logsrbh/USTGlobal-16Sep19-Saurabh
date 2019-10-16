import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { from } from 'rxjs';
import { compileBaseDefFromMetadata } from '@angular/compiler';
import { MovieComponent } from './movie/movie.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { LoginComponent } from './login/login.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MovieComponent,
    AddMovieComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'movie', component: MovieComponent },
      { path: 'add-movie', component: AddMovieComponent },
      { path: 'login', component: LoginComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
