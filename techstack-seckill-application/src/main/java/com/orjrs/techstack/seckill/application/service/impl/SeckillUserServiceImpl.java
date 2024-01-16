/**
 * Copyright 2022-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.orjrs.techstack.seckill.application.service.impl;

import com.orjrs.techstack.seckill.application.service.SeckillUserService;
import com.orjrs.techstack.seckill.domain.model.SeckillUser;
import com.orjrs.techstack.seckill.domain.repository.SeckillUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 用户Service
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Service
public class SeckillUserServiceImpl implements SeckillUserService {
    @Autowired
    private SeckillUserRepository seckillUserRepository;


    @Override
    public SeckillUser getSeckillUserByUserName(String userName) {
        return seckillUserRepository.getSeckillUserByUserName(userName);
    }
}