package com.fourtrashes.pokerface.repository;

import com.fourtrashes.pokerface.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUserNo(Long userNo);
}