import { Component } from '@angular/core';
import { Admin } from './models/admin';
// import { getMaxListeners } from 'cluster';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myStockExchange';
 admin=new Admin('vaishnavi','balevaish@gmail.com',4655452556,'vaish','vaish5');
}
