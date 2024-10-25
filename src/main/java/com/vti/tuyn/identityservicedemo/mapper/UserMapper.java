package com.vti.tuyn.identityservicedemo.mapper;

import com.vti.tuyn.identityservicedemo.dto.request.UserCreationRequest;
import com.vti.tuyn.identityservicedemo.dto.request.UserUpdateRequest;
import com.vti.tuyn.identityservicedemo.dto.response.UserResponse;
import com.vti.tuyn.identityservicedemo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
