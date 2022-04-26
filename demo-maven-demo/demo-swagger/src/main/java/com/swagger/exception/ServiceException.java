package com.swagger.exception;

public class ServiceException extends RuntimeException{
    private static final long serialVersionUID = -1377442113857414950L;
    private Integer code;
    private String method;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message, Integer code, String method) {
        super(message);
        this.code = code;
        this.method = method;
    }

    public ServiceException(String message, Throwable cause, Integer code, String method) {
        super(message, cause);
        this.code = code;
        this.method = method;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ServiceException)) {
            return false;
        } else {
            ServiceException other = (ServiceException)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$code = this.code;
                Object other$code = other.code;
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                Object this$method = this.method;
                Object other$method = other.method;
                if (this$method == null) {
                    if (other$method != null) {
                        return false;
                    }
                } else if (!this$method.equals(other$method)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ServiceException;
    }

    public int hashCode() {
        boolean PRIME = true;
        int results = 1;
        Object $code = this.code;
        int result = results * 59 + ($code == null ? 43 : $code.hashCode());
        Object $method = this.method;
        result = result * 59 + ($method == null ? 43 : $method.hashCode());
        return result;
    }
}
