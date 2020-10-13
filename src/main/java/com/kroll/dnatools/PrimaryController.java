package com.kroll.dnatools;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        Run.setRoot("secondary");
    }
}
