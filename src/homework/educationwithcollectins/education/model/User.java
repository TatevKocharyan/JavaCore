package homework.educationwithcollectins.education.model;

import homework.educationwithcollectins.education.enums.UserType;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable, Comparable {
    private String name;
    private String surname;
    private String email;
    private String password;
    UserType type;

    public User(String name, String surname, String email, String password, UserType type) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, type);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
