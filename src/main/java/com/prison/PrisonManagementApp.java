package com.prison;

import com.prison.util.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrisonManagementApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize database
        Database.getInstance();
        
        // Load Login page instead of Main Menu
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        Parent root = loader.load();
        
        primaryStage.setTitle("Login - Prison Management System");
        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}