package Testing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage; 

public class Game extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("game.fxml"));
        Scene scene = new Scene(root);           
        stage.setScene(scene);  
        stage.show();
        stage.setResizable(true);
        stage.setTitle("Will Hero");        
        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
