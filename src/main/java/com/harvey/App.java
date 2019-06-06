package com.harvey;

import java.awt.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.FileInputStream;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ricoh ...");

        FileInputStream input = new FileInputStream("C:\\Users\\Harvey\\Desktop\\Java\\bitcoin-app\\src\\main\\java\\com\\harvey\\Ricoh-Logo.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        Button button = new Button("", imageView);

        // action event 
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                Toolkit.getDefaultToolkit().beep();
            } 
        }; 
  
        // when button is pressed 
        button.setOnAction(event); 

        Scene scene = new Scene(button, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
