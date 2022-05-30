package com.fourtrashes.pokerface.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User{

    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name="userNickname", length = 50 ,nullable = false)
    private String userNickname;

    @Column(name="userPassword", length = 200 ,nullable = false)
    private String userPassword;

    @Column(name="userSalt", length = 200, nullable = false)
    private String userSalt;

    @Column(name="userName",nullable = false)
    private String userName;

    @Column(name="money")
    private Long money;

    @Enumerated(EnumType.STRING)
    private UserStatus status;
}
