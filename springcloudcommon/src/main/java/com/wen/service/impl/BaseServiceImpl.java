package com.wen.service.impl;

import com.wen.service.IBaseService;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.util.TypeUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Data
@Service
public class BaseServiceImpl<T> implements IBaseService<T> {

    private Class aClass;

    public BaseServiceImpl(){
        Type type = this.getClass().getGenericInterfaces()[0];

        Type[] types = ((ParameterizedType) type).getActualTypeArguments();

        aClass = (Class) types[0];
    }
}
