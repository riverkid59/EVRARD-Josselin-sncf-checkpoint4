import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifCarteComponent } from './modif-carte.component';

describe('ModifCarteComponent', () => {
  let component: ModifCarteComponent;
  let fixture: ComponentFixture<ModifCarteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModifCarteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifCarteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
