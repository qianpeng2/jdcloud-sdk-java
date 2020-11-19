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

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * dBInstanceAttribute
 */
public class DBInstanceAttribute  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     */
    private String instanceName;

    /**
     * 实例类型，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceType;

    /**
     * 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String engine;

    /**
     * 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String engineVersion;

    /**
     * 实例规格代码
     */
    private String instanceClass;

    /**
     * 存储类型，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceStorageType;

    /**
     * 实例数据加密. false：不加密; true：加密
     */
    private Boolean storageEncrypted;

    /**
     * 磁盘，单位GB
     */
    private Integer instanceStorageGB;

    /**
     * CPU核数
     */
    private Integer instanceCPU;

    /**
     * 内存大小，单位MB
     */
    private Integer instanceMemoryMB;

    /**
     * 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     */
    private String regionId;

    /**
     * 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     */
    private List<String> azId;

    /**
     * VPC的ID
     */
    private String vpcId;

    /**
     * 子网的ID
     */
    private String subnetId;

    /**
     * 参数组的ID&lt;br&gt;- 仅支持MySQL
     */
    private String parameterGroupId;

    /**
     * 参数组的名称&lt;br&gt;- 仅支持MySQL
     */
    private String parameterGroupName;

    /**
     * 参数的状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     */
    private String parameterStatus;

    /**
     * 实例内网域名
     */
    private String internalDomainName;

    /**
     * 实例公网域名
     */
    private String publicDomainName;

    /**
     * 应用访问端口
     */
    private String instancePort;

    /**
     * 访问模式，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     */
    private String connectionMode;

    /**
     * 审计状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     */
    private String auditStatus;

    /**
     * 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceStatus;

    /**
     * 实例创建时间
     */
    private String createTime;

    /**
     * 计费配置
     */
    private Charge charge;

    /**
     * MySQL只读实例对应的主实例ID&lt;br&gt;- 仅支持MySQL
     */
    private String sourceInstanceId;

    /**
     * 只读实例ID列表&lt;br&gt;- 仅支持MySQL
     */
    private List<String> roInstanceIds;

    /**
     * 高可用集群中主节点的信息&lt;br&gt;- 仅支持SQL Server
     */
    private DBInstanceNode primaryNode;

    /**
     * 高可用集群中从节点的信息&lt;br&gt;- 仅支持SQL Server
     */
    private DBInstanceNode secondaryNode;

    /**
     * 标签信息
     */
    private List<Tag> tags;

    /**
     * 对接的目录服务的相关信息&lt;br&gt;仅支SQL Server
     */
    private ADService activeDirectory;

    /**
     * 只读代理服务 ID
     */
    private String roInstanceProxyID;

    /**
     * 只读代理服务 名称
     */
    private String roInstanceProxyName;

    /**
     * 读写分离代理服务 ID
     */
    private String readWriteProxyId;

    /**
     * 实例关联的数据同步任务Id；未关联数据同步任务时返回空
     */
    private String syncTaskId;

    /**
     * 实例内网域名解析到的内网IP地址&lt;br&gt;仅支持MySQL, Percona, MariaDB
     */
    private String instanceVip;


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
     * get 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例类型，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * set 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engineVersion
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * get 实例规格代码
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 实例规格代码
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 存储类型，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceStorageType() {
        return instanceStorageType;
    }

    /**
     * set 存储类型，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStorageType
     */
    public void setInstanceStorageType(String instanceStorageType) {
        this.instanceStorageType = instanceStorageType;
    }

    /**
     * get 实例数据加密. false：不加密; true：加密
     *
     * @return
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * set 实例数据加密. false：不加密; true：加密
     *
     * @param storageEncrypted
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * get 磁盘，单位GB
     *
     * @return
     */
    public Integer getInstanceStorageGB() {
        return instanceStorageGB;
    }

    /**
     * set 磁盘，单位GB
     *
     * @param instanceStorageGB
     */
    public void setInstanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
    }

    /**
     * get CPU核数
     *
     * @return
     */
    public Integer getInstanceCPU() {
        return instanceCPU;
    }

    /**
     * set CPU核数
     *
     * @param instanceCPU
     */
    public void setInstanceCPU(Integer instanceCPU) {
        this.instanceCPU = instanceCPU;
    }

    /**
     * get 内存大小，单位MB
     *
     * @return
     */
    public Integer getInstanceMemoryMB() {
        return instanceMemoryMB;
    }

    /**
     * set 内存大小，单位MB
     *
     * @param instanceMemoryMB
     */
    public void setInstanceMemoryMB(Integer instanceMemoryMB) {
        this.instanceMemoryMB = instanceMemoryMB;
    }

    /**
     * get 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public List<String> getAzId() {
        return azId;
    }

    /**
     * set 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param azId
     */
    public void setAzId(List<String> azId) {
        this.azId = azId;
    }

    /**
     * get VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网的ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网的ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 参数组的ID&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public String getParameterGroupId() {
        return parameterGroupId;
    }

    /**
     * set 参数组的ID&lt;br&gt;- 仅支持MySQL
     *
     * @param parameterGroupId
     */
    public void setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
    }

    /**
     * get 参数组的名称&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * set 参数组的名称&lt;br&gt;- 仅支持MySQL
     *
     * @param parameterGroupName
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * get 参数的状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public String getParameterStatus() {
        return parameterStatus;
    }

    /**
     * set 参数的状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @param parameterStatus
     */
    public void setParameterStatus(String parameterStatus) {
        this.parameterStatus = parameterStatus;
    }

    /**
     * get 实例内网域名
     *
     * @return
     */
    public String getInternalDomainName() {
        return internalDomainName;
    }

    /**
     * set 实例内网域名
     *
     * @param internalDomainName
     */
    public void setInternalDomainName(String internalDomainName) {
        this.internalDomainName = internalDomainName;
    }

    /**
     * get 实例公网域名
     *
     * @return
     */
    public String getPublicDomainName() {
        return publicDomainName;
    }

    /**
     * set 实例公网域名
     *
     * @param publicDomainName
     */
    public void setPublicDomainName(String publicDomainName) {
        this.publicDomainName = publicDomainName;
    }

    /**
     * get 应用访问端口
     *
     * @return
     */
    public String getInstancePort() {
        return instancePort;
    }

    /**
     * set 应用访问端口
     *
     * @param instancePort
     */
    public void setInstancePort(String instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * get 访问模式，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public String getConnectionMode() {
        return connectionMode;
    }

    /**
     * set 访问模式，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @param connectionMode
     */
    public void setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
    }

    /**
     * get 审计状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * set 审计状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @param auditStatus
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * get 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get 实例创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get MySQL只读实例对应的主实例ID&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    /**
     * set MySQL只读实例对应的主实例ID&lt;br&gt;- 仅支持MySQL
     *
     * @param sourceInstanceId
     */
    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    /**
     * get 只读实例ID列表&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public List<String> getRoInstanceIds() {
        return roInstanceIds;
    }

    /**
     * set 只读实例ID列表&lt;br&gt;- 仅支持MySQL
     *
     * @param roInstanceIds
     */
    public void setRoInstanceIds(List<String> roInstanceIds) {
        this.roInstanceIds = roInstanceIds;
    }

    /**
     * get 高可用集群中主节点的信息&lt;br&gt;- 仅支持SQL Server
     *
     * @return
     */
    public DBInstanceNode getPrimaryNode() {
        return primaryNode;
    }

    /**
     * set 高可用集群中主节点的信息&lt;br&gt;- 仅支持SQL Server
     *
     * @param primaryNode
     */
    public void setPrimaryNode(DBInstanceNode primaryNode) {
        this.primaryNode = primaryNode;
    }

    /**
     * get 高可用集群中从节点的信息&lt;br&gt;- 仅支持SQL Server
     *
     * @return
     */
    public DBInstanceNode getSecondaryNode() {
        return secondaryNode;
    }

    /**
     * set 高可用集群中从节点的信息&lt;br&gt;- 仅支持SQL Server
     *
     * @param secondaryNode
     */
    public void setSecondaryNode(DBInstanceNode secondaryNode) {
        this.secondaryNode = secondaryNode;
    }

    /**
     * get 标签信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set 标签信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * get 对接的目录服务的相关信息&lt;br&gt;仅支SQL Server
     *
     * @return
     */
    public ADService getActiveDirectory() {
        return activeDirectory;
    }

    /**
     * set 对接的目录服务的相关信息&lt;br&gt;仅支SQL Server
     *
     * @param activeDirectory
     */
    public void setActiveDirectory(ADService activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    /**
     * get 只读代理服务 ID
     *
     * @return
     */
    public String getRoInstanceProxyID() {
        return roInstanceProxyID;
    }

    /**
     * set 只读代理服务 ID
     *
     * @param roInstanceProxyID
     */
    public void setRoInstanceProxyID(String roInstanceProxyID) {
        this.roInstanceProxyID = roInstanceProxyID;
    }

    /**
     * get 只读代理服务 名称
     *
     * @return
     */
    public String getRoInstanceProxyName() {
        return roInstanceProxyName;
    }

    /**
     * set 只读代理服务 名称
     *
     * @param roInstanceProxyName
     */
    public void setRoInstanceProxyName(String roInstanceProxyName) {
        this.roInstanceProxyName = roInstanceProxyName;
    }

    /**
     * get 读写分离代理服务 ID
     *
     * @return
     */
    public String getReadWriteProxyId() {
        return readWriteProxyId;
    }

    /**
     * set 读写分离代理服务 ID
     *
     * @param readWriteProxyId
     */
    public void setReadWriteProxyId(String readWriteProxyId) {
        this.readWriteProxyId = readWriteProxyId;
    }

    /**
     * get 实例关联的数据同步任务Id；未关联数据同步任务时返回空
     *
     * @return
     */
    public String getSyncTaskId() {
        return syncTaskId;
    }

    /**
     * set 实例关联的数据同步任务Id；未关联数据同步任务时返回空
     *
     * @param syncTaskId
     */
    public void setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    /**
     * get 实例内网域名解析到的内网IP地址&lt;br&gt;仅支持MySQL, Percona, MariaDB
     *
     * @return
     */
    public String getInstanceVip() {
        return instanceVip;
    }

    /**
     * set 实例内网域名解析到的内网IP地址&lt;br&gt;仅支持MySQL, Percona, MariaDB
     *
     * @param instanceVip
     */
    public void setInstanceVip(String instanceVip) {
        this.instanceVip = instanceVip;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DBInstanceAttribute instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public DBInstanceAttribute instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例类型，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceType
     */
    public DBInstanceAttribute instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engine
     */
    public DBInstanceAttribute engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engineVersion
     */
    public DBInstanceAttribute engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * set 实例规格代码
     *
     * @param instanceClass
     */
    public DBInstanceAttribute instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 存储类型，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStorageType
     */
    public DBInstanceAttribute instanceStorageType(String instanceStorageType) {
        this.instanceStorageType = instanceStorageType;
        return this;
    }

    /**
     * set 实例数据加密. false：不加密; true：加密
     *
     * @param storageEncrypted
     */
    public DBInstanceAttribute storageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * set 磁盘，单位GB
     *
     * @param instanceStorageGB
     */
    public DBInstanceAttribute instanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
        return this;
    }

    /**
     * set CPU核数
     *
     * @param instanceCPU
     */
    public DBInstanceAttribute instanceCPU(Integer instanceCPU) {
        this.instanceCPU = instanceCPU;
        return this;
    }

    /**
     * set 内存大小，单位MB
     *
     * @param instanceMemoryMB
     */
    public DBInstanceAttribute instanceMemoryMB(Integer instanceMemoryMB) {
        this.instanceMemoryMB = instanceMemoryMB;
        return this;
    }

    /**
     * set 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DBInstanceAttribute regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param azId
     */
    public DBInstanceAttribute azId(List<String> azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set VPC的ID
     *
     * @param vpcId
     */
    public DBInstanceAttribute vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网的ID
     *
     * @param subnetId
     */
    public DBInstanceAttribute subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 参数组的ID&lt;br&gt;- 仅支持MySQL
     *
     * @param parameterGroupId
     */
    public DBInstanceAttribute parameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }

    /**
     * set 参数组的名称&lt;br&gt;- 仅支持MySQL
     *
     * @param parameterGroupName
     */
    public DBInstanceAttribute parameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * set 参数的状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @param parameterStatus
     */
    public DBInstanceAttribute parameterStatus(String parameterStatus) {
        this.parameterStatus = parameterStatus;
        return this;
    }

    /**
     * set 实例内网域名
     *
     * @param internalDomainName
     */
    public DBInstanceAttribute internalDomainName(String internalDomainName) {
        this.internalDomainName = internalDomainName;
        return this;
    }

    /**
     * set 实例公网域名
     *
     * @param publicDomainName
     */
    public DBInstanceAttribute publicDomainName(String publicDomainName) {
        this.publicDomainName = publicDomainName;
        return this;
    }

    /**
     * set 应用访问端口
     *
     * @param instancePort
     */
    public DBInstanceAttribute instancePort(String instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * set 访问模式，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @param connectionMode
     */
    public DBInstanceAttribute connectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }

    /**
     * set 审计状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- 仅支持MySQL
     *
     * @param auditStatus
     */
    public DBInstanceAttribute auditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public DBInstanceAttribute instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public DBInstanceAttribute createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public DBInstanceAttribute charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set MySQL只读实例对应的主实例ID&lt;br&gt;- 仅支持MySQL
     *
     * @param sourceInstanceId
     */
    public DBInstanceAttribute sourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * set 只读实例ID列表&lt;br&gt;- 仅支持MySQL
     *
     * @param roInstanceIds
     */
    public DBInstanceAttribute roInstanceIds(List<String> roInstanceIds) {
        this.roInstanceIds = roInstanceIds;
        return this;
    }

    /**
     * set 高可用集群中主节点的信息&lt;br&gt;- 仅支持SQL Server
     *
     * @param primaryNode
     */
    public DBInstanceAttribute primaryNode(DBInstanceNode primaryNode) {
        this.primaryNode = primaryNode;
        return this;
    }

    /**
     * set 高可用集群中从节点的信息&lt;br&gt;- 仅支持SQL Server
     *
     * @param secondaryNode
     */
    public DBInstanceAttribute secondaryNode(DBInstanceNode secondaryNode) {
        this.secondaryNode = secondaryNode;
        return this;
    }

    /**
     * set 标签信息
     *
     * @param tags
     */
    public DBInstanceAttribute tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 对接的目录服务的相关信息&lt;br&gt;仅支SQL Server
     *
     * @param activeDirectory
     */
    public DBInstanceAttribute activeDirectory(ADService activeDirectory) {
        this.activeDirectory = activeDirectory;
        return this;
    }

    /**
     * set 只读代理服务 ID
     *
     * @param roInstanceProxyID
     */
    public DBInstanceAttribute roInstanceProxyID(String roInstanceProxyID) {
        this.roInstanceProxyID = roInstanceProxyID;
        return this;
    }

    /**
     * set 只读代理服务 名称
     *
     * @param roInstanceProxyName
     */
    public DBInstanceAttribute roInstanceProxyName(String roInstanceProxyName) {
        this.roInstanceProxyName = roInstanceProxyName;
        return this;
    }

    /**
     * set 读写分离代理服务 ID
     *
     * @param readWriteProxyId
     */
    public DBInstanceAttribute readWriteProxyId(String readWriteProxyId) {
        this.readWriteProxyId = readWriteProxyId;
        return this;
    }

    /**
     * set 实例关联的数据同步任务Id；未关联数据同步任务时返回空
     *
     * @param syncTaskId
     */
    public DBInstanceAttribute syncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }

    /**
     * set 实例内网域名解析到的内网IP地址&lt;br&gt;仅支持MySQL, Percona, MariaDB
     *
     * @param instanceVip
     */
    public DBInstanceAttribute instanceVip(String instanceVip) {
        this.instanceVip = instanceVip;
        return this;
    }


    /**
     * add item to 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param azId
     */
    public void addAzId(String azId) {
        if (this.azId == null) {
            this.azId = new ArrayList<>();
        }
        this.azId.add(azId);
    }

    /**
     * add item to 只读实例ID列表&lt;br&gt;- 仅支持MySQL
     *
     * @param roInstanceId
     */
    public void addRoInstanceId(String roInstanceId) {
        if (this.roInstanceIds == null) {
            this.roInstanceIds = new ArrayList<>();
        }
        this.roInstanceIds.add(roInstanceId);
    }

    /**
     * add item to 标签信息
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}