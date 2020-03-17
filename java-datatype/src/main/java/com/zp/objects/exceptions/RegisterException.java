package com.zp.objects.exceptions;

/**
 * 自定义异常
 *
 * @author zhoupeng
 */

public class RegisterException extends Exception {
    public RegisterException() {
        super();
    }

    public RegisterException(String message) {
        super(message);
    }
}
