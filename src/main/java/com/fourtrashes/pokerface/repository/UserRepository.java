package user.example.userCRUD.repository;

import org.springframework.stereotype.Repository;
import user.example.userCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUserNo(Long userNo);
}