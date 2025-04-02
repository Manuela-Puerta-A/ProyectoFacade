package co.edu.uniquindio.presupuestoejemplo.proyectofacade;

import co.edu.uniquindio.presupuestoejemplo.proyectofacade.api.VideoApi;

public class CheckFacade {
	private VideoApi videoApi;

	public CheckFacade() {
		videoApi = new VideoApi();
		videoApi.buscarVideoApi(videoApi.getNombrevideo(), videoApi.getPeso());

	}

}
