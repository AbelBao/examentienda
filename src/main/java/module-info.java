module com.example.examentienda {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.examentienda to javafx.fxml;
    exports com.example.examentienda;
}