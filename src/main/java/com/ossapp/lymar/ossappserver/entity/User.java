package com.ossapp.lymar.ossappserver.entity;


import lombok.*;
import javax.persistence.*;
import java.util.List;



@NoArgsConstructor
@Entity
@Table(name = "users")
@Setter
@Getter

public class User {
    public User(int age, String city, String email, String name, String password, int sex, String telegram, List<Style> styles, int weight) {
        this.age = age;
        this.city = city;
        this.email = email;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.telegram = telegram;
        this.styles = styles;
        this.weight = weight;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "age")
    private int age;
    @Column(name = "city")
    private String city;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "sex")
    private int sex;
    @Column(name = "telegram")
    private String telegram;
    @Column(name = "weight")
    private int weight;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_style",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "style_id"))
    private List<Style> styles;






}
