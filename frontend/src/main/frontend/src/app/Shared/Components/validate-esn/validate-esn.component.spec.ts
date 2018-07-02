import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ValidateEsnComponent } from './validate-esn.component';

describe('ValidateEsnComponent', () => {
  let component: ValidateEsnComponent;
  let fixture: ComponentFixture<ValidateEsnComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ValidateEsnComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ValidateEsnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
