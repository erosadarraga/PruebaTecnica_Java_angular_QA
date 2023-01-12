import { Component, Input, OnInit } from '@angular/core';
import { SpaceshipInterface } from '../../interface/spaceships.interface';
import { SpaceshipService } from '../../services/spaceship.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-spaceship-card',
  templateUrl: './spaceship-card.component.html',
  styleUrls: ['./spaceship-card.component.css']
})
export class SpaceshipCardComponent implements OnInit {

  constructor(private spaceshipService: SpaceshipService, private router: Router) {

  }

  deleteById() {
    if (this.spaceship == null) { return; }
    this.spaceshipService.deleteById(this.spaceship.id, this.spaceship.typespaceship).subscribe()
    this.router.navigate(['/spaceship'])
  }
  @Input() spaceship!: SpaceshipInterface;
  ngOnInit(): void {

  }

}
