package Testing;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class namecontroller {

    @FXML
    AnchorPane ap;
    @FXML
    private TextField inputname;
    @FXML
    private Button submit;

    static String name;

    public void submit(ActionEvent e) throws IOException{
        name = inputname.getText();
        System.out.println(name);
        startgame();
        Stage stage = (Stage) ap.getScene().getWindow();
        stage.close();
    }

    public void startgame() throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Testing/game.fxml"));
        Scene scene = new Scene(root);           
        stage.setScene(scene);  
        stage.show();
        stage.setResizable(false);
        stage.setTitle("Will Hero");        
        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon);      
    }

    public void read(String name2) {
    }
}
