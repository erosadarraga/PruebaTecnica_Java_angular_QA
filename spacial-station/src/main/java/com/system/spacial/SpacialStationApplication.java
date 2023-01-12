package com.system.spacial;


import com.system.spacial.model.MannedSpacecraft;
import com.system.spacial.model.ShuttleVehicle;
import com.system.spacial.model.UnmannedSpaceship;
import com.system.spacial.repository.MannedSpacecraftRepository;
import com.system.spacial.service.MannedSpacecraftService;
import com.system.spacial.service.ShuttleVehicleService;
import com.system.spacial.service.UnmannedSpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpacialStationApplication implements CommandLineRunner {

	@Autowired
	private MannedSpacecraftService mannedSpacecraftService;
	@Autowired
	private ShuttleVehicleService shuttleVehicleService;
	@Autowired
	private UnmannedSpaceshipService unmannedSpaceshipService;

	public static void main(String[] args) {
		SpringApplication.run(SpacialStationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MannedSpacecraft mannedSpacecraft = new MannedSpacecraft();
		mannedSpacecraft.setTypespaceship("Nave espacial tripulada");
		mannedSpacecraft.setName("Atlantis mannedSpacecraft");
		mannedSpacecraft.setDescription("El transbordador espacial Atlantis (designación NASA: OV-104) fue uno de los transbordadores de la flota perteneciente");
		mannedSpacecraft.setImg("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/STS132_Atlantis_undocking2_%28cropped%29.jpg/220px-STS132_Atlantis_undocking2_%28cropped%29.jpg");
		MannedSpacecraft mannedSpacecraftSave = mannedSpacecraftService.saveMannedSpacecraft(mannedSpacecraft);

		ShuttleVehicle shuttleVehicle = new ShuttleVehicle();
		shuttleVehicle.setTypespaceship("Transbordador espacial");
		shuttleVehicle.setName("Solid Rocket Boosters");
		shuttleVehicle.setDescription(" Los dos Solid Rocket Boosters (SRB), que proporcionaban el 80 por ciento del empuje de lanzamiento. • El enorme tanque externo.");
		shuttleVehicle.setImg("https://www.nasa.gov/images/content/106911main_shuttle_system_120.jpg");
		ShuttleVehicle shuttleVehicleSave = shuttleVehicleService.saveShuttleVehicle(shuttleVehicle);


		UnmannedSpaceship unmannedSpaceship = new UnmannedSpaceship();
		unmannedSpaceship.setTypespaceship("Nave espacial no tripulada");
		unmannedSpaceship.setName("El vehículo de transferencia H-II japoné");
		unmannedSpaceship.setDescription("El HTV tiene unos 9,2 m de largo (incluyendo los propulsores de maniobra del final) y 4,4 m de diámetro. Vacío, pesa 10,5 toneladas");
		unmannedSpaceship.setImg("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/HTV-1_approaches_ISS.jpg/285px-HTV-1_approaches_ISS.jpg");
		UnmannedSpaceship unmannedSpaceshipSave = unmannedSpaceshipService.saveUnmannedSpaceship(unmannedSpaceship);
	}
}
