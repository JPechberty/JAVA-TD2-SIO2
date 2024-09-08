module com.courses.javatd2sio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.courses.javatd2sio2 to javafx.fxml;
    exports com.courses.javatd2sio2;
}