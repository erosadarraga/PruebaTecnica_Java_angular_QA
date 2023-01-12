
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ErrorPageComponent } from '../shared/error-page/error-page.component';


const routes: Routes = [
  {
    path: "spaceships",
    loadChildren: () => import("../spaceships/spaceships.module").then(m => m.SpaceshipsModule)
  },
  {
    path: "404 ",
    component: ErrorPageComponent
  },
  {
    path: "**",
    redirectTo: "spaceships"
  }
]

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
