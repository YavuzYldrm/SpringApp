package com.maqant.springboot.demo.myfirstapp.entity;

public class NewStudent {

    private String firstName;
    private String lastName;

    public NewStudent() {

    }

    public NewStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
