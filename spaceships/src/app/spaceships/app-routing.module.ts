import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateSpaceshipComponent } from './pages/create-spaceship/create-spaceship.component';
import { SpaceshipComponent } from './pages/spaceship/spaceship.component';
import { SpaceshipsListComponent } from './pages/spaceships-list/spaceships-list.component';
import { HomeComponent } from './pages/home/home.component';

const routes: Routes = [
  {
    path: "",
    component: HomeComponent,
    children: [
      {
        path: "create-spaceship",
        component: CreateSpaceshipComponent
      },
      {
        path: "spaceship/:id/:typespaceship",
        component: SpaceshipComponent
      },
      {
        path: "spaceship-list",
        component: SpaceshipsListComponent
      },
      {
        path: "**",
        redirectTo: "spaceship-list"
      }
    ]
  }
]


@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
