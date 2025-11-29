import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ifelse } from './ifelse';

describe('Ifelse', () => {
  let component: Ifelse;
  let fixture: ComponentFixture<Ifelse>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ifelse]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ifelse);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
