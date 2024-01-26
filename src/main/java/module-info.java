module ru.misha.autificationfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ru.misha.autificationfx to javafx.fxml;
    exports ru.misha.autificationfx;
}