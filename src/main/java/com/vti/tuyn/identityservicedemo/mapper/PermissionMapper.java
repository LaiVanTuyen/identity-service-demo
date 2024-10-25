package com.vti.tuyn.identityservicedemo.mapper;

import com.vti.tuyn.identityservicedemo.dto.request.PermissionRequest;
import com.vti.tuyn.identityservicedemo.dto.response.PermissionResponse;
import com.vti.tuyn.identityservicedemo.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
