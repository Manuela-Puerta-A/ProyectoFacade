package co.edu.uniquindio.proyectofacade.videoCo;

import co.edu.uniquindio.proyectofacade.api.VideoApi;
import co.edu.uniquindio.proyectofacade.videoCo.interfaces.ICodec;
import co.edu.uniquindio.proyectofacade.videoCo.interfaces.IVideoDecoder;
import co.edu.uniquindio.proyectofacade.videoCo.interfaces.IVideoPlayer;
import java.util.List;
public class VideoFacade implements ICodec, IVideoDecoder, IVideoPlayer {
    private VideoApi videoApi;
    private List<String> listaVideos;

    public VideoFacade() {
        videoApi = new VideoApi();


    }
    private boolean validarMP4(String nombreArchivo) {
        return nombreArchivo.toLowerCase().endsWith(".mp4");
    }

    @Override
    public void codec(VideoFile file, VideoAppWithoutFacade.Codec codec) {

    }

    @Override
    public void decode(VideoFile file, VideoAppWithoutFacade.Codec codec) {

    }

    @Override
    public void play(VideoFile file) {

    }
}

