package com.saitheja.Splitwise.repository;

import com.saitheja.Splitwise.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {
    @Override
    Optional<Group> findById(Long aLong);
}
