package com.imam.user.service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="micro_users")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;
    private String name;
    private String email;
    private String about;
}
