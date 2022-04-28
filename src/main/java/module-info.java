module com.example.examentienda {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.examentienda to javafx.fxml;
    exports com.example.examentienda;
    exports com.example.examentienda.Controller;
    opens com.example.examentienda.Controller to javafx.fxml;
    exports com.example.examentienda.View;
    opens com.example.examentienda.View to javafx.fxml;
}