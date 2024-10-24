package com.vti.tuyn.identityservicedemo.service.impl;

import com.vti.tuyn.identityservicedemo.dto.request.PermissionRequest;
import com.vti.tuyn.identityservicedemo.dto.response.PermissionResponse;
import com.vti.tuyn.identityservicedemo.entity.Permission;
import com.vti.tuyn.identityservicedemo.mapper.PermissionMapper;
import com.vti.tuyn.identityservicedemo.repository.PermissionRepository;
import com.vti.tuyn.identityservicedemo.service.IPermissionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PermissionServiceImpl implements IPermissionService {
    PermissionRepository permissionRepository;
    PermissionMapper permissionMapper;

    public PermissionResponse create(PermissionRequest request) {
        Permission permission = permissionMapper.toPermission(request);
        permission = permissionRepository.save(permission);
        return permissionMapper.toPermissionResponse(permission);
    }

    public List<PermissionResponse> getAll() {
        var permissions = permissionRepository.findAll();
        return permissions.stream().map(permissionMapper::toPermissionResponse).collect(Collectors.toList());
    }

    public void delete(String permission) {
        permissionRepository.deleteById(permission);
    }
}
