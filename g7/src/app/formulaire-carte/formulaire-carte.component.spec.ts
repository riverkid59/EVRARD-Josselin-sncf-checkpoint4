import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormulaireCarteComponent } from './formulaire-carte.component';

describe('FormulaireCarteComponent', () => {
  let component: FormulaireCarteComponent;
  let fixture: ComponentFixture<FormulaireCarteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormulaireCarteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormulaireCarteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
