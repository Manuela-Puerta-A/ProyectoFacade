package co.edu.uniquindio.proyectofacade.videoCo.interfaces;

import co.edu.uniquindio.proyectofacade.videoCo.VideoAppWithoutFacade;
import co.edu.uniquindio.proyectofacade.videoCo.VideoFile;

public interface IVideoDecoder {
    void decode(VideoFile file, VideoAppWithoutFacade.Codec codec);

}
