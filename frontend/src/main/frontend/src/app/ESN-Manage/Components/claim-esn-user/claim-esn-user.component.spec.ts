import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ClaimEsnUserComponent } from './claim-esn-user.component';

describe('ClaimEsnUserComponent', () => {
  let component: ClaimEsnUserComponent;
  let fixture: ComponentFixture<ClaimEsnUserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ClaimEsnUserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ClaimEsnUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
