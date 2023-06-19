/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { UserdataService } from './userdata.service';

describe('Service: Userdata', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [UserdataService]
    });
  });

  it('should ...', inject([UserdataService], (service: UserdataService) => {
    expect(service).toBeTruthy();
  }));
});
