package com.vti.tuyn.identityservicedemo.mapper;

import com.vti.tuyn.identityservicedemo.dto.request.RoleRequest;
import com.vti.tuyn.identityservicedemo.dto.response.RoleResponse;
import com.vti.tuyn.identityservicedemo.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
