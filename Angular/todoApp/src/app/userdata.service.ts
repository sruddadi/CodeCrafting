import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserdataService {

  private userData: any;
constructor() { }

  saveUserData(userData: any): void {
    this.userData = userData;
  }

  getUserData(): any {
    return this.userData;
  }

}
