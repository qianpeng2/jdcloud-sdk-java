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

package com.jdcloud.sdk.service.iotcore.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 设备拓扑信息
 */
public class DeviceTopoInfoVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代理设备ID
     * Required:true
     */
    @Required
    private String deviceId;

    /**
     * 代理设备名称
     */
    private String deviceName;

    /**
     * 物类型名
     * Required:true
     */
    @Required
    private String thingTypeName;

    /**
     * subDevices
     * Required:true
     */
    @Required
    private List<SubDeviceInfoVO> subDevices;


    /**
     * get 代理设备ID
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 代理设备ID
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 代理设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 代理设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 物类型名
     *
     * @return
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * set 物类型名
     *
     * @param thingTypeName
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * get subDevices
     *
     * @return
     */
    public List<SubDeviceInfoVO> getSubDevices() {
        return subDevices;
    }

    /**
     * set subDevices
     *
     * @param subDevices
     */
    public void setSubDevices(List<SubDeviceInfoVO> subDevices) {
        this.subDevices = subDevices;
    }


    /**
     * set 代理设备ID
     *
     * @param deviceId
     */
    public DeviceTopoInfoVO deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 代理设备名称
     *
     * @param deviceName
     */
    public DeviceTopoInfoVO deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 物类型名
     *
     * @param thingTypeName
     */
    public DeviceTopoInfoVO thingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * set subDevices
     *
     * @param subDevices
     */
    public DeviceTopoInfoVO subDevices(List<SubDeviceInfoVO> subDevices) {
        this.subDevices = subDevices;
        return this;
    }


    /**
     * add item to subDevices
     *
     * @param subDevice
     */
    public void addSubDevice(SubDeviceInfoVO subDevice) {
        if (this.subDevices == null) {
            this.subDevices = new ArrayList<>();
        }
        this.subDevices.add(subDevice);
    }

}