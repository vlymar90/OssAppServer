package com.ossapp.lymar.ossappserver.repository;

import com.ossapp.lymar.ossappserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}
