package com.alterra.spring1.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "descriptions")
    private String description;
}
