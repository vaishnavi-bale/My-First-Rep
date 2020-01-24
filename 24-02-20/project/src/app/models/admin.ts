export class Admin {
   
    firstName: string
    email: string;
    phone: number;
    userName: string;
    password: string;
    constructor(firstName: string,email: string,phone: number,userName: string,pass: string){
        
        this.firstName=firstName;
        this.email=email;
        this.phone=phone;
        this.userName=userName;
        this.password=pass;
    }
}