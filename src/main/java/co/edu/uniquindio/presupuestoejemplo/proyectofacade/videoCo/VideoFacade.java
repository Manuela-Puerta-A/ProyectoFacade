package co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo;

import co.edu.uniquindio.presupuestoejemplo.proyectofacade.api.VideoApi;

public class VideoFacade {
    private VideoApi videoApi;

    public VideoFacade() {
        videoApi = new VideoApi();
        videoApi.buscarVideoApi(videoApi.getNombrevideo(), videoApi.getPeso());

    }

}

