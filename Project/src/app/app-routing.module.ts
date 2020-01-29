import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from './admin/login/login.component';
import { SignupComponent } from './admin/signup/signup.component';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
{ path: '',redirectTo:'home',pathMatch:'full'}, 
{ path: 'user', component: UserComponent},
{ path: 'login', component: LoginComponent},
{ path: 'signup', component: SignupComponent},
{ path:'home',component: HomeComponent},
{ path: ' ',component:AppComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
