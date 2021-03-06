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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;


/**
 * ipv6Gateway
 */
public class Ipv6Gateway  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域，如cn-north-1
     */
    private String region;

    /**
     * IPv6网关实例ID
     */
    private String ipv6GatewayId;

    /**
     * IPv6网关名称
     */
    private String ipv6GatewayName;

    /**
     * 私有网络ID
     */
    private String vpcId;

    /**
     * 私有网络名称
     */
    private String vpcName;

    /**
     * 创建时间
     */
    private String createTime;


    /**
     * get 地域，如cn-north-1
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域，如cn-north-1
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get IPv6网关实例ID
     *
     * @return
     */
    public String getIpv6GatewayId() {
        return ipv6GatewayId;
    }

    /**
     * set IPv6网关实例ID
     *
     * @param ipv6GatewayId
     */
    public void setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
    }

    /**
     * get IPv6网关名称
     *
     * @return
     */
    public String getIpv6GatewayName() {
        return ipv6GatewayName;
    }

    /**
     * set IPv6网关名称
     *
     * @param ipv6GatewayName
     */
    public void setIpv6GatewayName(String ipv6GatewayName) {
        this.ipv6GatewayName = ipv6GatewayName;
    }

    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 私有网络名称
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set 私有网络名称
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 地域，如cn-north-1
     *
     * @param region
     */
    public Ipv6Gateway region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set IPv6网关实例ID
     *
     * @param ipv6GatewayId
     */
    public Ipv6Gateway ipv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }

    /**
     * set IPv6网关名称
     *
     * @param ipv6GatewayName
     */
    public Ipv6Gateway ipv6GatewayName(String ipv6GatewayName) {
        this.ipv6GatewayName = ipv6GatewayName;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public Ipv6Gateway vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 私有网络名称
     *
     * @param vpcName
     */
    public Ipv6Gateway vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public Ipv6Gateway createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}