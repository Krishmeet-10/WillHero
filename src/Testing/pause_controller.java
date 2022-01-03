package Testing;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class pause_controller{
    @FXML
    private Button resume;
    @FXML
    private Button restart;
    @FXML 
    private Button save_game;
    @FXML
    private Button mainmenu;
    @FXML
    private AnchorPane ap;
    private int n1;

    //game_Controller g = new game_Controller();

    public void resume_game(){
        Stage stage = (Stage) ap.getScene().getWindow();            
        stage.close();
    }

    public void restartgame() throws IOException{        
        //close_game();          
        newgame();        
    }

    public void newgame() throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("game.fxml"));
        Scene scene = new Scene(root);           
        stage.setScene(scene);  
        stage.show();
        stage.setResizable(false);
        stage.setTitle("Will Hero");        
        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon);        
    }

    public void save_game() throws IOException, ClassNotFoundException{
        System.out.println("game saved");
        
        game_Controller r=new game_Controller();
        Player n= new Player(r.getPos(),r.getCoins(),r.getName(),r.getWeapon());       


        n.write();
        n.read(namecontroller.name);
    }
    public int getN1() {
        return n1;
    }


    public void main_menu(){
        //close_game();
    }
}
