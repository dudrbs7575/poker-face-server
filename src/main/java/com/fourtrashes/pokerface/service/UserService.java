package com.fourtrashes.pokerface.service;

import com.fourtrashes.pokerface.domain.User;
import com.fourtrashes.pokerface.domain.request.UserCreationRequest;
import com.fourtrashes.pokerface.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User createUser(UserCreationRequest userInfo){
        User user = new User();
        log.info(userInfo.toString());
        //        BeanUtils.copyProperties(user,userInfo);
        System.out.println("user = " + user);
        user.setUserId(userInfo.getUserId());
        user.setUserNickname(userInfo.getUserNickname());
        user.setUserPassword(passwordEncoder.encode(userInfo.getUserPassword()));
//        user.setUserPassword(userInfo.getUserPassword());
//        log.info(passwordEncoder.encode(userInfo.getUserPassword()));
        user.setUserSalt(passwordEncoder.encode(userInfo.getUserSalt()));
//        user.setUserSalt(userInfo.getUserSalt());
        user.setUserName(userInfo.getUserName());
        user.setMoney(userInfo.getMoney());
        log.info(user.toString());
        return userRepository.save(user);
    }
}
