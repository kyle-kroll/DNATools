module com.kroll.dnatools {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kroll.dnatools to javafx.fxml;
    exports com.kroll.dnatools;
}
