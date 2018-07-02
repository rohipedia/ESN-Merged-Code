import { TestBed, inject } from '@angular/core/testing';

import { GetEsnserviceService } from './get-esnservice.service';

describe('GetEsnserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GetEsnserviceService]
    });
  });

  it('should be created', inject([GetEsnserviceService], (service: GetEsnserviceService) => {
    expect(service).toBeTruthy();
  }));
});
