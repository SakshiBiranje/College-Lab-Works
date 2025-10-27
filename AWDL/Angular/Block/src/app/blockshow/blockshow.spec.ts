import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Blockshow } from './blockshow';

describe('Blockshow', () => {
  let component: Blockshow;
  let fixture: ComponentFixture<Blockshow>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Blockshow]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Blockshow);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
