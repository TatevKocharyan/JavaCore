package homework.education.storage;


import homework.education.Exceptions.UserNotFoundException;
import homework.education.model.User;

public class UserStorage {
    public User[] users = new User[10];
    int size = 0;


    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i] + " ");

        }
    }

    public User checkUser(String email, String password) throws UserNotFoundException {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                return users[i];
            }

        } throw new UserNotFoundException("Email and Password dose not exists");


    }





}

