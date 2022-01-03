import java.io.IOException;

import Testing.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controller {
        
        @FXML
        Button exit;
        @FXML
        AnchorPane ap;

        Stage stage;

    public void logout(ActionEvent e){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText("Are you sure you want to Exit ?");
        alert.setContentText("Make sure to save your game before leaving");
        

        if(alert.showAndWait().get() == ButtonType.OK){
            stage= (Stage) ap.getScene().getWindow();
            System.out.println("You have logged out,Thank you for playing the game");
            stage.close();
        }        
    }

    public void restart(ActionEvent e){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Restart");
        alert.setHeaderText("Are you sure you want to Restart ?");
        alert.setContentText("Make sure to save your game before restarting");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage= (Stage) ap.getScene().getWindow();
            System.out.println("You have logged out,Thank you for playing the game");
            stage.close();
        }        
    }

    public void Switchscene() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("aboutgame.fxml"));
        Scene scene = new Scene(root);
        Stage secondarystage = new Stage();
        secondarystage.setScene(scene);
        Image icon = new Image("/Images/Wiki-background.jpg");
        secondarystage.getIcons().add(icon);
        secondarystage.setTitle("About Game");
        secondarystage.setResizable(false);
        secondarystage.show();
    }

    public void startgame() throws IOException{
        System.out.println("Game Started");     
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Testing/name.fxml"));
        Scene scene = new Scene(root);           
        stage.setScene(scene);  
        stage.show();
        stage.setResizable(false);
        stage.setTitle("Will Hero");        
        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon); 
    }    
    int k=0;
    

    public void loadGame() throws IOException, ClassNotFoundException{
        System.out.println("Game Started");     
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Testing/name.fxml"));
        Scene scene = new Scene(root);           
        stage.setScene(scene);  
        stage.show();
        stage.setResizable(false);
        stage.setTitle("Will Hero");        
        Image icon = new Image("/Images/Wiki-background.jpg");
        stage.getIcons().add(icon);  
        k++;   


    }

    

    
}
