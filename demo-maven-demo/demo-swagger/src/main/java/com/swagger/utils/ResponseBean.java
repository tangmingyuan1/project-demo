package com.swagger.utils;

import com.alibaba.fastjson.JSONObject;
import com.swagger.config.ProjectProperties;
import com.swagger.enums.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.io.Serializable;

public class ResponseBean<T> implements Serializable {

    @Autowired
    private ProjectProperties properties;
    private static final String OK;
    private static final String SUCCESS;
    private static final String FAIL;
    private boolean result;
    private String code;
    private String message;
    private String version;
    private T data;

    public ResponseBean() {
    }

    @PostConstruct
    public void init() {
        this.properties = this.properties;
    }

    public boolean isResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public static ResponseBean ok() {
        return ok((Object)(new JSONObject())).result(true);
    }

    public static <T> ResponseBean ok(T data) {
        return (new ResponseBean()).success().code(SUCCESS).data(data).result(true);
    }

    public static <T> ResponseBean ok(String version) {
        return (new ResponseBean()).success().code(SUCCESS).version(version).result(true);
    }

    public static <T> ResponseBean ok(String msg, T data) {
        return (new ResponseBean()).success(msg).code(SUCCESS).data(data).result(true);
    }

    public static <T> ResponseBean ok(String msg, T data, String version) {
        return (new ResponseBean()).success(msg).code(SUCCESS).data(data).version(version).result(true);
    }

    public static <T> ResponseBean ok(T data, String version) {
        return (new ResponseBean()).code(SUCCESS).data(data).version(version).result(true);
    }

    public static <T> ResponseBean ok(String msg, String code, T data) {
        return (new ResponseBean()).success(msg).code(code).data(data).result(true);
    }

    public static ResponseBean error(String msg) {
        return error(msg, (Object)(new JSONObject())).result(false);
    }

    public static ResponseBean error(String msg,String code, String version) {
        return error(msg, (Object)(new JSONObject()), (String)code, (String)version).result(false);
    }
    public static ResponseBean error(String msg, String code) {
        return error(msg, (String)code,(Object)(new JSONObject())).result(false);
    }

    public static <T> ResponseBean error(String msg, T data) {
        return (new ResponseBean()).failure(msg).code(FAIL).data(data).result(false);
    }

    public static <T> ResponseBean error(String msg, T data,String code, String version) {
        return (new ResponseBean()).failure(msg).code(FAIL).data(data).code(code).version(version).result(false);
    }


    public static <T> ResponseBean error(String msg, String code, T data) {
        return (new ResponseBean()).failure(msg).code(code).data(data).result(false);
    }


    private ResponseBean<T> success() {
        ProjectProperties properties = new ProjectProperties();
        this.message = "";
        this.version = properties.getVersion();
        this.result = true;
        return this;
    }

    private ResponseBean<T> success(String message) {
        ProjectProperties properties = new ProjectProperties();
        this.result = true;
        this.message = message;
        this.version = properties.getVersion();
        return this;
    }

    private ResponseBean<T> failure(String message) {
        ProjectProperties properties = new ProjectProperties();
        this.result = false;
        this.message = message;
        this.version = properties.getVersion();
        return this;
    }

    private ResponseBean<T> result(boolean result) {
        this.result = result;
        return this;
    }

    private ResponseBean<T> code(String code) {
        this.code = code;
        return this;
    }

    private ResponseBean<T> version(String version) {
        this.version = version;
        return this;
    }

    private ResponseBean<T> data(T data) {
        this.data = data;
        this.version = this.getVersion();
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    static {
        OK = ResultEnum.RIGHT_CODE.getCode();
        SUCCESS = ResultEnum.RIGHT_CODE.getCode();
        FAIL = ResultEnum.ERROR_CODE.getCode();
    }


}
