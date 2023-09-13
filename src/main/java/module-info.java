module com.georgiancollege.week02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.georgiancollege.week02 to javafx.fxml;
    exports com.georgiancollege.week02;
}