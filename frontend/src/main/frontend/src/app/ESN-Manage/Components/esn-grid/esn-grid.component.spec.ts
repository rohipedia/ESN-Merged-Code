import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EsnGridComponent } from './esn-grid.component';

describe('EsnGridComponent', () => {
  let component: EsnGridComponent;
  let fixture: ComponentFixture<EsnGridComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EsnGridComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EsnGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
