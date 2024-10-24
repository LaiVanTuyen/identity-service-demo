package com.vti.tuyn.identityservicedemo.service;

import com.vti.tuyn.identityservicedemo.dto.request.UserCreationRequest;
import com.vti.tuyn.identityservicedemo.dto.request.UserUpdateRequest;
import com.vti.tuyn.identityservicedemo.dto.response.UserResponse;

import java.util.List;

public interface IUserService {
    UserResponse createUser(UserCreationRequest request);

    UserResponse getMyInfo();

    UserResponse updateUser(String userId, UserUpdateRequest request);

    void deleteUser(String userId);

    List<UserResponse> getUsers();

    UserResponse getUser(String id);
}
