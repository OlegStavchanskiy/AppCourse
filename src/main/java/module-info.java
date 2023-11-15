module ch.makery.lab4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.bind;
    requires java.prefs;


    opens ch.makery.lab4 to javafx.fxml, java.xml.bind;
    exports ch.makery.lab4;
}