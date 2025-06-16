module com.pmt.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;


    opens com.pmt.quizapp to javafx.fxml;
    exports com.pmt.quizapp;
}
