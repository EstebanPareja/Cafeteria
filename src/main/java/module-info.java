module co.edu.uniquindio.poo.cafeteriajfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;


    opens co.edu.uniquindio.poo.cafeteriajfx to javafx.fxml;
    exports co.edu.uniquindio.poo.cafeteriajfx;
}