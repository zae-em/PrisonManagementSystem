package com.prison.controller;

import com.prison.model.User;
import com.prison.util.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {
    
    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private Label errorLabel;
    
    private Database db = Database.getInstance();
    
    @FXML
    public void handleLogin(ActionEvent event) {
        try {
            String username = usernameField.getText().trim();
            String password = passwordField.getText().trim();
            
            // Validation
            if (username.isEmpty() || password.isEmpty()) {
                errorLabel.setText("Please enter both username and password!");
                return;
            }
            
            // Authenticate user
            User user = db.authenticateUser(username, password);
            
            if (user != null) {
                if ("Active".equals(user.getStatus())) {
                    // Login successful
                    System.out.println("✅ Login successful: " + user.getFullName());
                    openMainMenu(event);
                } else {
                    errorLabel.setText("Your account is inactive. Contact administrator.");
                }
            } else {
                errorLabel.setText("Invalid username or password!");
            }
        } catch (Exception e) {
            System.err.println("❌ Error in handleLogin: " + e.getMessage());
            e.printStackTrace();
            errorLabel.setText("Error: " + e.getMessage());
        }
    }
    
    @FXML
    public void openSignup(ActionEvent event) {
        try {
            System.out.println("Opening signup page...");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Signup.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
            stage.setTitle("Sign Up - Prison Management System");
            stage.show();
        } catch (Exception e) {
            System.err.println("❌ Error loading signup page: " + e.getMessage());
            e.printStackTrace();
            errorLabel.setText("Error loading signup page: " + e.getMessage());
        }
    }
    
    private void openMainMenu(ActionEvent event) {
        try {
            System.out.println("Opening main menu...");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainMenu.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
            stage.setTitle("Main Menu - Prison Management System");
            stage.show();
        } catch (Exception e) {
            System.err.println("❌ Error loading main menu: " + e.getMessage());
            e.printStackTrace();
            errorLabel.setText("Error loading main menu: " + e.getMessage());
        }
    }
}
