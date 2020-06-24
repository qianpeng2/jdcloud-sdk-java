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
 * CoreWebConsoleAPI
 * 控制台开放API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询单个设备详细信息
 */
public class DeviceQueryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备ID
     * Required:true
     */
    @Required
    private String deviceId;

    /**
     * 区域id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例Id
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 设备ID
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备ID
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 区域id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 设备ID
     *
     * @param deviceId
     */
    public DeviceQueryRequest deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 区域id
     *
     * @param regionId
     */
    public DeviceQueryRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public DeviceQueryRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}