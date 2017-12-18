package com.bootcamp.commons.ws.usecases.pivotone;

import com.bootcamp.entities.PagRole;

import java.util.List;

/**
 * Created by darextossa on 12/17/17.
 */
public class UserWs {
    private String username;
    private String password;
    private String firstname;
    private String nom;
    private String email;
    private List<PagRole> roles;

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PagRole> getPagRoles() {
        return roles;
    }

    public void setPagRoles(List<PagRole> roles) {
        this.roles = roles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
