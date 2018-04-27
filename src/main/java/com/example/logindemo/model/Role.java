package com.example.logindemo.model;

import javax.persistence.*;

@Entity
@Table(name="role")
public class Role {
    //declare fields
    @Id
    @GeneratedValue
    @Column(name="role_id")
    private int id;

    @Column(name="role")
    private String role;

    public Role (int id, String role) {
        this.id = id;
        this.role = role;
    }
    //default constructor
    public Role () {};


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
