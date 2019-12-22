import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibregisterComponent } from './libregister.component';

describe('LibregisterComponent', () => {
  let component: LibregisterComponent;
  let fixture: ComponentFixture<LibregisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibregisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
