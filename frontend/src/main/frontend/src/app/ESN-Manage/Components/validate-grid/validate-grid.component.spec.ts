import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ValidateGridComponent } from './validate-grid.component';

describe('ValidateGridComponent', () => {
  let component: ValidateGridComponent;
  let fixture: ComponentFixture<ValidateGridComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ValidateGridComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ValidateGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
