package Testing;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Hero {
    public void Define(Rectangle R){
        Image img = new Image("/Images/Helmet3.png",false);
        R.setFill(new ImagePattern(img));
        R.setStroke(Color.SKYBLUE);
        R.setLayoutX(150);
        R.setLayoutY(390);
        R.setStrokeWidth(0);
    }

    public void define_movement(TranslateTransition jump,Rectangle shape1){
        jump.setDuration(javafx.util.Duration.seconds(0.5));     
        jump.setNode(shape1);   
        jump.setToY(-100);    
        jump.setAutoReverse(true);    
        jump.setCycleCount(TranslateTransition.INDEFINITE);    
        jump.play();
    }

    public void Falling(TranslateTransition dying_anm,Rectangle shape1){
        dying_anm.setDuration(javafx.util.Duration.seconds(2));     
        dying_anm.setNode(shape1);   
        dying_anm.setToY(+600);
        dying_anm.setAutoReverse(false);
        dying_anm.setCycleCount(1);
    }
}
