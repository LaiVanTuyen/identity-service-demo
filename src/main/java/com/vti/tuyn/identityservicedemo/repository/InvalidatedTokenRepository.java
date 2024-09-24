package com.vti.tuyn.identityservicedemo.repository;

import com.vti.tuyn.identityservicedemo.entity.InvalidatedToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {}
