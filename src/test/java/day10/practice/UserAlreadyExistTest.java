package day10.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserAlreadyExistTest {

    @Test
    public void testRegisterUser_Success() {
        UserManager userManager = new UserManager();
        User user1 = new User(1, "Aravind", "aravind@gmail.com");

        assertDoesNotThrow(() -> userManager.registerUser(user1), "Registering a new user should not throw an exception");
    }

    @Test
    public void testRegisterUser_UserAlreadyExists() {
        UserManager userManager = new UserManager();
        User user1 = new User(1, "Aravind", "aravind@gmail.com");
        User user2 = new User(2, "Aravind Ram", "aravindram@gmail.com");

        assertDoesNotThrow(() -> userManager.registerUser(user1), "Registering user1 should not throw an exception");
        assertDoesNotThrow(() -> userManager.registerUser(user2), "Registering user2 should not throw an exception");

        User user3 = new User(3, "Test User", "aravindram@gmail.com");
        assertThrows(UserAlreadyExistsException.class, () -> userManager.registerUser(user3),
                "Registering user3 with an existing email should throw UserAlreadyExistsException");
    }

    @Test
    public void testRegisterUser_NullUser() {
        UserManager userManager = new UserManager();
        User nullUser = null;

        assertThrows(IllegalArgumentException.class, () -> userManager.registerUser(nullUser),
                "Registering a null user should throw IllegalArgumentException");
    }
}
