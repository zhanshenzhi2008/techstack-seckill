
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
package com.orjrs.techstack.seckill.interfaces.controller;

import com.orjrs.techstack.seckill.application.service.SeckillUserService;
import com.orjrs.techstack.seckill.domain.code.ErrorCode;
import com.orjrs.techstack.seckill.domain.model.SeckillUser;
import com.orjrs.techstack.seckill.domain.response.ResponseMessage;
import com.orjrs.techstack.seckill.domain.response.ResponseMessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 用户相关的接口
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@RestController
@RequestMapping(value = "/user")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*", originPatterns = "*")
public class SeckillUserController {

    @Autowired
    private SeckillUserService seckillUserService;
    /**
     * 测试系统
     */
    @RequestMapping(value = "/get", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseMessage<SeckillUser> getUser(@RequestParam(value = "username") String userName){
       return ResponseMessageBuilder.build(ErrorCode.SUCCESS.getCode(), seckillUserService.getSeckillUserByUserName(userName));
    }
}
