package co.edu.uniquindio.proyectofacade.api;

import java.util.List;

public class VideoApi {
    private String nombrevideo;
    private int peso;

    public VideoApi(String nombrevideo, int peso) {
        this.nombrevideo = nombrevideo;
        this.peso = peso;
    }
    public VideoApi(){

    }

    public void buscarVideoApi(List<VideoApi> listaVideos, String nombreVideo) {
        for (VideoApi video : listaVideos) {
            if (video.getNombrevideo().equalsIgnoreCase(nombreVideo)) {
                System.out.println("Video encontrado: " + video.getNombrevideo() + " - Peso: " + video.getPeso() + "MB");
                return;
            }
        }
        System.out.println("Video no encontrado.");
    }

    public String getNombrevideo() {
        return nombrevideo;
    }

    public void setNombrevideo(String nombrevideo) {
        this.nombrevideo = nombrevideo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
