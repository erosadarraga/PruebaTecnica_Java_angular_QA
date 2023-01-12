import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpaceshipCardComponent } from './spaceship-card.component';

describe('SpaceshipCardComponent', () => {
  let component: SpaceshipCardComponent;
  let fixture: ComponentFixture<SpaceshipCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SpaceshipCardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SpaceshipCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
