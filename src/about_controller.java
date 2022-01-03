import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class about_controller {
    @FXML
    Button exit;
    @FXML
    AnchorPane ap;

    Stage stage;
    
    public void Back(ActionEvent e){        
        
        stage= (Stage) ap.getScene().getWindow();
        stage.close();
            
    }
}
