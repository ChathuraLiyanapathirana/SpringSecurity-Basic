package com.appcitor.test.swsecurity.repository;

import com.appcitor.test.swsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by linuxlite on 6/27/19.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String userName);

//    @Query("SELECT t FROM User t where t.userName = :userName")
//    User findByUserName(@Param("userName") String userName);
}
