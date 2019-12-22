import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { HeaderComponent } from './header/header.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { FooterComponent } from './footer/footer.component';
import { LibregisterComponent } from './libregister/libregister.component';
import { LibloginComponent } from './liblogin/liblogin.component';
import { LibuserComponent } from './libuser/libuser.component';
import { AddbookComponent } from './libuser/addbook/addbook.component';
import { SearchBookComponent } from './libuser/search-book/search-book.component';
import { AllBooksComponent } from './libuser/all-books/all-books.component';
import { UpdatebookComponent } from './libuser/updatebook/updatebook.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    AdminComponent,
    UserComponent,
    HeaderComponent,
    PageNotFoundComponent,
    FooterComponent,
    LibregisterComponent,
    LibloginComponent,
    LibuserComponent,
    AddbookComponent,
    SearchBookComponent,
    AllBooksComponent,
    UpdatebookComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
