package Testing;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Orc {

    public void Orc_define(Rectangle orc1,int x,int y,String l){
        orc1.setLayoutX(x);
        orc1.setLayoutY(y);
        Image img78 = new Image(l,false);
        orc1.setFill(new ImagePattern(img78));
        orc1.setStroke(Color.RED);
        orc1.setStrokeWidth(0);
    }

    public void Orc_movement(TranslateTransition move_orc1,Rectangle orc1){
        move_orc1.setDuration(javafx.util.Duration.seconds(4));     
        move_orc1.setNode(orc1);   
        move_orc1.setToX(-1600);
        move_orc1.setAutoReverse(false);
        move_orc1.setCycleCount(1);
    }

    public void Orc_jump_movement(TranslateTransition jump_orc1,Rectangle orc1){
        jump_orc1.setDuration(javafx.util.Duration.seconds(0.5));     
        jump_orc1.setNode(orc1);   
        jump_orc1.setToY(-40);
        jump_orc1.setAutoReverse(true);
        jump_orc1.setCycleCount(TranslateTransition.INDEFINITE);
        jump_orc1.play();
    }

    public void Orc_Dying_anim(TranslateTransition orc_dying1,Rectangle orc1){
        orc_dying1.setDuration(javafx.util.Duration.seconds(2));     
        orc_dying1.setNode(orc1);   
        orc_dying1.setToY(+600);
        orc_dying1.setAutoReverse(false);
        orc_dying1.setCycleCount(1);
    }

}
