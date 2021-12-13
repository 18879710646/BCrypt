package com.heima.Exception;

/**
 *自定义异常：
 * 创建的是业务异常
 */
public class BusinessError extends RuntimeException{
    public BusinessError(String message){
        super(message);
    }
}
