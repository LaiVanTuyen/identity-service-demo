package com.vti.tuyn.identityservicedemo.service;


import com.vti.tuyn.identityservicedemo.dto.request.RoleRequest;
import com.vti.tuyn.identityservicedemo.dto.response.RoleResponse;

import java.util.List;

public interface IRoleService {
    RoleResponse create(RoleRequest request);

    List<RoleResponse> getAll();

    void delete(String role);
}
