import { Component, OnInit,Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
      //  @Input() messageFromParent:string;
      showElement='false';
      //  message='hello from child';
      //  @Output() childMessage=new EventEmitter<string>();
      
		inpvalue: number = 3;    
  constructor() { }

  ngOnInit() {
    // this.childMessage.emit(this.message);
  }

}
