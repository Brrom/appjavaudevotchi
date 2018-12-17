package com.udevotchi.appjava.repository;

import com.udevotchi.appjava.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findById(Long id);
}
