package com.capstone.smutaxi.dto.responses;

import com.capstone.smutaxi.dto.UserDto;

public class ResponseFactory {

    public static JoinResponse createJoinResponse(Boolean success, String message, UserDto userDto, String token) {
        return JoinResponse.builder()
                .success(success)
                .message(message)
                .userDto(userDto)
                .token(token)
                .build();
    }

    public static LoginResponse createLoginResponse(Boolean success, String message, UserDto userDto, String token) {
        return LoginResponse.builder()
                .success(success)
                .message(message)
                .userDto(userDto)
                .token(token)
                .build();
    }

    public static UserUpdateResponse createUserUpdateResponse(Boolean success, String message, UserDto userDto) {
        return UserUpdateResponse.builder()
                .success(success)
                .message(message)
                .userDto(userDto)
                .build();
    }

    public static UploadImageResponse createUploadImageResponse(Boolean success, String message, String imageUrl) {
        return UploadImageResponse.builder()
                .success(success)
                .message(message)
                .imageUrl(imageUrl)
                .build();
    }

    public static EmailVerificationResponse createEmailVerificationResponse(Boolean success, String message, Integer verificationCode) {
        return EmailVerificationResponse.builder().
                success(success).
                message(message).
                verificationCode(verificationCode).
                build();
    }

}
