package com.ossapp.lymar.ossappserver.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "style")
@Getter
@Setter
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    private int level_style;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_style",
    joinColumns = @JoinColumn(name = "style_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> userList;

    public Style(int value, int level_style) {
        this.value = value;
        this.level_style = level_style;
    }
}
