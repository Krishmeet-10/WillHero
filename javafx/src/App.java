
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,600,600,Color.SKYBLUE);
        Image icon = new Image("Wiki-background.jpg");

        Text heading = new Text();
        heading.setX(80);
        heading.setY(100);
        heading.setText("Will Hero");
        heading.setFont(Font.font("Arial",75));
        heading.setX(150);
        heading.setFill(Color.INDIANRED);
        root.getChildren().add(heading);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.SEAGREEN);
        rectangle.setWidth(200);
        rectangle.setHeight(150);
        rectangle.setX(200);
        rectangle.setY(250);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(10);
        //root.getChildren().add(rectangle);

        Image png= new Image("Wiki-background.jpg");
        ImageView view = new ImageView(png);
        view.setX(175);
        view.setY(225);
        root.getChildren().add(view);

        stage.getIcons().add(icon);        
        stage.setScene(scene);
        stage.setTitle("Will Hero");
        stage.show();

    }
}