package com.company.secondhand.user.repository;

import com.company.secondhand.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
