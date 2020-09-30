import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { trainingprogramComponent } from './trainingprogram.component';

describe('trainingprogramComponent', () => {
  let component: trainingprogramComponent;
  let fixture: ComponentFixture<trainingprogramComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ trainingprogramComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(trainingprogramComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
