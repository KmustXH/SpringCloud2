package com.xh.feign.impl;

import com.xh.entity.entity.Student;
import com.xh.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProviderClient {
    public FeignError() {
        super();
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。。。。";
    }
}
