package com.vti.tuyn.identityservicedemo.repository;

import com.vti.tuyn.identityservicedemo.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
