package com.dxc.assessment.modal;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String genre;
    private String email;

    public Author() {
    }

    public Author(int id, String firstName, String lastName, String genre, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.email = email;
    }
}