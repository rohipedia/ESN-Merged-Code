import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ClaimEsnComponent } from './claim-esn.component';

describe('ClaimEsnComponent', () => {
  let component: ClaimEsnComponent;
  let fixture: ComponentFixture<ClaimEsnComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ClaimEsnComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ClaimEsnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
