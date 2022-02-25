package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name="Greeting")
public class GreetingEntity {

    //Propiedades
    private int id;
    private String content;

    //Constructors - Los que necesites
    public GreetingEntity() {
    }

    //Getters and Setters de tus propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name="Content")
    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }
}
