import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLchecker extends Application {    

    @Override
    public void start(Stage primarystage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
            Scene scene = new Scene(root,400,400);
            primarystage.setScene(scene);
            primarystage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
