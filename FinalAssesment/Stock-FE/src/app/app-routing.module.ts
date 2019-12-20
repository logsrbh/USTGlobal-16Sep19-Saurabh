import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';
import { ProductsComponent } from './products/products.component';
import { AddproductsComponent } from './addproducts/addproducts.component';
import { UpdateproductsComponent } from './updateproducts/updateproducts.component';
import { CartComponent } from './cart/cart.component';
import { HistoryComponent } from './history/history.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  {
    path: 'products', component: ProductsComponent,
  },{
    path: 'addproducts', component: AddproductsComponent,
  },{
    path: 'modifyproducts', component: UpdateproductsComponent,
  },
  {
    path: 'cart', component: CartComponent,
  },
  {
    path: 'history', component: HistoryComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
