import { TestBed } from '@angular/core/testing';

import { ServiceConectionService } from './service-conection.service';

describe('ServiceConectionService', () => {
  let service: ServiceConectionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceConectionService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
