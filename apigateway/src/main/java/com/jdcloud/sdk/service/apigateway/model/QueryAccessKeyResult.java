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
 * API调用者密钥
 * 关于API调用者密钥操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.service.apigateway.model.AccessKey;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询单个密钥
 */
public class QueryAccessKeyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * accessKey
     */
    private AccessKey accessKey;


    /**
     * get accessKey
     *
     * @return
     */
    public AccessKey getAccessKey() {
        return accessKey;
    }

    /**
     * set accessKey
     *
     * @param accessKey
     */
    public void setAccessKey(AccessKey accessKey) {
        this.accessKey = accessKey;
    }


    /**
     * set accessKey
     *
     * @param accessKey
     */
    public QueryAccessKeyResult accessKey(AccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }


}