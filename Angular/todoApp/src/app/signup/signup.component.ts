import { Component, OnInit } from '@angular/core';
import { UserdataService } from '../userdata.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  firstName = '';
  lastName = '';
  email = '';
  password = '';
  phone = '';
  dob = '';
  constructor(private userDataService: UserdataService) { }

  ngOnInit() {
  }

  signup(): void {
    const userData = {
      firstName: this.firstName,
      lastName: this.lastName,
      email: this.email,
      password: this.password,
      phone: this.phone,
      dob: this.dob
    };

    this.userDataService.saveUserData(userData);
  }

}
