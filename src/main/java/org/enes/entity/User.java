package org.enes.entity;

import java.io.Serializable;

public class User implements Serializable {
    String gender;
    Name name;
    Location location;
    String email;
    Login login;
    Dob dob;
    String phone;

    public class Dob implements Serializable{
        String date;
        Integer age;

        public Dob() {
        }

        public Dob(String date, Integer age) {
            this.date = date;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dob{" +
                    "date='" + date + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
    public class Login implements Serializable{
        String username;
        String password;
        String uuid;

        public Login() {
        }

        public Login(String username, String password, String uuid) {
            this.username = username;
            this.password = password;
            this.uuid = uuid;
        }

        @Override
        public String toString() {
            return "Login{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", uuid='" + uuid + '\'' +
                    '}';
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }
    }
    public class Location implements Serializable{
        String city;
        String country;
        String state;

        public Location() {
        }

        public Location(String city, String country, String state) {
            this.city = city;
            this.country = country;
            this.state = state;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
    public class Name implements Serializable{
        public String title;
        public String last;
        public String first;

        @Override
        public String toString() {
            return "Name{" +
                    "title='" + title + '\'' +
                    ", last='" + last + '\'' +
                    ", first='" + first + '\'' +
                    '}';
        }

        public Name(String title, String last, String first) {
            this.title = title;
            this.last = last;
            this.first = first;
        }

        public Name() {
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }
    }

    public User() {
    }

    public User(String gender, Name name, Location location, String email, Login login, Dob dob, String phone) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.dob = dob;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "gender='" + gender + '\'' +
                ", name=" + name +
                ", location=" + location +
                ", email='" + email + '\'' +
                ", login=" + login +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
