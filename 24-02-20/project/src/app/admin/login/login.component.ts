import { Component, OnInit } from '@angular/core';
import { Admin } from 'src/app/models/admin';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }
  admin = new Admin('vaishnavi','vaish@gmail.com',254513241,'vaish','vaish5');
  ngOnInit() {
  }
  submit(){
    alert('Registered Succesfully \n Welcome'+this.admin.userName );
  }

}
