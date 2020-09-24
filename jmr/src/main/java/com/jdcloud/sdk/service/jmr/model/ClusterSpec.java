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

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * clusterSpec
 */
public class ClusterSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 集群名称(不能少于6字符不能超过20字符，除下划线外不能包含特殊符号)
     * Required:true
     */
    @Required
    private String name;

    /**
     * 集群root用户密码(须包含大小写字母、数字及特殊字符其中三类，且不能少于8字符不能超过30字符)
     * Required:true
     */
    @Required
    private String password;

    /**
     * 集群版本，默认版本为JMR2.0.0
     * Required:true
     */
    @Required
    private String version;

    /**
     * 集群计费类型，支持按配置和包年包月计费
     * Required:true
     */
    @Required
    private String payType;

    /**
     * 主节点数量
     * Required:true
     */
    @Required
    private Integer masterNodeCount;

    /**
     * Master节点CPU
     */
    private Integer masterCore;

    /**
     * Master节点内存(推荐至少8G内存，否则服务可能会部署失败)
     */
    private Integer masterMemory;

    /**
     * Master系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     * Required:true
     */
    @Required
    private String masterSystemDiskType;

    /**
     * Master系统硬盘大小，单位GB
     * Required:true
     */
    @Required
    private Integer masterSystemDiskVolume;

    /**
     * Master系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     * Required:true
     */
    @Required
    private Integer masterSystemDiskIops;

    /**
     * Master数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     * Required:true
     */
    @Required
    private String masterDiskType;

    /**
     * Master数据盘大小，单位GB
     * Required:true
     */
    @Required
    private Integer masterDiskVolume;

    /**
     * Master数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     * Required:true
     */
    @Required
    private Integer masterDiskIops;

    /**
     * master节点规格
     * Required:true
     */
    @Required
    private String masterInstanceType;

    /**
     * Slave节点数量
     * Required:true
     */
    @Required
    private Integer slaveNodeCount;

    /**
     * Slave节点CPU
     */
    private Integer slaveCore;

    /**
     * Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     */
    private Integer slaveMemory;

    /**
     * Slave系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     * Required:true
     */
    @Required
    private String slaveSystemDiskType;

    /**
     * Slave系统硬盘大小，单位GB
     * Required:true
     */
    @Required
    private Integer slaveSystemDiskVolume;

    /**
     * Slave系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     * Required:true
     */
    @Required
    private Integer slaveSystemDiskIops;

    /**
     * Slave数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     * Required:true
     */
    @Required
    private String slaveDiskType;

    /**
     * Slave数据盘大小，单位GB
     * Required:true
     */
    @Required
    private Integer slaveDiskVolume;

    /**
     * Slave数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     * Required:true
     */
    @Required
    private Integer slaveDiskIops;

    /**
     * slave节点规格
     * Required:true
     */
    @Required
    private String coreInstanceType;

    /**
     * 关联JSS
     * Required:true
     */
    @Required
    private Boolean jssFlag;

    /**
     * 数据中心，即regionId
     * Required:true
     */
    @Required
    private String dataCenter;

    /**
     * 软件列表
     * Required:true
     */
    @Required
    private String softwareList;

    /**
     * 集群是否为高可用，默认为高可用集群
     * Required:true
     */
    @Required
    private Boolean haFlag;

    /**
     * Vpc网络ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * Vpc子网ID
     * Required:true
     */
    @Required
    private String vpcSubnetId;

    /**
     * 数据中心的可用区
     * Required:true
     */
    @Required
    private String az;


    /**
     * get 集群名称(不能少于6字符不能超过20字符，除下划线外不能包含特殊符号)
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 集群名称(不能少于6字符不能超过20字符，除下划线外不能包含特殊符号)
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 集群root用户密码(须包含大小写字母、数字及特殊字符其中三类，且不能少于8字符不能超过30字符)
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 集群root用户密码(须包含大小写字母、数字及特殊字符其中三类，且不能少于8字符不能超过30字符)
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 集群版本，默认版本为JMR2.0.0
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 集群版本，默认版本为JMR2.0.0
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 集群计费类型，支持按配置和包年包月计费
     *
     * @return
     */
    public String getPayType() {
        return payType;
    }

    /**
     * set 集群计费类型，支持按配置和包年包月计费
     *
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * get 主节点数量
     *
     * @return
     */
    public Integer getMasterNodeCount() {
        return masterNodeCount;
    }

    /**
     * set 主节点数量
     *
     * @param masterNodeCount
     */
    public void setMasterNodeCount(Integer masterNodeCount) {
        this.masterNodeCount = masterNodeCount;
    }

    /**
     * get Master节点CPU
     *
     * @return
     */
    public Integer getMasterCore() {
        return masterCore;
    }

    /**
     * set Master节点CPU
     *
     * @param masterCore
     */
    public void setMasterCore(Integer masterCore) {
        this.masterCore = masterCore;
    }

    /**
     * get Master节点内存(推荐至少8G内存，否则服务可能会部署失败)
     *
     * @return
     */
    public Integer getMasterMemory() {
        return masterMemory;
    }

    /**
     * set Master节点内存(推荐至少8G内存，否则服务可能会部署失败)
     *
     * @param masterMemory
     */
    public void setMasterMemory(Integer masterMemory) {
        this.masterMemory = masterMemory;
    }

    /**
     * get Master系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @return
     */
    public String getMasterSystemDiskType() {
        return masterSystemDiskType;
    }

    /**
     * set Master系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param masterSystemDiskType
     */
    public void setMasterSystemDiskType(String masterSystemDiskType) {
        this.masterSystemDiskType = masterSystemDiskType;
    }

    /**
     * get Master系统硬盘大小，单位GB
     *
     * @return
     */
    public Integer getMasterSystemDiskVolume() {
        return masterSystemDiskVolume;
    }

    /**
     * set Master系统硬盘大小，单位GB
     *
     * @param masterSystemDiskVolume
     */
    public void setMasterSystemDiskVolume(Integer masterSystemDiskVolume) {
        this.masterSystemDiskVolume = masterSystemDiskVolume;
    }

    /**
     * get Master系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @return
     */
    public Integer getMasterSystemDiskIops() {
        return masterSystemDiskIops;
    }

    /**
     * set Master系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param masterSystemDiskIops
     */
    public void setMasterSystemDiskIops(Integer masterSystemDiskIops) {
        this.masterSystemDiskIops = masterSystemDiskIops;
    }

    /**
     * get Master数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @return
     */
    public String getMasterDiskType() {
        return masterDiskType;
    }

    /**
     * set Master数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param masterDiskType
     */
    public void setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
    }

    /**
     * get Master数据盘大小，单位GB
     *
     * @return
     */
    public Integer getMasterDiskVolume() {
        return masterDiskVolume;
    }

    /**
     * set Master数据盘大小，单位GB
     *
     * @param masterDiskVolume
     */
    public void setMasterDiskVolume(Integer masterDiskVolume) {
        this.masterDiskVolume = masterDiskVolume;
    }

    /**
     * get Master数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @return
     */
    public Integer getMasterDiskIops() {
        return masterDiskIops;
    }

    /**
     * set Master数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param masterDiskIops
     */
    public void setMasterDiskIops(Integer masterDiskIops) {
        this.masterDiskIops = masterDiskIops;
    }

    /**
     * get master节点规格
     *
     * @return
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }

    /**
     * set master节点规格
     *
     * @param masterInstanceType
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    /**
     * get Slave节点数量
     *
     * @return
     */
    public Integer getSlaveNodeCount() {
        return slaveNodeCount;
    }

    /**
     * set Slave节点数量
     *
     * @param slaveNodeCount
     */
    public void setSlaveNodeCount(Integer slaveNodeCount) {
        this.slaveNodeCount = slaveNodeCount;
    }

    /**
     * get Slave节点CPU
     *
     * @return
     */
    public Integer getSlaveCore() {
        return slaveCore;
    }

    /**
     * set Slave节点CPU
     *
     * @param slaveCore
     */
    public void setSlaveCore(Integer slaveCore) {
        this.slaveCore = slaveCore;
    }

    /**
     * get Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     *
     * @return
     */
    public Integer getSlaveMemory() {
        return slaveMemory;
    }

    /**
     * set Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     *
     * @param slaveMemory
     */
    public void setSlaveMemory(Integer slaveMemory) {
        this.slaveMemory = slaveMemory;
    }

    /**
     * get Slave系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @return
     */
    public String getSlaveSystemDiskType() {
        return slaveSystemDiskType;
    }

    /**
     * set Slave系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param slaveSystemDiskType
     */
    public void setSlaveSystemDiskType(String slaveSystemDiskType) {
        this.slaveSystemDiskType = slaveSystemDiskType;
    }

    /**
     * get Slave系统硬盘大小，单位GB
     *
     * @return
     */
    public Integer getSlaveSystemDiskVolume() {
        return slaveSystemDiskVolume;
    }

    /**
     * set Slave系统硬盘大小，单位GB
     *
     * @param slaveSystemDiskVolume
     */
    public void setSlaveSystemDiskVolume(Integer slaveSystemDiskVolume) {
        this.slaveSystemDiskVolume = slaveSystemDiskVolume;
    }

    /**
     * get Slave系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @return
     */
    public Integer getSlaveSystemDiskIops() {
        return slaveSystemDiskIops;
    }

    /**
     * set Slave系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param slaveSystemDiskIops
     */
    public void setSlaveSystemDiskIops(Integer slaveSystemDiskIops) {
        this.slaveSystemDiskIops = slaveSystemDiskIops;
    }

    /**
     * get Slave数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @return
     */
    public String getSlaveDiskType() {
        return slaveDiskType;
    }

    /**
     * set Slave数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param slaveDiskType
     */
    public void setSlaveDiskType(String slaveDiskType) {
        this.slaveDiskType = slaveDiskType;
    }

    /**
     * get Slave数据盘大小，单位GB
     *
     * @return
     */
    public Integer getSlaveDiskVolume() {
        return slaveDiskVolume;
    }

    /**
     * set Slave数据盘大小，单位GB
     *
     * @param slaveDiskVolume
     */
    public void setSlaveDiskVolume(Integer slaveDiskVolume) {
        this.slaveDiskVolume = slaveDiskVolume;
    }

    /**
     * get Slave数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @return
     */
    public Integer getSlaveDiskIops() {
        return slaveDiskIops;
    }

    /**
     * set Slave数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param slaveDiskIops
     */
    public void setSlaveDiskIops(Integer slaveDiskIops) {
        this.slaveDiskIops = slaveDiskIops;
    }

    /**
     * get slave节点规格
     *
     * @return
     */
    public String getCoreInstanceType() {
        return coreInstanceType;
    }

    /**
     * set slave节点规格
     *
     * @param coreInstanceType
     */
    public void setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
    }

    /**
     * get 关联JSS
     *
     * @return
     */
    public Boolean getJssFlag() {
        return jssFlag;
    }

    /**
     * set 关联JSS
     *
     * @param jssFlag
     */
    public void setJssFlag(Boolean jssFlag) {
        this.jssFlag = jssFlag;
    }

    /**
     * get 数据中心，即regionId
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    /**
     * get 软件列表
     *
     * @return
     */
    public String getSoftwareList() {
        return softwareList;
    }

    /**
     * set 软件列表
     *
     * @param softwareList
     */
    public void setSoftwareList(String softwareList) {
        this.softwareList = softwareList;
    }

    /**
     * get 集群是否为高可用，默认为高可用集群
     *
     * @return
     */
    public Boolean getHaFlag() {
        return haFlag;
    }

    /**
     * set 集群是否为高可用，默认为高可用集群
     *
     * @param haFlag
     */
    public void setHaFlag(Boolean haFlag) {
        this.haFlag = haFlag;
    }

    /**
     * get Vpc网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set Vpc网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get Vpc子网ID
     *
     * @return
     */
    public String getVpcSubnetId() {
        return vpcSubnetId;
    }

    /**
     * set Vpc子网ID
     *
     * @param vpcSubnetId
     */
    public void setVpcSubnetId(String vpcSubnetId) {
        this.vpcSubnetId = vpcSubnetId;
    }

    /**
     * get 数据中心的可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 数据中心的可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }


    /**
     * set 集群名称(不能少于6字符不能超过20字符，除下划线外不能包含特殊符号)
     *
     * @param name
     */
    public ClusterSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 集群root用户密码(须包含大小写字母、数字及特殊字符其中三类，且不能少于8字符不能超过30字符)
     *
     * @param password
     */
    public ClusterSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 集群版本，默认版本为JMR2.0.0
     *
     * @param version
     */
    public ClusterSpec version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 集群计费类型，支持按配置和包年包月计费
     *
     * @param payType
     */
    public ClusterSpec payType(String payType) {
        this.payType = payType;
        return this;
    }

    /**
     * set 主节点数量
     *
     * @param masterNodeCount
     */
    public ClusterSpec masterNodeCount(Integer masterNodeCount) {
        this.masterNodeCount = masterNodeCount;
        return this;
    }

    /**
     * set Master节点CPU
     *
     * @param masterCore
     */
    public ClusterSpec masterCore(Integer masterCore) {
        this.masterCore = masterCore;
        return this;
    }

    /**
     * set Master节点内存(推荐至少8G内存，否则服务可能会部署失败)
     *
     * @param masterMemory
     */
    public ClusterSpec masterMemory(Integer masterMemory) {
        this.masterMemory = masterMemory;
        return this;
    }

    /**
     * set Master系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param masterSystemDiskType
     */
    public ClusterSpec masterSystemDiskType(String masterSystemDiskType) {
        this.masterSystemDiskType = masterSystemDiskType;
        return this;
    }

    /**
     * set Master系统硬盘大小，单位GB
     *
     * @param masterSystemDiskVolume
     */
    public ClusterSpec masterSystemDiskVolume(Integer masterSystemDiskVolume) {
        this.masterSystemDiskVolume = masterSystemDiskVolume;
        return this;
    }

    /**
     * set Master系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param masterSystemDiskIops
     */
    public ClusterSpec masterSystemDiskIops(Integer masterSystemDiskIops) {
        this.masterSystemDiskIops = masterSystemDiskIops;
        return this;
    }

    /**
     * set Master数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param masterDiskType
     */
    public ClusterSpec masterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }

    /**
     * set Master数据盘大小，单位GB
     *
     * @param masterDiskVolume
     */
    public ClusterSpec masterDiskVolume(Integer masterDiskVolume) {
        this.masterDiskVolume = masterDiskVolume;
        return this;
    }

    /**
     * set Master数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param masterDiskIops
     */
    public ClusterSpec masterDiskIops(Integer masterDiskIops) {
        this.masterDiskIops = masterDiskIops;
        return this;
    }

    /**
     * set master节点规格
     *
     * @param masterInstanceType
     */
    public ClusterSpec masterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }

    /**
     * set Slave节点数量
     *
     * @param slaveNodeCount
     */
    public ClusterSpec slaveNodeCount(Integer slaveNodeCount) {
        this.slaveNodeCount = slaveNodeCount;
        return this;
    }

    /**
     * set Slave节点CPU
     *
     * @param slaveCore
     */
    public ClusterSpec slaveCore(Integer slaveCore) {
        this.slaveCore = slaveCore;
        return this;
    }

    /**
     * set Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     *
     * @param slaveMemory
     */
    public ClusterSpec slaveMemory(Integer slaveMemory) {
        this.slaveMemory = slaveMemory;
        return this;
    }

    /**
     * set Slave系统硬盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param slaveSystemDiskType
     */
    public ClusterSpec slaveSystemDiskType(String slaveSystemDiskType) {
        this.slaveSystemDiskType = slaveSystemDiskType;
        return this;
    }

    /**
     * set Slave系统硬盘大小，单位GB
     *
     * @param slaveSystemDiskVolume
     */
    public ClusterSpec slaveSystemDiskVolume(Integer slaveSystemDiskVolume) {
        this.slaveSystemDiskVolume = slaveSystemDiskVolume;
        return this;
    }

    /**
     * set Slave系统硬盘iops，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param slaveSystemDiskIops
     */
    public ClusterSpec slaveSystemDiskIops(Integer slaveSystemDiskIops) {
        this.slaveSystemDiskIops = slaveSystemDiskIops;
        return this;
    }

    /**
     * set Slave数据盘类型：ssd.gp1,ssd.io1和hdd.std1
     *
     * @param slaveDiskType
     */
    public ClusterSpec slaveDiskType(String slaveDiskType) {
        this.slaveDiskType = slaveDiskType;
        return this;
    }

    /**
     * set Slave数据盘大小，单位GB
     *
     * @param slaveDiskVolume
     */
    public ClusterSpec slaveDiskVolume(Integer slaveDiskVolume) {
        this.slaveDiskVolume = slaveDiskVolume;
        return this;
    }

    /**
     * set Slave数据盘ipos，只有在硬盘类型是ssd.gp1,ssd.io1时，才需要有iops，200起步，步长为10
     *
     * @param slaveDiskIops
     */
    public ClusterSpec slaveDiskIops(Integer slaveDiskIops) {
        this.slaveDiskIops = slaveDiskIops;
        return this;
    }

    /**
     * set slave节点规格
     *
     * @param coreInstanceType
     */
    public ClusterSpec coreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }

    /**
     * set 关联JSS
     *
     * @param jssFlag
     */
    public ClusterSpec jssFlag(Boolean jssFlag) {
        this.jssFlag = jssFlag;
        return this;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public ClusterSpec dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * set 软件列表
     *
     * @param softwareList
     */
    public ClusterSpec softwareList(String softwareList) {
        this.softwareList = softwareList;
        return this;
    }

    /**
     * set 集群是否为高可用，默认为高可用集群
     *
     * @param haFlag
     */
    public ClusterSpec haFlag(Boolean haFlag) {
        this.haFlag = haFlag;
        return this;
    }

    /**
     * set Vpc网络ID
     *
     * @param vpcId
     */
    public ClusterSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set Vpc子网ID
     *
     * @param vpcSubnetId
     */
    public ClusterSpec vpcSubnetId(String vpcSubnetId) {
        this.vpcSubnetId = vpcSubnetId;
        return this;
    }

    /**
     * set 数据中心的可用区
     *
     * @param az
     */
    public ClusterSpec az(String az) {
        this.az = az;
        return this;
    }


}