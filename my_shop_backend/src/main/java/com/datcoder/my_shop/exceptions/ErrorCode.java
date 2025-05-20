package com.datcoder.my_shop.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPYION(404,"no pound",HttpStatus.INTERNAL_SERVER_ERROR);
    private ErrorCode(int code, String message, HttpStatusCode status) {

        this.code = code;
        this.message = message;
        this.statusCode = status;
    }
    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;
}
