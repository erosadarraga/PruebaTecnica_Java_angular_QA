import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlexLayoutModule } from '@angular/flex-layout';
import { CreateSpaceshipComponent } from './pages/create-spaceship/create-spaceship.component';
import { SpaceshipComponent } from './pages/spaceship/spaceship.component';
import { SpaceshipsListComponent } from './pages/spaceships-list/spaceships-list.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './pages/home/home.component';
import { MaterialModule } from '../material/material.module';
import { SpaceshipCardComponent } from './components/spaceship-card/spaceship-card.component';



@NgModule({
  declarations: [
    CreateSpaceshipComponent,
    SpaceshipComponent,
    SpaceshipsListComponent,
    HomeComponent,
    SpaceshipCardComponent
  ],
  imports: [
    CommonModule,
    FlexLayoutModule,
    AppRoutingModule,
    MaterialModule
  ]
})
export class SpaceshipsModule { }
