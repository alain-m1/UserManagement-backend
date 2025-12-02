package com.alain.usermanagementbackend.repository;

import com.alain.usermanagementbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
