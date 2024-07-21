package me.dio.santander_coders_challenge.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL)
    private List<News> news;

}