package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Group root= new Group();
        Scene scene= new Scene(root,400,400,Color.LIGHTCORAL);

        Text text= new Text();
        text.setText("yaaaahoooo");
//        text.setFont(Font.font("Verdana",50));
//        text.setFill(Color.GRAY);
//        text.setX(60);
//        text.setY(60);
//        text.setOpacity(80);
//
//        Line line=new Line();
//        line.setStartX(200);
//        line.setStartY(100);
//        line.setEndX(100);
//        line.setEndY(100);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.GRAY);
//
//        root.getChildren().add(line);
//
//        root.getChildren().add(text);

        Image icon = new Image("willHeroLogo.png");
        stage.getIcons().add(icon);
        stage.setTitle("Welcome to trial 1");

        stage.setScene(scene);
        stage.show();
//
//        stage.setTitle("Demo program");
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        stage.setScene(new Scene(root, 20, 20));
//        stage.setWidth(400);
//        stage.setHeight(400);
//        stage.setResizable(false);
////        stage.setX(20);
////        stage.setY(20);
//        stage.show();
    }
}