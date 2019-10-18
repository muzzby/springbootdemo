package com.example.springbootredis.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;


/**
 * 1、spring-boot-starter-data-redis依赖于spring-data-redis 和 lettuce
 * 2、EnableCaching来开启缓存
 *
 * @author byway
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
	
	@Override
    @Bean
	public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for (Object obj : params) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };
    }
}