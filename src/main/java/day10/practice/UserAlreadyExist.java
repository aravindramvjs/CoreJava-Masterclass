package day10.practice;

import java.util.ArrayList;
import java.util.List;

class UserAlreadyExistsException extends RuntimeException {
    private static final long serialVersionUID = -8105491977357554060L;

    public UserAlreadyExistsException(String msg) {
        super(msg);
    }

    public UserAlreadyExistsException(Throwable te) {
        super(te);
    }

    public UserAlreadyExistsException(String msg, Throwable te) {
        super(msg, te);
    }
}

class User {
    int id;
    String name;
    String emailId;

    public User(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

class UserManager {

    private List<User> users = new ArrayList<>();

    public void registerUser(User user) throws UserAlreadyExistsException {
        if (user == null) {
            throw new IllegalArgumentException("User Object Cannot be Null");
        }

        for (User existingUser : users) {
            if (existingUser.getEmailId().equals(user.getEmailId())) {
                throw new UserAlreadyExistsException("User already exists with the same email address");
            }
        }

        users.add(user);
        System.out.println(users);
        System.out.println("User added");
    }
}
