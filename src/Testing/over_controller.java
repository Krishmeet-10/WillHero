package Testing;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class over_controller {
    @FXML AnchorPane scene;
    public void gn(){
        Stage stage= (Stage) scene.getScene().getWindow();
        stage.close();
    }        
}
