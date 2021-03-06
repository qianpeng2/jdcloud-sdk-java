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

package com.jdcloud.sdk.service.mongodb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * dBInstanceSpec
 */
public class DBInstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符。
     */
    private String instanceName;

    /**
     * 数据库类型，MongoDB
     */
    private String engine;

    /**
     * 数据库版本，3.2
     */
    private String engineVersion;

    /**
     * 实例规格代码。mongo.s1.small：1核2G;mongo.s1.medium：2核4G;mongo.s1.large：4核8G;mongo.s1.xlarge：8核16G;mongo.s2.2xlarge：8核32G;mongo.s2.4xlarge：16核64G;
     * Required:true
     */
    @Required
    private String instanceClass;

    /**
     * 存储空间，单位GB，取值10-1000,10的倍数。
     * Required:true
     */
    @Required
    private Integer instanceStorageGB;

    /**
     * 是否选择多可用区部署
     * Required:true
     */
    @Required
    private Boolean multiAZ;

    /**
     * 可用区ID，必填，依次为primary、secondary、hidden所在的可用区ID。multiAZ选择否，则三个节点需要写相同的可用区ID；multiAZ选择是，如当前地域的可用区数量为2，则primary与secondary的可用区ID需相同，且与hidden不同；如当前地域的可用区数量大于2，则3个可用区ID均需不同。
     * Required:true
     */
    @Required
    private List<String> azId;

    /**
     * VPCID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 子网ID
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符。
     */
    private String password;

    /**
     * 按备份创建使用的具体备份ID
     */
    private String backupId;

    /**
     * 基于一个实例的备份创建新实例，如填写则restoreTime也需要填写。
     */
    private String originDBInstanceId;

    /**
     * 用户指定备份保留周期内的任意时间点，如2011-06-11T16:00:00Z，非必填，与backupId互斥。
     */
    private String restoreTime;

    /**
     * 存储类型。参考枚举参数定义，LOCAL_SSD -本地盘SSD、LOCAL_NVMe -本地盘NVMe，缺省值为：LOCAL_SSD
     */
    private String instanceStorageType;

    /**
     * 实例数据加密（存储类型为云硬盘才支持数据加密）。 false：不加密；true：加密。缺省为false。
     */
    private Boolean storageEncrypted;


    /**
     * get 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符。
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符。
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 数据库类型，MongoDB
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 数据库类型，MongoDB
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 数据库版本，3.2
     *
     * @return
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * set 数据库版本，3.2
     *
     * @param engineVersion
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * get 实例规格代码。mongo.s1.small：1核2G;mongo.s1.medium：2核4G;mongo.s1.large：4核8G;mongo.s1.xlarge：8核16G;mongo.s2.2xlarge：8核32G;mongo.s2.4xlarge：16核64G;
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 实例规格代码。mongo.s1.small：1核2G;mongo.s1.medium：2核4G;mongo.s1.large：4核8G;mongo.s1.xlarge：8核16G;mongo.s2.2xlarge：8核32G;mongo.s2.4xlarge：16核64G;
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 存储空间，单位GB，取值10-1000,10的倍数。
     *
     * @return
     */
    public Integer getInstanceStorageGB() {
        return instanceStorageGB;
    }

    /**
     * set 存储空间，单位GB，取值10-1000,10的倍数。
     *
     * @param instanceStorageGB
     */
    public void setInstanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
    }

    /**
     * get 是否选择多可用区部署
     *
     * @return
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * set 是否选择多可用区部署
     *
     * @param multiAZ
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * get 可用区ID，必填，依次为primary、secondary、hidden所在的可用区ID。multiAZ选择否，则三个节点需要写相同的可用区ID；multiAZ选择是，如当前地域的可用区数量为2，则primary与secondary的可用区ID需相同，且与hidden不同；如当前地域的可用区数量大于2，则3个可用区ID均需不同。
     *
     * @return
     */
    public List<String> getAzId() {
        return azId;
    }

    /**
     * set 可用区ID，必填，依次为primary、secondary、hidden所在的可用区ID。multiAZ选择否，则三个节点需要写相同的可用区ID；multiAZ选择是，如当前地域的可用区数量为2，则primary与secondary的可用区ID需相同，且与hidden不同；如当前地域的可用区数量大于2，则3个可用区ID均需不同。
     *
     * @param azId
     */
    public void setAzId(List<String> azId) {
        this.azId = azId;
    }

    /**
     * get VPCID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPCID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符。
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符。
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 按备份创建使用的具体备份ID
     *
     * @return
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * set 按备份创建使用的具体备份ID
     *
     * @param backupId
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * get 基于一个实例的备份创建新实例，如填写则restoreTime也需要填写。
     *
     * @return
     */
    public String getOriginDBInstanceId() {
        return originDBInstanceId;
    }

    /**
     * set 基于一个实例的备份创建新实例，如填写则restoreTime也需要填写。
     *
     * @param originDBInstanceId
     */
    public void setOriginDBInstanceId(String originDBInstanceId) {
        this.originDBInstanceId = originDBInstanceId;
    }

    /**
     * get 用户指定备份保留周期内的任意时间点，如2011-06-11T16:00:00Z，非必填，与backupId互斥。
     *
     * @return
     */
    public String getRestoreTime() {
        return restoreTime;
    }

    /**
     * set 用户指定备份保留周期内的任意时间点，如2011-06-11T16:00:00Z，非必填，与backupId互斥。
     *
     * @param restoreTime
     */
    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
    }

    /**
     * get 存储类型。参考枚举参数定义，LOCAL_SSD -本地盘SSD、LOCAL_NVMe -本地盘NVMe，缺省值为：LOCAL_SSD
     *
     * @return
     */
    public String getInstanceStorageType() {
        return instanceStorageType;
    }

    /**
     * set 存储类型。参考枚举参数定义，LOCAL_SSD -本地盘SSD、LOCAL_NVMe -本地盘NVMe，缺省值为：LOCAL_SSD
     *
     * @param instanceStorageType
     */
    public void setInstanceStorageType(String instanceStorageType) {
        this.instanceStorageType = instanceStorageType;
    }

    /**
     * get 实例数据加密（存储类型为云硬盘才支持数据加密）。 false：不加密；true：加密。缺省为false。
     *
     * @return
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * set 实例数据加密（存储类型为云硬盘才支持数据加密）。 false：不加密；true：加密。缺省为false。
     *
     * @param storageEncrypted
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }


    /**
     * set 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符。
     *
     * @param instanceName
     */
    public DBInstanceSpec instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 数据库类型，MongoDB
     *
     * @param engine
     */
    public DBInstanceSpec engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 数据库版本，3.2
     *
     * @param engineVersion
     */
    public DBInstanceSpec engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * set 实例规格代码。mongo.s1.small：1核2G;mongo.s1.medium：2核4G;mongo.s1.large：4核8G;mongo.s1.xlarge：8核16G;mongo.s2.2xlarge：8核32G;mongo.s2.4xlarge：16核64G;
     *
     * @param instanceClass
     */
    public DBInstanceSpec instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 存储空间，单位GB，取值10-1000,10的倍数。
     *
     * @param instanceStorageGB
     */
    public DBInstanceSpec instanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
        return this;
    }

    /**
     * set 是否选择多可用区部署
     *
     * @param multiAZ
     */
    public DBInstanceSpec multiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * set 可用区ID，必填，依次为primary、secondary、hidden所在的可用区ID。multiAZ选择否，则三个节点需要写相同的可用区ID；multiAZ选择是，如当前地域的可用区数量为2，则primary与secondary的可用区ID需相同，且与hidden不同；如当前地域的可用区数量大于2，则3个可用区ID均需不同。
     *
     * @param azId
     */
    public DBInstanceSpec azId(List<String> azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set VPCID
     *
     * @param vpcId
     */
    public DBInstanceSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public DBInstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符。
     *
     * @param password
     */
    public DBInstanceSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 按备份创建使用的具体备份ID
     *
     * @param backupId
     */
    public DBInstanceSpec backupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * set 基于一个实例的备份创建新实例，如填写则restoreTime也需要填写。
     *
     * @param originDBInstanceId
     */
    public DBInstanceSpec originDBInstanceId(String originDBInstanceId) {
        this.originDBInstanceId = originDBInstanceId;
        return this;
    }

    /**
     * set 用户指定备份保留周期内的任意时间点，如2011-06-11T16:00:00Z，非必填，与backupId互斥。
     *
     * @param restoreTime
     */
    public DBInstanceSpec restoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * set 存储类型。参考枚举参数定义，LOCAL_SSD -本地盘SSD、LOCAL_NVMe -本地盘NVMe，缺省值为：LOCAL_SSD
     *
     * @param instanceStorageType
     */
    public DBInstanceSpec instanceStorageType(String instanceStorageType) {
        this.instanceStorageType = instanceStorageType;
        return this;
    }

    /**
     * set 实例数据加密（存储类型为云硬盘才支持数据加密）。 false：不加密；true：加密。缺省为false。
     *
     * @param storageEncrypted
     */
    public DBInstanceSpec storageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }


    /**
     * add item to 可用区ID，必填，依次为primary、secondary、hidden所在的可用区ID。multiAZ选择否，则三个节点需要写相同的可用区ID；multiAZ选择是，如当前地域的可用区数量为2，则primary与secondary的可用区ID需相同，且与hidden不同；如当前地域的可用区数量大于2，则3个可用区ID均需不同。
     *
     * @param azId
     */
    public void addAzId(String azId) {
        if (this.azId == null) {
            this.azId = new ArrayList<>();
        }
        this.azId.add(azId);
    }

}