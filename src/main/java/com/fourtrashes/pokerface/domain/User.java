package com.fourtrashes.pokerface.domain;




import com.fourtrashes.pokerface.domain.BaseDomain;

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
public class User extends BaseDomain {

    @Id
    @Column(name="userNo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;

    @Column(name="userId", nullable = false)
    private String userId;

    @Column(name="userPassword", nullable = false)
    private String userPassword;

    @Column(name="userName",nullable = false)
    private String userName;

    @Column(name="money",nullable = false)
    private Long money;

    @Enumerated(EnumType.STRING)
    private UserStatus status;
}
