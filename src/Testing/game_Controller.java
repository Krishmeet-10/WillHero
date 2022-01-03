package Testing;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class game_Controller implements Initializable {    

    TranslateTransition jump = new TranslateTransition();
    TranslateTransition move_island1 = new TranslateTransition();
    TranslateTransition move_island2 = new TranslateTransition();
    TranslateTransition move_island3 = new TranslateTransition();
    TranslateTransition move_island4 = new TranslateTransition();
    TranslateTransition move_island5 = new TranslateTransition();
    TranslateTransition move_island6 = new TranslateTransition();
    TranslateTransition move_island7 = new TranslateTransition();
    TranslateTransition move_island8 = new TranslateTransition();
    TranslateTransition move_island9 = new TranslateTransition();
    TranslateTransition move_island10 = new TranslateTransition();
    TranslateTransition move_island11 = new TranslateTransition();
    

    TranslateTransition move_tree1 = new TranslateTransition();
    TranslateTransition move_tree2 = new TranslateTransition();
    TranslateTransition move_tree3 = new TranslateTransition();
    TranslateTransition move_tree4 = new TranslateTransition();
    TranslateTransition move_tree5 = new TranslateTransition();
    TranslateTransition move_tree6 = new TranslateTransition();
    TranslateTransition move_tree7 = new TranslateTransition();
    TranslateTransition move_tree8 = new TranslateTransition();
    TranslateTransition move_tree9 = new TranslateTransition();
    TranslateTransition move_tree10 = new TranslateTransition();
    TranslateTransition move_tree61 = new TranslateTransition();
    TranslateTransition move_tree31 = new TranslateTransition();

    TranslateTransition move_orc1 = new TranslateTransition();
    TranslateTransition jump_orc1 = new TranslateTransition();
    TranslateTransition orc_dying1 = new TranslateTransition();

    TranslateTransition move_orc2 = new TranslateTransition();
    TranslateTransition jump_orc2 = new TranslateTransition();
    TranslateTransition orc_dying2 = new TranslateTransition();

    TranslateTransition move_orc3 = new TranslateTransition();
    TranslateTransition jump_orc3 = new TranslateTransition();
    TranslateTransition orc_dying3 = new TranslateTransition();

    TranslateTransition move_SwordChest = new TranslateTransition();   
    TranslateTransition move_weaponChest = new TranslateTransition(); 


    TranslateTransition Breakable_floor1 = new TranslateTransition();
    TranslateTransition Breakable_floor2 = new TranslateTransition();
    TranslateTransition Breakable_floor3 = new TranslateTransition();
    TranslateTransition Breakable_floor4 = new TranslateTransition();

    TranslateTransition move_caution = new TranslateTransition();

    TranslateTransition move_CoinChest = new TranslateTransition();

    TranslateTransition dying_anm = new TranslateTransition();

    private BooleanProperty temp_bool = new SimpleBooleanProperty();
    private BooleanProperty dPressed = new SimpleBooleanProperty();

    private BooleanBinding keyPressed = temp_bool.or(dPressed);

    private static int pos=0;
    private static int coins=0;

    @FXML
    private Rectangle shape1;

    @FXML
    private AnchorPane scene;

    @FXML
    void start(ActionEvent event) {
        shape1.setLayoutY(200);
        shape1.setLayoutX(280);
    }    

    @FXML
    private Rectangle island1;
    @FXML
    private Rectangle island2;
    @FXML
    private Rectangle island3;
    @FXML
    private Rectangle island4;
    @FXML
    private Rectangle island5;
    @FXML
    private Rectangle island6;
    @FXML
    private Rectangle island7;
    @FXML
    private Rectangle island8;
    @FXML
    private Rectangle island9;
    @FXML
    private Rectangle island10;
    @FXML
    private Rectangle island11;

    @FXML
    private Rectangle orc1;
    @FXML
    private Rectangle orc2;
    @FXML
    private Rectangle orc3;

    @FXML
    private Rectangle SwordChest;
    @FXML
    private Rectangle weaponChest;


    @FXML
    private Rectangle tree1;
    @FXML
    private Rectangle tree2;
    @FXML
    private Rectangle tree3;
    @FXML
    private Rectangle tree4;
    @FXML
    private Rectangle tree5;
    @FXML
    private Rectangle tree6;
    @FXML
    private Rectangle tree7;
    @FXML
    private Rectangle tree8;
    @FXML
    private Rectangle tree9;
    @FXML
    private Rectangle tree10;

    

    @FXML
    Button x;

    @FXML
    Label location;

    @FXML
    Label caution;

    @FXML
    Rectangle CoinChest;

    @FXML
    Label no_coins;
    @FXML
    ImageView coin_image;

    @FXML
    Button pause;
    
    @FXML
    private Rectangle floor1;
    @FXML
    private Rectangle floor2;
    @FXML
    private Rectangle floor3;
    @FXML
    private Rectangle floor4;

    int k=0;
    double ow=0;
    double ow1=0;
    double wo=0;
    int Q=0;
    int stat1=0;
    int stat2=0;
    int P=0;
    int R=0;
    int stat20=0;
    int wapas=0;
    int r=0;

    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long timestamp) {           
            if(dPressed.get()){

                shape1.setLayoutX(shape1.getLayoutX() + 10);
                scene.setLayoutX(scene.getLayoutX()-8);
                pause.setLayoutX(pause.getLayoutX()+8);
                x.setLayoutX(x.getLayoutX()+7);
                location.setLayoutX(location.getLayoutX()+8);
                pos++;
                no_coins.setLayoutX(no_coins.getLayoutX()+8);
                coin_image.setLayoutX(coin_image.getLayoutX()+8);
                Location_Display();

                if(k==0 && shape1.getLayoutX()>=630 && shape1.getLayoutX()<=670){
                    Image img60 = new Image("/Images/ChestOpen.png",false);
                    CoinChest.setFill(new ImagePattern(img60));
                    coins=coins+20;
                    coin_display();
                    k++;
                }

                if(r==0 && shape1.getLayoutX()>=3300){
                    Stage stage = (Stage) scene.getScene().getWindow();            
                    stage.close(); 
                    try {
                        over();
                    } catch (IOException e) {                        
                        e.printStackTrace();
                    }
                    r++;                                                                            
                }

                if(Q==0 && shape1.getLayoutX()>=1720){
                    Image img609 = new Image("/Images/Chestsword.png",false);
                    SwordChest.setFill(new ImagePattern(img609));
                    Image img601 = new Image("/Images/Helmetwithsword.png",false);
                    shape1.setFill(new ImagePattern(img601));
                    Q++;
                    setWeapon1(true);
                }

                if(P==0 && shape1.getLayoutX()>=2250){
                    Image img609 = new Image("/Images/Chestchampion.png",false);
                    weaponChest.setFill(new ImagePattern(img609));   
                    Image img6011 = new Image("/Images/herochampion.png",false);
                    shape1.setFill(new ImagePattern(img6011));                 
                    P++;
                    setWeapon2(true);
                }



                if(shape1.getLayoutX()>=960 && shape1.getLayoutX()<=990){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor1()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1030 && shape1.getLayoutX()<=1070){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor2()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1100 && shape1.getLayoutX()<=1130){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor3()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1150 && shape1.getLayoutX()<=1190){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor4()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1400 && shape1.getLayoutX()<=1550){
                    move_orc1.stop();
                    orc1.setLayoutX(orc1.getLayoutX()+10);
                    orc1.setStrokeWidth(ow);
                    ow=ow+0.25;
                    
                    if(shape1.getLayoutX()>=1530){
                        jump_orc1.stop();
                        orc_dying1.play();
                        if(stat1==0){
                            coins=coins+5;
                            coin_display();
                            stat1++;
                        }                        
                    }
                    
                }

                if(R==0 && shape1.getLayoutX()>=1920 && shape1.getLayoutX()<=2060){
                    move_orc2.stop();
                    orc2.setLayoutX(orc2.getLayoutX()+10);
                    orc2.setStrokeWidth(ow1);
                    ow1=ow1+0.25;
                    jump_orc2.stop();
                        orc_dying2.play();
                        Sword_broken();
                        if(stat2==0){
                            coins=coins+5;
                            coin_display();
                            stat2++;
                        }
                }

                if(shape1.getLayoutX()>=2560 && shape1.getLayoutX()<=2900){
                    if(wapas==0){
                        shape1.setLayoutX(shape1.getLayoutX()-100);                        
                    }
                    else if(wapas==1){
                        shape1.setLayoutX(shape1.getLayoutX()-150);
                    }
                    else if(wapas==2){
                        shape1.setLayoutX(shape1.getLayoutX()-240);
                    }
                    move_orc3.stop();
                    orc3.setLayoutX(orc3.getLayoutX()+10);
                    orc3.setStrokeWidth(wo);
                    wo=wo+0.25;
                    
                    if(shape1.getLayoutX()>=2850){
                        jump_orc3.stop();
                        orc_dying3.play();
                        if(stat20==0){
                            coins=coins+5;
                            coin_display();
                            stat20++;
                        }                        
                    }
                    wapas++;
                    
                }

                if( (shape1.getLayoutX()>=280 && shape1.getLayoutX()<=310) || (shape1.getLayoutX()>=420 && shape1.getLayoutX()<=450)  || (shape1.getLayoutX()>=700 && shape1.getLayoutX()<=750) 
                || (shape1.getLayoutX()>=1330 && shape1.getLayoutX()<=1360) || (shape1.getLayoutX()>=700 && shape1.getLayoutX()<=770) || (shape1.getLayoutX()>=1180 && shape1.getLayoutX()<=1200)
                || (shape1.getLayoutX()>=1570 && shape1.getLayoutX()<=1630) || (shape1.getLayoutX()>=1820 && shape1.getLayoutX()<=1860)|| (shape1.getLayoutX()>=2100 && shape1.getLayoutX()<=2130)||(shape1.getLayoutX()>=2330 && shape1.getLayoutX()<=2380)){     
                    jump.pause();               
                    dying_anm.play();
                }                
                else{
                    dying_anm.stop();        
                    jump.play();            
                }
            }
        }
    };

    

    public void getlocation(){
        System.out.println(shape1.getLayoutX());
    }

    public void over() throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("gameover.fxml"));
        Scene scene = new Scene(root);           
        stage.setScene(scene);  
        stage.show();
        stage.setResizable(true);
        stage.setTitle("Will Hero");        
        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon);
    }

    public void Pausemenu() throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
        Scene scene = new Scene(root);           
        stage.setScene(scene);  
        stage.show();
        stage.setResizable(false);
        stage.setTitle("Will Hero");        
        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon);
    }

    public void Sword_broken(){
        Image img320 = new Image("/Images/herobrokensword.png",false);
        shape1.setFill(new ImagePattern(img320));
    }

    public void close_game(){
        Stage stage = (Stage)scene.getScene().getWindow();            
        stage.close();        
    }

    public void Location_Display(){
        int x=pos;
        x=x/2;
        String p = ""+x;
        location.setText(p);
    }

    public void coin_display(){
        String s = ""+coins;
        no_coins.setText(s);
    }

    public void break_floor1(){
        floor1.setLayoutY(floor1.getLayoutY()+500); 
        if(shape1.getLayoutX()<=990){
            dying_anm.play();
        }               
    }

    public void break_floor2(){
        floor2.setLayoutY(floor2.getLayoutY()+500); 
        if(shape1.getLayoutX()<=1070){
            dying_anm.play();
        }               
    }

    public void break_floor3(){
        floor3.setLayoutY(floor3.getLayoutY()+500); 
        if(shape1.getLayoutX()<=1110){
            dying_anm.play();
        }               
    }

    public void break_floor4(){
        floor4.setLayoutY(floor4.getLayoutY()+500); 
        if(shape1.getLayoutX()<=1180){
            dying_anm.play();
        }               
    }

    namecontroller n = new namecontroller();
    private Boolean weapon1;
    private Boolean weapon2;

    public int getCoins() {
        return coins;
    }

    public int getPos() {
        return pos;
    }


    public void setName(String name) {
        this.n.name = name;
    }

    public String getName() {
        return n.name;
    }

    public void setWeapon1(Boolean x) {
        this.weapon1 = x;
    }

    public void setWeapon2(Boolean x) {
        this.weapon2 = x;
    }

    public String getWeapon() {
        if (weapon1 = true) {
            return ("Sword");
        } else if (weapon2 == true) {
            return ("Champion");
        }
        else{
            return ("None");
        }
    }
    

    public void movementSetup(){
        scene.setOnKeyPressed(e -> {            
        
            if(e.getCode() == KeyCode.D) {
                dPressed.set(true);
                move_island1.play();
                move_island2.play();              
                move_island3.play();
                move_island4.play();
                move_island5.play();
                move_island6.play();
                move_island7.play();
                move_island8.play();
                move_island9.play();
                move_island10.play();
                move_island11.play();

                move_tree1.play();
                move_tree2.play();
                move_tree3.play();
                move_tree4.play();
                move_tree5.play();
                move_tree6.play();
                move_tree7.play();
                move_tree8.play();
                move_tree9.play();
                move_tree10.play();

                move_orc1.play();
                move_orc2.play();
                move_orc3.play();

                move_CoinChest.play();
                move_SwordChest.play();
                move_weaponChest.play();

                Breakable_floor1.play();
                Breakable_floor2.play();
                Breakable_floor3.play();
                Breakable_floor4.play();

                move_caution.play();
                
            }
        });

        scene.setOnKeyReleased(e ->{           
          
            if(e.getCode() == KeyCode.D) {
                dPressed.set(false);                
                move_island1.pause();
                move_island2.pause();
                move_island3.pause();
                move_island4.pause();
                move_island5.pause();
                move_island6.pause();
                move_island7.pause();
                move_island8.pause();
                move_island9.pause();
                move_island10.pause();
                move_island11.pause();

                move_tree1.pause();
                move_tree2.pause();
                move_tree3.pause();
                move_tree4.pause();
                move_tree5.pause();
                move_tree6.pause();
                move_tree7.pause();
                move_tree8.pause();
                move_tree9.pause();
                move_tree10.pause();

                move_orc1.pause();
                move_orc2.pause();
                move_orc3.pause();

                move_CoinChest.pause();
                move_SwordChest.pause();
                move_weaponChest.pause();

                Breakable_floor1.pause();
                Breakable_floor2.pause();
                Breakable_floor3.pause();
                Breakable_floor4.pause();

                move_caution.pause();
            }
        });
    }
    int q=0;

    public void Game_Over() throws IOException {
        if(q==0 && coins>=25){            
            shape1.setLayoutX(shape1.getLayoutX()+30);
            jump.play();
            coins=coins-20;
            coin_display();
            q++;
        }
        else{
            Stage stage= (Stage) scene.getScene().getWindow();
            stage.close();
            stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("over.fxml"));
            Scene scene = new Scene(root);           
            stage.setScene(scene);  
            stage.show();
            stage.setResizable(true);
            stage.setTitle("Will Hero");        
            Image icon = new Image("/Images/Wiki-background.jpg");
            stage.getIcons().add(icon);
        }       
        
    }
    
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        movementSetup();       
        

        Islands is = new Islands();
        Hero H = new Hero();
        Obstacle_floor fl = new Obstacle_floor();
        Orc oc = new Orc();
        Trees_Info ts = new Trees_Info();
        Chest cc = new Chest();

        keyPressed.addListener(((observableValue, aBoolean, t1) -> {
            if(!aBoolean){
                timer.start();
            } else {
                timer.stop();
            }
        }));
        
        //Hero Properties
        H.Define(shape1);
        H.define_movement(jump, shape1);

        is.SetIsland(100, 440, island1,"/Images/Islands1.png");
        is.transition(move_island1, island1, -800,2);

        is.SetIsland(370, 440, island2,"/Images/Islands7.png");
        is.transition(move_island2, island2, -800,2);

        is.SetIsland(600, 440, island3,"/Images/Islands2.png");
        is.transition(move_island3, island3,-1200, 3);

        //island4
        is.SetIsland(1100, 440, island4,"/Images/BalancingRocks3.png");
        is.transition(move_island4, island4,-1600, 4);

        //island5
        is.SetIsland(1900, 440, island5,"/Images/Islands1.png");
        is.transition(move_island5, island5,-1600, 4);

        is.SetIsland(2200, 440, island6,"/Images/Islands4.png");
        is.transition(move_island6, island6,-1600, 4);

        is.SetIsland(2700, 440, island7,"/Images/Islands8.png");
        is.transition(move_island7, island7,-1600, 4);

        is.SetIsland(3100, 440, island8,"/Images/Islands2.png");
        is.transition(move_island8, island8,-1600, 4);

        is.SetIsland(3600, 440, island9,"/Images/Islands7.png");
        is.transition(move_island9, island9,-1600, 4);

        is.SetIsland(4000, 440, island10,"/Images/Islands7.png");
        is.transition(move_island10, island10,-1600, 4);

        is.SetIsland(4600, 100, island11,"/Images/castle.jpg");
        is.transition(move_island11, island11,-1600, 4);      
        
            
         //tree1
        ts.SetTree(100, 290, tree1,"/Images/Tree1.png");
        ts.TreeTransition(move_tree1, tree1, 2,-800);

        //tree2
        ts.SetTree(370, 290, tree2,"/Images/Tree1.png");
        ts.TreeTransition(move_tree2, tree2, 2,-800);

        //tree3
        ts.SetTree(600, 290, tree3,"/Images/Tree2.png");
        ts.TreeTransition(move_tree3, tree3, 3,-1200);

        //tree4
        ts.SetTree(750, 290, tree4,"/Images/Tree3.png");
        ts.TreeTransition(move_tree4, tree4, 4,-1600);

        //tree5
        ts.SetTree(1900, 290, tree5,"/Images/Tree2.png");
        ts.TreeTransition(move_tree5, tree5, 4,-1600);

        //tree6
        ts.SetTree(2200, 290, tree6,"/Images/Tree4.png");
        ts.TreeTransition(move_tree6, tree6, 4,-1600);

        //tree7
        ts.SetTree(2700, 290, tree7,"/Images/Tree3.png");
        ts.TreeTransition(move_tree7, tree7, 4,-1600);

        //tree8
        ts.SetTree(3100, 290, tree8,"/Images/Tree3.png");
        ts.TreeTransition(move_tree8, tree8, 4,-1600);

        //tree9
        ts.SetTree(3600, 290, tree9,"/Images/Tree4.png");
        ts.TreeTransition(move_tree9, tree9, 4,-1600);

        //tree10
        ts.SetTree(4000, 290, tree10,"/Images/Tree1.png");
        ts.TreeTransition(move_tree10, tree10, 4,-1600);

        //code for orcs
        oc.Orc_define(orc1, 2300, 370, "/Images/Orc5.png");       
        oc.Orc_movement(move_orc1, orc1);
        oc.Orc_jump_movement(jump_orc1, orc1);        
        oc.Orc_Dying_anim(orc_dying1, orc1);

        oc.Orc_define(orc2, 3250, 370, "/Images/RedOrc1.png");        
        oc.Orc_movement(move_orc2, orc2);        
        oc.Orc_jump_movement(jump_orc2, orc2);       
        oc.Orc_Dying_anim(orc_dying2, orc2);
        
        oc.Orc_define(orc3, 4200, 240, "/Images/OrcBoss.png");      
        oc.Orc_movement(move_orc3, orc3);        
        oc.Orc_jump_movement(jump_orc3, orc3);        
        oc.Orc_Dying_anim(orc_dying3, orc3);


        //Code for game over/hero dying
        H.Falling(dying_anm, shape1);
        dying_anm.setOnFinished(event ->
        {
            try {
                Game_Over();
            } catch (IOException e) {                
                e.printStackTrace();
            }
        });                

        cc.SetChest(850,385,CoinChest,"/Images/ChestClosed.png");
        cc.chestTransition(move_CoinChest,CoinChest,-1200,3);

        //swordWeaponChest
        cc.SetChest(2850,390,SwordChest,"/Images/ChestClosed.png");
        cc.chestTransition(move_SwordChest,SwordChest,-1600,4);

        //championWeaponChest
        cc.SetChest(3750,390,weaponChest,"/Images/ChestClosed.png");
        cc.chestTransition(move_weaponChest,weaponChest,-1600,4);

            
        fl.define_floor(floor1, 1400, 445);        
        fl.breaking_properties(Breakable_floor1, floor1);

        fl.define_floor(floor2, 1500, 445);        
        fl.breaking_properties(Breakable_floor2, floor2);
        
        fl.define_floor(floor3, 1600, 445);        
        fl.breaking_properties(Breakable_floor3, floor3);
                
        fl.define_floor(floor4, 1700, 445);  
        fl.breaking_properties(Breakable_floor4, floor4);         
        
        fl.caution_define(caution);        
        fl.caution_properties(move_caution, caution);

        pause.setLayoutX(1200);
        pause.setLayoutY(55);

        

        // for(int i=0;i<420;i++){
        //     generate_random();     
        // }
}

    public void generate_random(){

                shape1.setLayoutX(shape1.getLayoutX() + 10);
                scene.setLayoutX(scene.getLayoutX()-8);
                pause.setLayoutX(pause.getLayoutX()+8);
                x.setLayoutX(x.getLayoutX()+8);
                location.setLayoutX(location.getLayoutX()+8);
                no_coins.setLayoutX(no_coins.getLayoutX()+8);
                coin_image.setLayoutX(coin_image.getLayoutX()+8);
                Location_Display();

                if(k==0 && shape1.getLayoutX()>=630 && shape1.getLayoutX()<=670){
                    Image img60 = new Image("/Images/ChestOpen.png",false);
                    CoinChest.setFill(new ImagePattern(img60));
                    coins=coins+20;
                    coin_display();
                    k++;
                }

                if(Q==0 && shape1.getLayoutX()>=1720){
                    Image img609 = new Image("/Images/Chestsword.png",false);
                    SwordChest.setFill(new ImagePattern(img609));
                    Image img601 = new Image("/Images/Helmetwithsword.png",false);
                    shape1.setFill(new ImagePattern(img601));
                    Q++;
                    setWeapon1(true);
                }

                if(P==0 && shape1.getLayoutX()>=2250){
                    Image img609 = new Image("/Images/Chestchampion.png",false);
                    weaponChest.setFill(new ImagePattern(img609));   
                    Image img6011 = new Image("/Images/herochampion.png",false);
                    shape1.setFill(new ImagePattern(img6011));                 
                    P++;
                    setWeapon2(true);
                }



                if(shape1.getLayoutX()>=960 && shape1.getLayoutX()<=990){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor1()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1230 && shape1.getLayoutX()<=1270){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor2()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1100 && shape1.getLayoutX()<=1130){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor3()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1150 && shape1.getLayoutX()<=1190){
                    Timeline delay = new Timeline(new KeyFrame(
                    javafx.util.Duration.millis(500),
                    d -> break_floor4()));
                    delay.play();
                }

                if(shape1.getLayoutX()>=1400 && shape1.getLayoutX()<=1550){
                    move_orc1.stop();
                    orc1.setLayoutX(orc1.getLayoutX()+10);
                    orc1.setStrokeWidth(ow);
                    ow=ow+0.25;
                    
                    if(shape1.getLayoutX()>=1530){
                        jump_orc1.stop();
                        orc_dying1.play();
                        if(stat1==0){
                            coins=coins+5;
                            coin_display();
                            stat1++;
                        }                        
                    }
                    
                }

                if(R==0 && shape1.getLayoutX()>=1920 && shape1.getLayoutX()<=2060){
                    move_orc2.stop();
                    orc2.setLayoutX(orc2.getLayoutX()+10);
                    orc2.setStrokeWidth(ow1);
                    ow1=ow1+0.25;
                    jump_orc2.stop();
                        orc_dying2.play();
                        Sword_broken();
                        if(stat2==0){
                            coins=coins+5;
                            coin_display();
                            stat2++;
                        }
                }

                if(shape1.getLayoutX()>=2560 && shape1.getLayoutX()<=2900){
                    if(wapas==0){
                        shape1.setLayoutX(shape1.getLayoutX()-100);                        
                    }
                    else if(wapas==1){
                        shape1.setLayoutX(shape1.getLayoutX()-150);
                    }
                    else if(wapas==2){
                        shape1.setLayoutX(shape1.getLayoutX()-240);
                    }
                    move_orc3.stop();
                    orc3.setLayoutX(orc3.getLayoutX()+10);
                    orc3.setStrokeWidth(wo);
                    wo=wo+0.25;
                    
                    if(shape1.getLayoutX()>=2850){
                        jump_orc3.stop();
                        orc_dying3.play();
                        if(stat20==0){
                            coins=coins+5;
                            coin_display();
                            stat20++;
                        }                        
                    }
                    wapas++;
                    
                }

                if( (shape1.getLayoutX()>=280 && shape1.getLayoutX()<=310) || (shape1.getLayoutX()>=420 && shape1.getLayoutX()<=450)  || (shape1.getLayoutX()>=700 && shape1.getLayoutX()<=750) 
                || (shape1.getLayoutX()>=1330 && shape1.getLayoutX()<=1360) || (shape1.getLayoutX()>=700 && shape1.getLayoutX()<=770) || (shape1.getLayoutX()>=1180 && shape1.getLayoutX()<=1200)
                || (shape1.getLayoutX()>=1570 && shape1.getLayoutX()<=1630) || (shape1.getLayoutX()>=1820 && shape1.getLayoutX()<=1860)|| (shape1.getLayoutX()>=2100 && shape1.getLayoutX()<=2130)||(shape1.getLayoutX()>=2330 && shape1.getLayoutX()<=2380)){     
                    jump.pause();               
                    dying_anm.play();
                }                
                else{
                    dying_anm.stop();        
                    jump.play();            
                }              
                
                

                
    }

    
}