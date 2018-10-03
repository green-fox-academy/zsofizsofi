package com.greenfox.peertopeer.repositories;

import com.greenfox.peertopeer.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
}
