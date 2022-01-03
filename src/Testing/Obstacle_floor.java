package Testing;

import javafx.animation.TranslateTransition;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Obstacle_floor {
    public void define_floor(Rectangle floor1,int x, int y){
        floor1.setLayoutX(x);
        floor1.setLayoutY(y);
        floor1.setStroke(Color.DODGERBLUE);
        floor1.setStrokeWidth(0);
    }

    public void breaking_properties(TranslateTransition Breakable_floor1,Rectangle floor1){
        Breakable_floor1.setDuration(javafx.util.Duration.seconds(5));     
        Breakable_floor1.setNode(floor1);   
        Breakable_floor1.setToX(-2000);
        Breakable_floor1.setAutoReverse(false);
        Breakable_floor1.setCycleCount(1);
    }

    public void caution_define(Label caution){
        caution.setLayoutX(1450);
        caution.setLayoutY(450);
    }

    public void caution_properties(TranslateTransition move_caution,Label caution){
        move_caution.setDuration(javafx.util.Duration.seconds(5));     
        move_caution.setNode(caution);   
        move_caution.setToX(-2000);
        move_caution.setAutoReverse(false);
        move_caution.setCycleCount(1);
    }
}
