package user.example.userCRUD.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;

    private String userId;
    private String userPassword;
    private String userName;
    private Long money;

    @Enumerated(EnumType.STRING)
    private UserStatus status;
}
