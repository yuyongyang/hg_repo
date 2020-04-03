package com.hg.systemGd.issm.repository;

import com.hg.systemGd.issm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  UserRepository extends JpaRepository<User,Long>  {
    @Query(value="select * from user u where u.id=:id",nativeQuery = true)
    List<User> get(@Param("id") String id);


}
