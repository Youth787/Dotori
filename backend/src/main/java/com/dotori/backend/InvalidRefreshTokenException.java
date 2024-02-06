package com.dotori.backend;




public class InvalidRefreshTokenException extends RuntimeException {

    public InvalidRefreshTokenException() {
        super("Refresh token is invalid or expired.");
    }

    // 추가적인 생성자 및 메소드 정의 가능
}