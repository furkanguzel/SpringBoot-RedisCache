package com.furkanguzel.redisapp.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "specialRedisCache")
    public String longRunningMethod() throws InterruptedException {
        Thread.sleep(5000L);
        return "method worked.";
    }

    @CacheEvict(cacheNames = "specialRedisCache")
    public void clearCache(){
        System.out.println("Cache Cleared");
    }

}
