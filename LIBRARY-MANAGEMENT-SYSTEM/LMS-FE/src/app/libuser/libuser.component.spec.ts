import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibuserComponent } from './libuser.component';

describe('LibuserComponent', () => {
  let component: LibuserComponent;
  let fixture: ComponentFixture<LibuserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibuserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
