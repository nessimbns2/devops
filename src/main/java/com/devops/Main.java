package com.devops;

import com.devops.models.User;
import com.devops.services.UserService;
import com.devops.utils.Logger;

import java.util.List;

/**
 * Main application entry point
 */
public class Main {
    public static void main(String[] args) {
        Logger.info("Starting DevOps Application...");
        
        UserService userService = new UserService();
        
        // Create some sample users
        userService.addUser(new User(1, "Alice", "alice@example.com"));
        userService.addUser(new User(2, "Bob", "bob@example.com"));
        userService.addUser(new User(3, "Charlie", "charlie@example.com"));
        
        // Display all users
        Logger.info("Registered Users:");
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        
        // Find a specific user
        User foundUser = userService.findUserById(2);
        if (foundUser != null) {
            Logger.info("Found user: " + foundUser.getName());
        }
        
        Logger.info("Application finished successfully!");
    }
}
