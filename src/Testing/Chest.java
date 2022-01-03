package Testing;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Chest {

        public void SetChest(double x,double y,Rectangle t,String s){
            t.setLayoutX(x);
            t.setLayoutY(y);
            Image img1 = new Image(s,false);
            t.setFill(new ImagePattern(img1));
            t.setStroke(Color.DODGERBLUE);
            t.setStrokeWidth(0);
        }

        public void chestTransition(TranslateTransition ct,Rectangle r,int x,int i){
            ct.setDuration(javafx.util.Duration.seconds(i));
            ct.setNode(r);
            ct.setToX(x);
            ct.setAutoReverse(false);
            ct.setCycleCount(1);
        }
}
