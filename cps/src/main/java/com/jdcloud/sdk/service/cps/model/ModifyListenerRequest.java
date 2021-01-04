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
 * 云物理服务器监听器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改监听器
 */
public class ModifyListenerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调度算法
     */
    private String algorithm;

    /**
     * 会话保持
     */
    private String stickySession;

    /**
     * 是否获取真实ip，取值范围on|off
     */
    private String realIp;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 健康检查
     */
    private String healthCheck;

    /**
     * 健康检查响应的最大超时时间
     */
    private Integer healthCheckTimeout;

    /**
     * 健康检查响应的最大间隔时间
     */
    private Integer healthCheckInterval;

    /**
     * 健康检查结果为success的阈值
     */
    private Integer healthyThreshold;

    /**
     * 健康检查结果为fail的阈值
     */
    private Integer unhealthyThreshold;

    /**
     * 服务器组id
     */
    private String serverGroupId;

    /**
     * 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 监听器ID
     * Required:true
     */
    @Required
    private String listenerId;


    /**
     * get 调度算法
     *
     * @return
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * set 调度算法
     *
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * get 会话保持
     *
     * @return
     */
    public String getStickySession() {
        return stickySession;
    }

    /**
     * set 会话保持
     *
     * @param stickySession
     */
    public void setStickySession(String stickySession) {
        this.stickySession = stickySession;
    }

    /**
     * get 是否获取真实ip，取值范围on|off
     *
     * @return
     */
    public String getRealIp() {
        return realIp;
    }

    /**
     * set 是否获取真实ip，取值范围on|off
     *
     * @param realIp
     */
    public void setRealIp(String realIp) {
        this.realIp = realIp;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 健康检查
     *
     * @return
     */
    public String getHealthCheck() {
        return healthCheck;
    }

    /**
     * set 健康检查
     *
     * @param healthCheck
     */
    public void setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * get 健康检查响应的最大超时时间
     *
     * @return
     */
    public Integer getHealthCheckTimeout() {
        return healthCheckTimeout;
    }

    /**
     * set 健康检查响应的最大超时时间
     *
     * @param healthCheckTimeout
     */
    public void setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
    }

    /**
     * get 健康检查响应的最大间隔时间
     *
     * @return
     */
    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    /**
     * set 健康检查响应的最大间隔时间
     *
     * @param healthCheckInterval
     */
    public void setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
    }

    /**
     * get 健康检查结果为success的阈值
     *
     * @return
     */
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    /**
     * set 健康检查结果为success的阈值
     *
     * @param healthyThreshold
     */
    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    /**
     * get 健康检查结果为fail的阈值
     *
     * @return
     */
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    /**
     * set 健康检查结果为fail的阈值
     *
     * @param unhealthyThreshold
     */
    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * get 服务器组id
     *
     * @return
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    /**
     * set 服务器组id
     *
     * @param serverGroupId
     */
    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * get 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 监听器ID
     *
     * @return
     */
    public String getListenerId() {
        return listenerId;
    }

    /**
     * set 监听器ID
     *
     * @param listenerId
     */
    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }


    /**
     * set 调度算法
     *
     * @param algorithm
     */
    public ModifyListenerRequest algorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * set 会话保持
     *
     * @param stickySession
     */
    public ModifyListenerRequest stickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }

    /**
     * set 是否获取真实ip，取值范围on|off
     *
     * @param realIp
     */
    public ModifyListenerRequest realIp(String realIp) {
        this.realIp = realIp;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public ModifyListenerRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public ModifyListenerRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 健康检查
     *
     * @param healthCheck
     */
    public ModifyListenerRequest healthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * set 健康检查响应的最大超时时间
     *
     * @param healthCheckTimeout
     */
    public ModifyListenerRequest healthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }

    /**
     * set 健康检查响应的最大间隔时间
     *
     * @param healthCheckInterval
     */
    public ModifyListenerRequest healthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    /**
     * set 健康检查结果为success的阈值
     *
     * @param healthyThreshold
     */
    public ModifyListenerRequest healthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    /**
     * set 健康检查结果为fail的阈值
     *
     * @param unhealthyThreshold
     */
    public ModifyListenerRequest unhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * set 服务器组id
     *
     * @param serverGroupId
     */
    public ModifyListenerRequest serverGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public ModifyListenerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 监听器ID
     *
     * @param listenerId
     */
    public ModifyListenerRequest listenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }


}