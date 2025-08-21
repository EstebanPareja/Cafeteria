module co.edu.uniquindio.poo.cafeteriajfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens co.edu.uniquindio.poo.cafeteriajfx to javafx.fxml;
    exports co.edu.uniquindio.poo.cafeteriajfx;
}