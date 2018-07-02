import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EsnGridAdminComponent } from './esn-grid-admin.component';

describe('EsnGridAdminComponent', () => {
  let component: EsnGridAdminComponent;
  let fixture: ComponentFixture<EsnGridAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EsnGridAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EsnGridAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
