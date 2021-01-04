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
 * Cloud-Physical-Server
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.cps.model.ReinstallInstanceSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 重装云物理服务器，只能重装stopped状态的服务器&lt;br/&gt;
- 可调用接口（describeOS）获取云物理服务器支持的操作系统列表
 [MFA enabled]
 */
public class ReinstallInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     */
    private String clientToken;

    /**
     * 云物理服务器配置
     * Required:true
     */
    @Required
    private ReinstallInstanceSpec instanceSpec;

    /**
     * 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云物理服务器ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 云物理服务器配置
     *
     * @return
     */
    public ReinstallInstanceSpec getInstanceSpec() {
        return instanceSpec;
    }

    /**
     * set 云物理服务器配置
     *
     * @param instanceSpec
     */
    public void setInstanceSpec(ReinstallInstanceSpec instanceSpec) {
        this.instanceSpec = instanceSpec;
    }

    /**
     * get 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云物理服务器ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云物理服务器ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @param clientToken
     */
    public ReinstallInstanceRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 云物理服务器配置
     *
     * @param instanceSpec
     */
    public ReinstallInstanceRequest instanceSpec(ReinstallInstanceSpec instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public ReinstallInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云物理服务器ID
     *
     * @param instanceId
     */
    public ReinstallInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}