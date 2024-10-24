package com.vti.tuyn.identityservicedemo.service;

import com.vti.tuyn.identityservicedemo.dto.request.PermissionRequest;
import com.vti.tuyn.identityservicedemo.dto.response.PermissionResponse;

import java.util.List;

public interface IPermissionService {
    PermissionResponse create(PermissionRequest request);

    List<PermissionResponse> getAll();

    void delete(String permission);
}
