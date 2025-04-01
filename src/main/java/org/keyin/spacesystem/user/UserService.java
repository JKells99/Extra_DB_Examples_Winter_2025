package org.keyin.spacesystem.user;

import org.mindrot.jbcrypt.BCrypt;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {


    UserDAO userDAO = new UserDAO();
    Logger logger = Logger.getLogger(UserService.class.getName());

    public void registerUser(User user) {


        try {
            if (user.getUsername() == null || user.getUsername().isEmpty() || user.getPassword() == null || user.getPassword().isEmpty()) {
                throw new IllegalArgumentException("Please Input Your Credentials");
            }

            if(userDAO.getUserByUsername(user.getUsername()) != null) {
                logger.log(Level.WARNING, "User Already Exists");
                throw new IllegalArgumentException("Username already exists");
            }

            String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());

            user.setPassword(hashedPassword);
            userDAO.createNewUser(user);
            logger.log(Level.INFO, "Registered user: " + user.getUsername());
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage());

        }

    }

    public User loginUser(String username, String password) {
        User user = userDAO.getUserByUsername(username);
        if (user != null && BCrypt.checkpw(password, user.getPassword())) {
            logger.log(Level.INFO, "User logged in: " + username);
            return user;
        } else {
            logger.log(Level.WARNING, "Invalid credentials for user: " + username);
            return null;
        }
    }

}
