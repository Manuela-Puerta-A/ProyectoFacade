package co.edu.uniquindio.presupuestoejemplo.proyectofacade;


import co.edu.uniquindio.presupuestoejemplo.proyectofacade.api.HotelAPI;
import co.edu.uniquindio.presupuestoejemplo.proyectofacade.api.AvionAPI;
import co.edu.uniquindio.presupuestoejemplo.proyectofacade.api.VideoApi;

public class CheckFacade {
	private VideoApi videoApi;
	//private AvionAPI avionAPI;
	//private HotelAPI hotelAPI;
	
	public CheckFacade() {
		videoApi = new VideoApi();
		videoApi.buscarVideoApi(videoApi.getNombrevideo(), videoApi.getPeso());
		//avionAPI = new AvionAPI();
		//hotelAPI = new HotelAPI();
	}


	//public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		//avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		//hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	//}
}
