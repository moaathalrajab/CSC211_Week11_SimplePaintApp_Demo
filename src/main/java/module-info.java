module com.mycompany.csc211_week11_simplepaintapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc211_week11_simplepaintapp to javafx.fxml;
    exports com.mycompany.csc211_week11_simplepaintapp;
}
