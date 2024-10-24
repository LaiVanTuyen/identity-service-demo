package com.vti.tuyn.identityservicedemo.service;

import com.nimbusds.jose.JOSEException;
import com.vti.tuyn.identityservicedemo.dto.request.AuthenticationRequest;
import com.vti.tuyn.identityservicedemo.dto.request.IntrospectRequest;
import com.vti.tuyn.identityservicedemo.dto.request.LogoutRequest;
import com.vti.tuyn.identityservicedemo.dto.request.RefreshRequest;
import com.vti.tuyn.identityservicedemo.dto.response.AuthenticationResponse;
import com.vti.tuyn.identityservicedemo.dto.response.IntrospectResponse;

import java.text.ParseException;

public interface IAuthenticationService {
    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;

    AuthenticationResponse authenticate(AuthenticationRequest request);

    void logout(LogoutRequest request) throws ParseException, JOSEException;

    AuthenticationResponse refreshToken(RefreshRequest request) throws ParseException, JOSEException;
}
