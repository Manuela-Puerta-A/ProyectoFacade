module co.edu.uniquindio.presupuestoejemplo.proyectofacade {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.presupuestoejemplo.proyectofacade to javafx.fxml;
    exports co.edu.uniquindio.presupuestoejemplo.proyectofacade;
}