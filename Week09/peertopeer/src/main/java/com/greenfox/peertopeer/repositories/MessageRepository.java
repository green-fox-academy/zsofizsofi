package com.greenfox.peertopeer.repositories;

import com.greenfox.peertopeer.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository <Message, Long> {
}
