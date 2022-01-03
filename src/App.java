
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

//This is the main file to run game
public class App extends Application {
    public static void main(String[] args) {        
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mainpage1.fxml")); 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Will Hero");

        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.show();
    }
}