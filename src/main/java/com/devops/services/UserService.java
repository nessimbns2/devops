package com.devops.services;

import com.devops.models.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service class for managing users
 */
public class UserService {
    private List<User> users;
    
    public UserService() {
        this.users = new ArrayList<>();
    }
    
    /**
     * Add a new user to the system
     */
    public void addUser(User user) {
        if (user != null && !users.contains(user)) {
            users.add(user);
        }
    }
    
    /**
     * Remove a user by ID
     */
    public boolean removeUser(int id) {
        return users.removeIf(user -> user.getId() == id);
    }
    
    /**
     * Find a user by ID
     */
    public User findUserById(int id) {
        Optional<User> user = users.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
        return user.orElse(null);
    }
    
    /**
     * Get all users
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
    
    /**
     * Update user information
     */
    public boolean updateUser(User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == updatedUser.getId()) {
                users.set(i, updatedUser);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Get total number of users
     */
    public int getUserCount() {
        return users.size();
    }
}
