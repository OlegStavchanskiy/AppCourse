module ch.makery.lab4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.bind;


    opens ch.makery.lab4 to javafx.fxml;
    exports ch.makery.lab4;
}