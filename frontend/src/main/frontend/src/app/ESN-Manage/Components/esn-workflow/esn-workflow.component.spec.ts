import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EsnWorkflowComponent } from './esn-workflow.component';

describe('EsnWorkflowComponent', () => {
  let component: EsnWorkflowComponent;
  let fixture: ComponentFixture<EsnWorkflowComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EsnWorkflowComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EsnWorkflowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
