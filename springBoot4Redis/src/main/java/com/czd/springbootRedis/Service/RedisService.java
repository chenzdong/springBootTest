package com.czd.springbootRedis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * redis操作类
 *
 * @author: czd
 * @create: 2018/7/3 16:21
 */
public class RedisService {
    @Autowired
    RedisTemplate<String,Object> template;
    @Resource(name="template")
    ValueOperations<String,Object> valueOperations;
    public String getStr(String key){
        return (String)valueOperations.get(key);
    }
    public void set(String key,Object value){
        valueOperations.set(key,value);
    }
    public void del(String key){
        template.delete(key);
    }
}
