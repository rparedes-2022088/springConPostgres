package com.ada.codelabBootConPost.repository;

import com.ada.codelabBootConPost.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
