import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { enrollparticipantComponent } from './enrollparticipant.component';

describe('enrollparticipantComponent', () => {
  let component: enrollparticipantComponent;
  let fixture: ComponentFixture<enrollparticipantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ enrollparticipantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(enrollparticipantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
