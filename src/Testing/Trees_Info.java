package Testing;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Trees_Info {
    public void SetTree(double x,double y,Rectangle t,String s){
        t.setLayoutX(x);
        t.setLayoutY(y);
        Image img1 = new Image(s,false);
        t.setFill(new ImagePattern(img1));
        t.setStroke(Color.DODGERBLUE);
        t.setStrokeWidth(0);
    }

    public void TreeTransition(TranslateTransition TR,Rectangle r,int i,int z){
        TR.setDuration(javafx.util.Duration.seconds(i));
        TR.setNode(r);
        TR.setToX(z);
        TR.setAutoReverse(false);
        TR.setCycleCount(1);
    }

}
