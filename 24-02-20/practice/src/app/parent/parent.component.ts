import { Component, OnInit, IterableDiffers } from '@angular/core';
import { BoundElementProperty, InterpolationConfig } from '@angular/compiler';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']

})
export class ParentComponent implements OnInit {
    // message="hello to child";

    // messageFromChild:string;
    // setMessage(message:string){
    //   this.messageFromChild=message;
    // }
    applyBoldClass:boolean=true;
    applyItalicsClass:boolean=true;
    applyClasses(){
      let classes={
        boldClass:this.applyBoldClass,
        italicsClass:this.applyItalicsClass
      };
      return classes;
    }
  constructor() { }

  ngOnInit() {
  }

}
