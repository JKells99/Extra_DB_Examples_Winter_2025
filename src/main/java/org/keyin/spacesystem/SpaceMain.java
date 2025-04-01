package org.keyin.spacesystem;

import org.keyin.spacesystem.user.User;
import org.keyin.spacesystem.user.UserService;

public class SpaceMain {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user = new User("john_doe117", "password123", "ENGiNEER");

        User user1 = userService.loginUser("john_doe1", "password123");

        if(user1.getRole().equalsIgnoreCase("engineer")) {

            System.out.println("Welcome Engineer " + user1.getUsername());
        } else if(user1.getRole().equalsIgnoreCase("COMMANDER")) {

            System.out.println("Welcome COMMANDER " + user1.getUsername());
        } else {
            System.out.println("Welcome User " + user1.getUsername());
        }

    }
}
