import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';
import { LibregisterComponent } from './libregister/libregister.component';
import { LibloginComponent } from './liblogin/liblogin.component';
import { LibuserComponent } from './libuser/libuser.component';
import { AddbookComponent } from './libuser/addbook/addbook.component';
import { SearchBookComponent } from './libuser/search-book/search-book.component';
import { AllBooksComponent } from './libuser/all-books/all-books.component';
import { UpdatebookComponent } from './libuser/updatebook/updatebook.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  {
    path: 'admin', component: AdminComponent,
    canActivate: [AuthGuard], data: { roles: ['admin'] }
  },
  {
    path: 'user', component: UserComponent,
    canActivate: [AuthGuard], data: { roles: ['admin', 'user'] }
  },
  { path: 'libuser', component: LibuserComponent,
    canActivate: [AuthGuard], data : { roles : ['libuser']}
  },


  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  { path: 'libregister', component: LibregisterComponent},
  { path: 'liblogin', component: LibloginComponent },
  { path: 'addbook', component: AddbookComponent},
  { path: 'searchBook', component: SearchBookComponent},
  { path: 'allBooks', component: AllBooksComponent},
  { path: 'updatebook', component: UpdatebookComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
