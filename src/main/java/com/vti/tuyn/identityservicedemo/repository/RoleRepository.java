package com.vti.tuyn.identityservicedemo.repository;

import com.vti.tuyn.identityservicedemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
