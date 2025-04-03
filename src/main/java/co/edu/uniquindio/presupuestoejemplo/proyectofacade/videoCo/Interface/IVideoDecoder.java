package co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo.Interface;

import co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo.VideoAppWithoutFacade;
import co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo.VideoFile;

public interface IVideoDecoder {
    void decode(VideoFile file, VideoAppWithoutFacade.Codec codec);

}
