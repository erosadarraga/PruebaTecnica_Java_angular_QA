import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { switchMap } from 'rxjs/operators';
import { SpaceshipInterface } from '../../interface/spaceships.interface';
import { SpaceshipService } from '../../services/spaceship.service';

@Component({
  selector: 'app-spaceship',
  templateUrl: './spaceship.component.html',
  styleUrls: ['./spaceship.component.css']
})
export class SpaceshipComponent implements OnInit {
  spaceship!: SpaceshipInterface;
  constructor(private activatedRoute: ActivatedRoute,
    private spaceshipService: SpaceshipService, private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.params.pipe(switchMap(({ id, typespaceship }) => this.spaceshipService.getByIdSpaceship(id, typespaceship))).subscribe((spaceship) => this.spaceship = spaceship)
  }
  regresar() {
    this.router.navigate(['/spaceship'])
  }

}
