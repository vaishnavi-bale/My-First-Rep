import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';
import { User } from '../models/user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  users:User[];
  constructor(private homeService: HomeService) { }
  
  ngOnInit() {
    
    this.homeService.getAllUsers().subscribe(data => {
      this.users=data;
    })
  }
  
  }
