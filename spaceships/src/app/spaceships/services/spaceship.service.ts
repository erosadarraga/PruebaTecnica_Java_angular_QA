import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SpaceshipInterface } from '../interface/spaceships.interface';

@Injectable({
  providedIn: 'root'
})
export class SpaceshipService {

  constructor(private http: HttpClient) { }
  private DatosAll: SpaceshipInterface[];

  getMannedSpacecraft(): Observable<SpaceshipInterface[]> {
    return this.http.get<SpaceshipInterface[]>("http://localhost:8080/mannedSpacecraft/")
  }
  getShuttleVehicle(): Observable<SpaceshipInterface[]> {
    return this.http.get<SpaceshipInterface[]>("http://localhost:8080/shuttleVehicle/")
  }
  getUnmannedSpaceship(): Observable<SpaceshipInterface[]> {
    return this.http.get<SpaceshipInterface[]>("http://localhost:8080/unmannedSpaceship/")
  }

  getByIdSpaceship(id: string, id2: string): Observable<SpaceshipInterface> {
    switch (id2) {
      case "Nave espacial tripulada": return this.http.get<SpaceshipInterface>(`http://localhost:8080/mannedSpacecraft/${id}`)

      case "Nave espacial no tripulada": return this.http.get<SpaceshipInterface>(`http://localhost:8080/unmannedSpaceship/${id}`)

      case "Transbordador espacial": return this.http.get<SpaceshipInterface>(`http://localhost:8080/shuttleVehicle/${id}`)


      default:
        break;
    }

  }

  deleteById(id: number, id2: string): Observable<SpaceshipInterface> {
    switch (id2) {
      case "Nave espacial tripulada": return this.http.delete<SpaceshipInterface>(`http://localhost:8080/mannedSpacecraft/${id}`)

      case "Nave espacial no tripulada": return this.http.delete<SpaceshipInterface>(`http://localhost:8080/unmannedSpaceship/${id}`)

      case "Transbordador espacial": return this.http.delete<SpaceshipInterface>(`http://localhost:8080/shuttleVehicle/${id}`)


      default:
        break;
    }

  }

}
