import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WelcomeStripComponent } from './welcome-strip.component';

describe('WelcomeStripComponent', () => {
  let component: WelcomeStripComponent;
  let fixture: ComponentFixture<WelcomeStripComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WelcomeStripComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WelcomeStripComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
