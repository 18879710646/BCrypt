package com.heima.Exception;

import org.omg.CORBA.SystemException;

/**
 *自定义异常
 * 创建一个系统异常
 */
public class SysError extends RuntimeException {
    public SysError(String message){
        super(message);
    }
}
