import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserdataService } from '../userdata.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email ='';
  password = '';
  userData: any;
  constructor(private router: Router, private userDataService: UserdataService) { }

  ngOnInit() {
  }

  login(): void {
    const userData = this.userDataService.getUserData();

    if (userData && userData.email === this.email && userData.password === this.password) {
      this.router.navigate(['/profile']);
    } else {
      alert('Invalid Credentials');
    }
  }

}
