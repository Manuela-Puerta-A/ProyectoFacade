module co.edu.uniquindio.proyectofacade {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens co.edu.uniquindio.proyectofacade to javafx.fxml;
    exports co.edu.uniquindio.proyectofacade;

    opens co.edu.uniquindio.proyectofacade.ViewControllers to javafx.fxml;
    exports co.edu.uniquindio.proyectofacade.ViewControllers;

    exports co.edu.uniquindio.proyectofacade.videoCo;
    opens co.edu.uniquindio.proyectofacade.videoCo to javafx.fxml;

    exports co.edu.uniquindio.proyectofacade.videoCo.interfaces;
}