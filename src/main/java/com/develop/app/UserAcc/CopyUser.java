package com.develop.app.UserAcc;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Entity
@Table(name = "user-info")
@Setter
@ToString
public class CopyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String guard;
}
