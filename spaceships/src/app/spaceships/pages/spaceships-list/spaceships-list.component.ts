import { Component, OnInit } from '@angular/core';
import { SpaceshipService } from '../../services/spaceship.service';
import { SpaceshipInterface } from '../../interface/spaceships.interface';

@Component({
  selector: 'app-spaceships-list',
  templateUrl: './spaceships-list.component.html',
  styleUrls: ['./spaceships-list.component.css']
})
export class SpaceshipsListComponent implements OnInit {

  spaceships: SpaceshipInterface[] = [];


  constructor(private spaceshipsService: SpaceshipService) { }
  ngOnInit(): void {

    this.spaceshipsService.getMannedSpacecraft().subscribe(resp => this.spaceships = this.spaceships.concat(resp));
    console.log(this.spaceships);
    this.spaceshipsService.getShuttleVehicle().subscribe(resp => this.spaceships = this.spaceships.concat(resp));
    this.spaceshipsService.getUnmannedSpaceship().subscribe(resp => this.spaceships = this.spaceships.concat(resp));
  }

}
