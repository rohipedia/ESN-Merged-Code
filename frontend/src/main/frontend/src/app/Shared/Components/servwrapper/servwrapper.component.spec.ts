import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServwrapperComponent } from './servwrapper.component';

describe('ServwrapperComponent', () => {
  let component: ServwrapperComponent;
  let fixture: ComponentFixture<ServwrapperComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServwrapperComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServwrapperComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
