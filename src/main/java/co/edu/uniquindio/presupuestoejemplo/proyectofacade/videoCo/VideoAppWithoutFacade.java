package co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo;

import co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo.Interface.ICodec;
import co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo.Interface.IVideoDecoder;
import co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo.Interface.IVideoPlayer;

// Cliente que usa todo directamente
public class VideoAppWithoutFacade {
    public void main(String[] args) {
        String filename = "pelicula.mp4";

        VideoFile file = new VideoFile(filename);
        Codec codec = new Codec("mp4");
        VideoDecoder decoder = new VideoDecoder();
        decoder.decode(file, codec);

        VideoPlayer player = new VideoPlayer();
        player.play(file);
    }
    public class Codec implements ICodec {
        public Codec(String type) {
            System.out.println("Códec " + type + " cargado.");
        }



        @Override
        public void codec(VideoFile file, Codec codec) {

        }
    }
    class VideoDecoder implements IVideoDecoder {
        public void decode(VideoFile file, Codec codec) {
            System.out.println("ingreso al metodo decode");
        }

        public String decodificar(VideoFile file, Codec codec) {
            String message = ("Decodificando " + file + " usando " + codec + "...");
            System.out.println(message);
            return message;
        }
    }


    class VideoPlayer implements IVideoPlayer {
        public void play(VideoFile file) {
            System.out.println("Reproduciendo " + file + "...");
        }
    }

}


