package co.edu.uniquindio.presupuestoejemplo.proyectofacade;

import co.edu.uniquindio.presupuestoejemplo.proyectofacade.api.VideoApi;
import co.edu.uniquindio.presupuestoejemplo.proyectofacade.api.VideoApi;

public class VideoFacade {
    private VideoApi videoApi;

    public VideoFacade() {
        videoApi = new VideoApi();
        videoApi.buscarVideoApi(videoApi.getNombrevideo(), videoApi.getPeso());

    }

}

