import { Component, OnInit } from '@angular/core';
import { UserdataService } from '../userdata.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  userData: any;

  constructor(private userDataService: UserdataService) { }

  ngOnInit(): void {
    this.userData = this.userDataService.getUserData();
  }

}
