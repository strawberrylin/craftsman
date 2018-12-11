package me.wlins.neo4jdemo.repository;

import me.wlins.neo4jdemo.entity.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long>{

    @Query("match (user:User) where user.id={id} return user")
    User findById(@Param("id") long id);
}
