package co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo;



// Cliente que usa todo directamente
public class VideoAppWithoutFacade {
    public static void main(String[] args) {
        String filename = "pelicula.mp4";

        VideoFile file = new VideoFile(filename);
        Codec codec = new Codec("mp4");
        VideoDecoder decoder = new VideoDecoder();
        decoder.decode(file, codec);

        VideoPlayer player = new VideoPlayer();
        player.play(file);
    }
}


