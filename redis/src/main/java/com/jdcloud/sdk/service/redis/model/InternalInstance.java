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

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;

/**
 * internalInstance
 */
public class InternalInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * region
     */
    private String region;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 实例类型：master-slave表示主从版，cluster表示集群版
     */
    private String instanceType;

    /**
     * 实例状态：creating表示创建中，running表示运行中，error表示错误，changing表示变更规格中，deleting表示删除中，configuring表示修改参数中，restoring表示备份恢复中
     */
    private String instanceStatus;

    /**
     * 实例版本：包括2.8、4.0
     */
    private String instanceVersion;

    /**
     * 创建时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     */
    private String createdTime;

    /**
     * 所属VPC ID
     */
    private String vpcId;

    /**
     * 所属子网ID
     */
    private String subnetId;

    /**
     * 访问域名
     */
    private String connectionDomain;

    /**
     * 访问端口
     */
    private Integer connectionPort;

    /**
     * 连接redis实例时，是否需要密码认证，false表示无密码
     */
    private Boolean auth;

    /**
     * 前端app ip
     */
    private String frontAppIp;

    /**
     * 实例内部节点ip列表
     */
    private List<String> ips;

    /**
     * 实例内部节点所在宿主机ip列表
     */
    private List<String> hostIps;


    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get region
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set region
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例类型：master-slave表示主从版，cluster表示集群版
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型：master-slave表示主从版，cluster表示集群版
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 实例状态：creating表示创建中，running表示运行中，error表示错误，changing表示变更规格中，deleting表示删除中，configuring表示修改参数中，restoring表示备份恢复中
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态：creating表示创建中，running表示运行中，error表示错误，changing表示变更规格中，deleting表示删除中，configuring表示修改参数中，restoring表示备份恢复中
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get 实例版本：包括2.8、4.0
     *
     * @return
     */
    public String getInstanceVersion() {
        return instanceVersion;
    }

    /**
     * set 实例版本：包括2.8、4.0
     *
     * @param instanceVersion
     */
    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }

    /**
     * get 创建时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 所属VPC ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 所属VPC ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 所属子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 所属子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 访问域名
     *
     * @return
     */
    public String getConnectionDomain() {
        return connectionDomain;
    }

    /**
     * set 访问域名
     *
     * @param connectionDomain
     */
    public void setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
    }

    /**
     * get 访问端口
     *
     * @return
     */
    public Integer getConnectionPort() {
        return connectionPort;
    }

    /**
     * set 访问端口
     *
     * @param connectionPort
     */
    public void setConnectionPort(Integer connectionPort) {
        this.connectionPort = connectionPort;
    }

    /**
     * get 连接redis实例时，是否需要密码认证，false表示无密码
     *
     * @return
     */
    public Boolean getAuth() {
        return auth;
    }

    /**
     * set 连接redis实例时，是否需要密码认证，false表示无密码
     *
     * @param auth
     */
    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    /**
     * get 前端app ip
     *
     * @return
     */
    public String getFrontAppIp() {
        return frontAppIp;
    }

    /**
     * set 前端app ip
     *
     * @param frontAppIp
     */
    public void setFrontAppIp(String frontAppIp) {
        this.frontAppIp = frontAppIp;
    }

    /**
     * get 实例内部节点ip列表
     *
     * @return
     */
    public List<String> getIps() {
        return ips;
    }

    /**
     * set 实例内部节点ip列表
     *
     * @param ips
     */
    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    /**
     * get 实例内部节点所在宿主机ip列表
     *
     * @return
     */
    public List<String> getHostIps() {
        return hostIps;
    }

    /**
     * set 实例内部节点所在宿主机ip列表
     *
     * @param hostIps
     */
    public void setHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public InternalInstance pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set region
     *
     * @param region
     */
    public InternalInstance region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public InternalInstance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public InternalInstance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例类型：master-slave表示主从版，cluster表示集群版
     *
     * @param instanceType
     */
    public InternalInstance instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 实例状态：creating表示创建中，running表示运行中，error表示错误，changing表示变更规格中，deleting表示删除中，configuring表示修改参数中，restoring表示备份恢复中
     *
     * @param instanceStatus
     */
    public InternalInstance instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set 实例版本：包括2.8、4.0
     *
     * @param instanceVersion
     */
    public InternalInstance instanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }

    /**
     * set 创建时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param createdTime
     */
    public InternalInstance createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 所属VPC ID
     *
     * @param vpcId
     */
    public InternalInstance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 所属子网ID
     *
     * @param subnetId
     */
    public InternalInstance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 访问域名
     *
     * @param connectionDomain
     */
    public InternalInstance connectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }

    /**
     * set 访问端口
     *
     * @param connectionPort
     */
    public InternalInstance connectionPort(Integer connectionPort) {
        this.connectionPort = connectionPort;
        return this;
    }

    /**
     * set 连接redis实例时，是否需要密码认证，false表示无密码
     *
     * @param auth
     */
    public InternalInstance auth(Boolean auth) {
        this.auth = auth;
        return this;
    }

    /**
     * set 前端app ip
     *
     * @param frontAppIp
     */
    public InternalInstance frontAppIp(String frontAppIp) {
        this.frontAppIp = frontAppIp;
        return this;
    }

    /**
     * set 实例内部节点ip列表
     *
     * @param ips
     */
    public InternalInstance ips(List<String> ips) {
        this.ips = ips;
        return this;
    }

    /**
     * set 实例内部节点所在宿主机ip列表
     *
     * @param hostIps
     */
    public InternalInstance hostIps(List<String> hostIps) {
        this.hostIps = hostIps;
        return this;
    }


    /**
     * add item to 实例内部节点ip列表
     *
     * @param ip
     */
    public void addIp(String ip) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ip);
    }

    /**
     * add item to 实例内部节点所在宿主机ip列表
     *
     * @param hostIp
     */
    public void addHostIp(String hostIp) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        this.hostIps.add(hostIp);
    }

}