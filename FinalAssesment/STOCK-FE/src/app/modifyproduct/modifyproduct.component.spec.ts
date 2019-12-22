import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyproductComponent } from './modifyproduct.component';

describe('ModifyproductComponent', () => {
  let component: ModifyproductComponent;
  let fixture: ComponentFixture<ModifyproductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifyproductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifyproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
