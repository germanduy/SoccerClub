package com.example.eproject4.Repository;

import com.example.eproject4.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);

    @Query("SELECT r.name FROM User u JOIN u.roles r WHERE u.username = :username")
    String findFirstRoleNameByUsername(@Param("username") String username);

}
