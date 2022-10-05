package com.projects.passwordlaps.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TB_PASSWORD")
@Data
public class PasswordModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 20)
    private String computerName;

    @Column(nullable = true, length = 20)
    private String password;

    @Column(nullable = true, length = 20)
    private String passwordExires;

    @Column(nullable = true, length = 20)
    private boolean reset;
}
