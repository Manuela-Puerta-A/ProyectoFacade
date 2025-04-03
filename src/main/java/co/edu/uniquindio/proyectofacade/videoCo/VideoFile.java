package co.edu.uniquindio.proyectofacade.videoCo;

public class VideoFile {
    private String filename;

    public VideoFile(String filename) {
        this.filename = filename;
        System.out.println("Archivo de video: " + filename + " cargado.");
    }
}
