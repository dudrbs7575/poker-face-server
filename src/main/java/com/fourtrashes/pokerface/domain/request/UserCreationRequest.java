package com.fourtrashes.pokerface.domain.request;

import lombok.Data;

@Data
public class UserCreationRequest {
    private Long userId;
    private String userNickname;
    private String userPassword;
    private String userSalt;
    private String userName;
    private Long money;
}
