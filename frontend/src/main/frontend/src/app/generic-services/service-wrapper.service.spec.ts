import { TestBed, inject } from '@angular/core/testing';

import { ServiceWrapperService } from './service-wrapper.service';

describe('ServiceWrapperService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ServiceWrapperService]
    });
  });

  it('should be created', inject([ServiceWrapperService], (service: ServiceWrapperService) => {
    expect(service).toBeTruthy();
  }));
});
