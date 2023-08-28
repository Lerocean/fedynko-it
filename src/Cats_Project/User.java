package Cats_Project;

public class User {

    // Declaring variables: user ID, name, surname, email, gender, date of birth.
    long user_id;

    String user_name;

    String user_surname;

    String user_email;

    String user_gender;

    String user_DOB;

    // Constructor empty
    public User() {
    }

    // Constructor non-empty
    public User(long user_id, String user_name, String user_surname, String user_email, String user_gender, String user_DOB) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_email = user_email;
        this.user_gender = user_gender;
        this.user_DOB = user_DOB;
    }

    // Output user to string
    public void printToString() {
        String str = "Пользаватель: ";
        str += "id " + this.getUser_id() + ", Имя, Фамилия - " + this.getUser_name() + " " + this.getUser_surname();
        // check if some fields are not empty
        if (!this.getUser_email().isEmpty()) {
            str += ", email - " + this.getUser_email();
        }
        if (!this.getUser_gender().isEmpty()) {
            str += ", пол - " + this.getUser_gender();
        }
        if (!this.getUser_DOB().isEmpty()) {
            str += ", дата рождения - " + this.getUser_DOB();
        }
        System.out.println(str);
    }
    // Setter methods: to set / update value

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public void setUser_DOB(String user_DOB) {
        this.user_DOB = user_DOB;
    }

    // Getter methods: to return the value
    public long getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public String getUser_DOB() {
        return user_DOB;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_surname='" + user_surname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_DOB='" + user_DOB + '\'' +
                '}';
    }
    // добавление нового пользователя
    public void create() {
        System.out.println("Добавлен новый пользователь");
    }
    public void delete() {
        System.out.println("Удаление пользователя ");
    }

}

