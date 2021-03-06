/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Domain-Management
 * 域名管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domain.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取转移密码，用于域名转移注册商转出获取域名转移密码
 */
public class GetDomainTransferOutPassWordResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 获取的转移密码，如果转移密码为空，则表示邮件已发送至域名对应的模板中的邮箱中
     */
    private String passWord;


    /**
     * get 获取的转移密码，如果转移密码为空，则表示邮件已发送至域名对应的模板中的邮箱中
     *
     * @return
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * set 获取的转移密码，如果转移密码为空，则表示邮件已发送至域名对应的模板中的邮箱中
     *
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    /**
     * set 获取的转移密码，如果转移密码为空，则表示邮件已发送至域名对应的模板中的邮箱中
     *
     * @param passWord
     */
    public GetDomainTransferOutPassWordResult passWord(String passWord) {
        this.passWord = passWord;
        return this;
    }


}