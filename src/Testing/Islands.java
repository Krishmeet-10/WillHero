package Testing;


import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Islands {
    public void SetIsland(double x,double y,Rectangle t,String s){
        t.setLayoutX(x);
        t.setLayoutY(y);
        Image img1 = new Image(s,false);
        t.setFill(new ImagePattern(img1));
        t.setStroke(Color.DODGERBLUE);
        t.setStrokeWidth(0);
    }

    public void transition(TranslateTransition TR,Rectangle r,int X,int seconds){
        TR.setDuration(javafx.util.Duration.seconds(seconds));     
        TR.setNode(r);   
        TR.setToX(X);
        TR.setAutoReverse(false);
        TR.setCycleCount(1);
    }
}
