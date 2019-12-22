import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibloginComponent } from './liblogin.component';

describe('LibloginComponent', () => {
  let component: LibloginComponent;
  let fixture: ComponentFixture<LibloginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibloginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
