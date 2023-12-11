module es.ieslosmontecillos.checkboxjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.checkboxjavafx to javafx.fxml;
    exports es.ieslosmontecillos.checkboxjavafx;
}