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
 * 云物理服务器IPv6地址操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.cps.model.Ipv6AddressSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 申请IPv6地址带宽

 */
public class AssignIpv6AddressesBandwidthRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     */
    private String clientToken;

    /**
     * IPv6地址配置
     * Required:true
     */
    @Required
    private Ipv6AddressSpec ipv6AddressSpec;

    /**
     * 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;


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
     * get IPv6地址配置
     *
     * @return
     */
    public Ipv6AddressSpec getIpv6AddressSpec() {
        return ipv6AddressSpec;
    }

    /**
     * set IPv6地址配置
     *
     * @param ipv6AddressSpec
     */
    public void setIpv6AddressSpec(Ipv6AddressSpec ipv6AddressSpec) {
        this.ipv6AddressSpec = ipv6AddressSpec;
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
     * set 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @param clientToken
     */
    public AssignIpv6AddressesBandwidthRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set IPv6地址配置
     *
     * @param ipv6AddressSpec
     */
    public AssignIpv6AddressesBandwidthRequest ipv6AddressSpec(Ipv6AddressSpec ipv6AddressSpec) {
        this.ipv6AddressSpec = ipv6AddressSpec;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public AssignIpv6AddressesBandwidthRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}