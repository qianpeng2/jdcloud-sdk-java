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

import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * instance
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云物理服务器实例ID
     */
    private String instanceId;

    /**
     * 区域代码, 如 cn-north-1
     */
    private String region;

    /**
     * 可用区, 如 cn-north-1a
     */
    private String az;

    /**
     * 实例类型, 如 cps.c.normal
     */
    private String deviceType;

    /**
     * 云物理服务器名称
     */
    private String name;

    /**
     * 云物理服务器描述
     */
    private String description;

    /**
     * 云物理服务器生命周期状态
     */
    private String status;

    /**
     * 是否启用外网, 如 yes/no
     */
    private String enableInternet;

    /**
     * 是否启用IPv6, 如 yes/no
     */
    private String enableIpv6;

    /**
     * 带宽, 单位Mbps
     */
    private Integer bandwidth;

    /**
     * 镜像类型, 如 standard
     */
    private String imageType;

    /**
     * 操作系统类型ID
     */
    private String osTypeId;

    /**
     * 操作系统名称
     */
    private String osName;

    /**
     * 操作系统类型, 如 ubuntu/centos
     */
    private String osType;

    /**
     * 操作系统版本, 如 16.04
     */
    private String osVersion;

    /**
     * 系统盘RAID类型ID
     */
    private String sysRaidTypeId;

    /**
     * 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     */
    private String sysRaidType;

    /**
     * 数据盘RAID类型ID
     */
    private String dataRaidTypeId;

    /**
     * 数据盘RAID类型, 如 NORAID, RAID0, RAID1，RAID10
     */
    private String dataRaidType;

    /**
     * 网络类型：basic（基础网络）、vpc（私有网络）、retail（零售中台网络）
     */
    private String networkType;

    /**
     * 私有网络ID
     */
    private String vpcId;

    /**
     * 私有网络名称
     */
    private String vpcName;

    /**
     * 私有网络IPv4 CIDR
     */
    private String vpcIpv4Cidr;

    /**
     * 私有网络IPv6 CIDR
     */
    private String vpcIpv6Cidr;

    /**
     * IPv6网关ID
     */
    private String ipv6GatewayId;

    /**
     * 子网编号
     */
    private String subnetId;

    /**
     * 子网名称
     */
    private String subnetName;

    /**
     * 子网IPv4 CIDR
     */
    private String subnetIpv4Cidr;

    /**
     * 子网IPv6 CIDR
     */
    private String subnetIpv6Cidr;

    /**
     * 内网IP
     */
    private String privateIp;

    /**
     * 外网链路类型, 如 bgp
     */
    private String lineType;

    /**
     * 弹性公网IPID
     */
    private String elasticIpId;

    /**
     * 公网IP
     */
    private String publicIp;

    /**
     * IPv6地址
     */
    private String ipv6Address;

    /**
     * 公网IPv6地址ID
     */
    private String ipv6AddressId;

    /**
     * 公网IPv6带宽, 单位Mbps
     */
    private Integer ipv6AddressBandwidth;

    /**
     * 网络接口模式：bond（网口bond）、dual（双网口）
     */
    private String interfaceMode;

    /**
     * 辅网口私有网络ID
     */
    private String extensionVpcId;

    /**
     * 辅网口私有网络名称
     */
    private String extensionVpcName;

    /**
     * 辅网口私有网络IPv4 CIDR
     */
    private String extensionVpcIpv4Cidr;

    /**
     * 辅网口私有网络IPv6 CIDR
     */
    private String extensionVpcIpv6Cidr;

    /**
     * 辅网口子网ID
     */
    private String extensionSubnetId;

    /**
     * 辅网口子网名称
     */
    private String extensionSubnetName;

    /**
     * 辅网口子网IPv4 CIDR
     */
    private String extensionSubnetIpv4Cidr;

    /**
     * 辅网口子网IPv6 CIDR
     */
    private String extensionSubnetIpv6Cidr;

    /**
     * 辅网口手动分配的内网ip
     */
    private String extensionPrivateIp;

    /**
     * 辅网口是否启用外网
     */
    private String extensionEnableInternet;

    /**
     * 辅网口弹性公网ip id
     */
    private String extensionElasticIpId;

    /**
     * 辅网口公网ip
     */
    private String extensionPublicIp;

    /**
     * 辅网口外网带宽，单位Mbps
     */
    private Integer extensionBandwidth;

    /**
     * 辅网口是否启用IPv6, 如 yes/no
     */
    private String extensionEnableIpv6;

    /**
     * 辅网口IPv6地址
     */
    private String extensionIpv6Address;

    /**
     * 辅网口公网IPv6地址ID
     */
    private String extensionIpv6AddressId;

    /**
     * 辅网口IPv6公网带宽, 单位Mbps
     */
    private Integer extensionIpv6AddressBandwidth;

    /**
     * IPv6网关ID
     */
    private String extensionIpv6GatewayId;

    /**
     * 密钥对id
     */
    private String keypairId;

    /**
     * agent状态
     */
    private String agentStatus;

    /**
     * 计费信息
     */
    private Charge charge;


    /**
     * get 云物理服务器实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云物理服务器实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 区域代码, 如 cn-north-1
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域代码, 如 cn-north-1
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 可用区, 如 cn-north-1a
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区, 如 cn-north-1a
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 实例类型, 如 cps.c.normal
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 实例类型, 如 cps.c.normal
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 云物理服务器名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云物理服务器名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 云物理服务器描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云物理服务器描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 云物理服务器生命周期状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云物理服务器生命周期状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 是否启用外网, 如 yes/no
     *
     * @return
     */
    public String getEnableInternet() {
        return enableInternet;
    }

    /**
     * set 是否启用外网, 如 yes/no
     *
     * @param enableInternet
     */
    public void setEnableInternet(String enableInternet) {
        this.enableInternet = enableInternet;
    }

    /**
     * get 是否启用IPv6, 如 yes/no
     *
     * @return
     */
    public String getEnableIpv6() {
        return enableIpv6;
    }

    /**
     * set 是否启用IPv6, 如 yes/no
     *
     * @param enableIpv6
     */
    public void setEnableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
    }

    /**
     * get 带宽, 单位Mbps
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽, 单位Mbps
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 镜像类型, 如 standard
     *
     * @return
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * set 镜像类型, 如 standard
     *
     * @param imageType
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * get 操作系统类型ID
     *
     * @return
     */
    public String getOsTypeId() {
        return osTypeId;
    }

    /**
     * set 操作系统类型ID
     *
     * @param osTypeId
     */
    public void setOsTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
    }

    /**
     * get 操作系统名称
     *
     * @return
     */
    public String getOsName() {
        return osName;
    }

    /**
     * set 操作系统名称
     *
     * @param osName
     */
    public void setOsName(String osName) {
        this.osName = osName;
    }

    /**
     * get 操作系统类型, 如 ubuntu/centos
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 操作系统类型, 如 ubuntu/centos
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * get 操作系统版本, 如 16.04
     *
     * @return
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * set 操作系统版本, 如 16.04
     *
     * @param osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * get 系统盘RAID类型ID
     *
     * @return
     */
    public String getSysRaidTypeId() {
        return sysRaidTypeId;
    }

    /**
     * set 系统盘RAID类型ID
     *
     * @param sysRaidTypeId
     */
    public void setSysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
    }

    /**
     * get 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @return
     */
    public String getSysRaidType() {
        return sysRaidType;
    }

    /**
     * set 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @param sysRaidType
     */
    public void setSysRaidType(String sysRaidType) {
        this.sysRaidType = sysRaidType;
    }

    /**
     * get 数据盘RAID类型ID
     *
     * @return
     */
    public String getDataRaidTypeId() {
        return dataRaidTypeId;
    }

    /**
     * set 数据盘RAID类型ID
     *
     * @param dataRaidTypeId
     */
    public void setDataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
    }

    /**
     * get 数据盘RAID类型, 如 NORAID, RAID0, RAID1，RAID10
     *
     * @return
     */
    public String getDataRaidType() {
        return dataRaidType;
    }

    /**
     * set 数据盘RAID类型, 如 NORAID, RAID0, RAID1，RAID10
     *
     * @param dataRaidType
     */
    public void setDataRaidType(String dataRaidType) {
        this.dataRaidType = dataRaidType;
    }

    /**
     * get 网络类型：basic（基础网络）、vpc（私有网络）、retail（零售中台网络）
     *
     * @return
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * set 网络类型：basic（基础网络）、vpc（私有网络）、retail（零售中台网络）
     *
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
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
     * get 私有网络IPv4 CIDR
     *
     * @return
     */
    public String getVpcIpv4Cidr() {
        return vpcIpv4Cidr;
    }

    /**
     * set 私有网络IPv4 CIDR
     *
     * @param vpcIpv4Cidr
     */
    public void setVpcIpv4Cidr(String vpcIpv4Cidr) {
        this.vpcIpv4Cidr = vpcIpv4Cidr;
    }

    /**
     * get 私有网络IPv6 CIDR
     *
     * @return
     */
    public String getVpcIpv6Cidr() {
        return vpcIpv6Cidr;
    }

    /**
     * set 私有网络IPv6 CIDR
     *
     * @param vpcIpv6Cidr
     */
    public void setVpcIpv6Cidr(String vpcIpv6Cidr) {
        this.vpcIpv6Cidr = vpcIpv6Cidr;
    }

    /**
     * get IPv6网关ID
     *
     * @return
     */
    public String getIpv6GatewayId() {
        return ipv6GatewayId;
    }

    /**
     * set IPv6网关ID
     *
     * @param ipv6GatewayId
     */
    public void setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
    }

    /**
     * get 子网编号
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网编号
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 子网名称
     *
     * @return
     */
    public String getSubnetName() {
        return subnetName;
    }

    /**
     * set 子网名称
     *
     * @param subnetName
     */
    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    /**
     * get 子网IPv4 CIDR
     *
     * @return
     */
    public String getSubnetIpv4Cidr() {
        return subnetIpv4Cidr;
    }

    /**
     * set 子网IPv4 CIDR
     *
     * @param subnetIpv4Cidr
     */
    public void setSubnetIpv4Cidr(String subnetIpv4Cidr) {
        this.subnetIpv4Cidr = subnetIpv4Cidr;
    }

    /**
     * get 子网IPv6 CIDR
     *
     * @return
     */
    public String getSubnetIpv6Cidr() {
        return subnetIpv6Cidr;
    }

    /**
     * set 子网IPv6 CIDR
     *
     * @param subnetIpv6Cidr
     */
    public void setSubnetIpv6Cidr(String subnetIpv6Cidr) {
        this.subnetIpv6Cidr = subnetIpv6Cidr;
    }

    /**
     * get 内网IP
     *
     * @return
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * set 内网IP
     *
     * @param privateIp
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * get 外网链路类型, 如 bgp
     *
     * @return
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * set 外网链路类型, 如 bgp
     *
     * @param lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    /**
     * get 弹性公网IPID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 公网IP
     *
     * @return
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * set 公网IP
     *
     * @param publicIp
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * get IPv6地址
     *
     * @return
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * set IPv6地址
     *
     * @param ipv6Address
     */
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * get 公网IPv6地址ID
     *
     * @return
     */
    public String getIpv6AddressId() {
        return ipv6AddressId;
    }

    /**
     * set 公网IPv6地址ID
     *
     * @param ipv6AddressId
     */
    public void setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
    }

    /**
     * get 公网IPv6带宽, 单位Mbps
     *
     * @return
     */
    public Integer getIpv6AddressBandwidth() {
        return ipv6AddressBandwidth;
    }

    /**
     * set 公网IPv6带宽, 单位Mbps
     *
     * @param ipv6AddressBandwidth
     */
    public void setIpv6AddressBandwidth(Integer ipv6AddressBandwidth) {
        this.ipv6AddressBandwidth = ipv6AddressBandwidth;
    }

    /**
     * get 网络接口模式：bond（网口bond）、dual（双网口）
     *
     * @return
     */
    public String getInterfaceMode() {
        return interfaceMode;
    }

    /**
     * set 网络接口模式：bond（网口bond）、dual（双网口）
     *
     * @param interfaceMode
     */
    public void setInterfaceMode(String interfaceMode) {
        this.interfaceMode = interfaceMode;
    }

    /**
     * get 辅网口私有网络ID
     *
     * @return
     */
    public String getExtensionVpcId() {
        return extensionVpcId;
    }

    /**
     * set 辅网口私有网络ID
     *
     * @param extensionVpcId
     */
    public void setExtensionVpcId(String extensionVpcId) {
        this.extensionVpcId = extensionVpcId;
    }

    /**
     * get 辅网口私有网络名称
     *
     * @return
     */
    public String getExtensionVpcName() {
        return extensionVpcName;
    }

    /**
     * set 辅网口私有网络名称
     *
     * @param extensionVpcName
     */
    public void setExtensionVpcName(String extensionVpcName) {
        this.extensionVpcName = extensionVpcName;
    }

    /**
     * get 辅网口私有网络IPv4 CIDR
     *
     * @return
     */
    public String getExtensionVpcIpv4Cidr() {
        return extensionVpcIpv4Cidr;
    }

    /**
     * set 辅网口私有网络IPv4 CIDR
     *
     * @param extensionVpcIpv4Cidr
     */
    public void setExtensionVpcIpv4Cidr(String extensionVpcIpv4Cidr) {
        this.extensionVpcIpv4Cidr = extensionVpcIpv4Cidr;
    }

    /**
     * get 辅网口私有网络IPv6 CIDR
     *
     * @return
     */
    public String getExtensionVpcIpv6Cidr() {
        return extensionVpcIpv6Cidr;
    }

    /**
     * set 辅网口私有网络IPv6 CIDR
     *
     * @param extensionVpcIpv6Cidr
     */
    public void setExtensionVpcIpv6Cidr(String extensionVpcIpv6Cidr) {
        this.extensionVpcIpv6Cidr = extensionVpcIpv6Cidr;
    }

    /**
     * get 辅网口子网ID
     *
     * @return
     */
    public String getExtensionSubnetId() {
        return extensionSubnetId;
    }

    /**
     * set 辅网口子网ID
     *
     * @param extensionSubnetId
     */
    public void setExtensionSubnetId(String extensionSubnetId) {
        this.extensionSubnetId = extensionSubnetId;
    }

    /**
     * get 辅网口子网名称
     *
     * @return
     */
    public String getExtensionSubnetName() {
        return extensionSubnetName;
    }

    /**
     * set 辅网口子网名称
     *
     * @param extensionSubnetName
     */
    public void setExtensionSubnetName(String extensionSubnetName) {
        this.extensionSubnetName = extensionSubnetName;
    }

    /**
     * get 辅网口子网IPv4 CIDR
     *
     * @return
     */
    public String getExtensionSubnetIpv4Cidr() {
        return extensionSubnetIpv4Cidr;
    }

    /**
     * set 辅网口子网IPv4 CIDR
     *
     * @param extensionSubnetIpv4Cidr
     */
    public void setExtensionSubnetIpv4Cidr(String extensionSubnetIpv4Cidr) {
        this.extensionSubnetIpv4Cidr = extensionSubnetIpv4Cidr;
    }

    /**
     * get 辅网口子网IPv6 CIDR
     *
     * @return
     */
    public String getExtensionSubnetIpv6Cidr() {
        return extensionSubnetIpv6Cidr;
    }

    /**
     * set 辅网口子网IPv6 CIDR
     *
     * @param extensionSubnetIpv6Cidr
     */
    public void setExtensionSubnetIpv6Cidr(String extensionSubnetIpv6Cidr) {
        this.extensionSubnetIpv6Cidr = extensionSubnetIpv6Cidr;
    }

    /**
     * get 辅网口手动分配的内网ip
     *
     * @return
     */
    public String getExtensionPrivateIp() {
        return extensionPrivateIp;
    }

    /**
     * set 辅网口手动分配的内网ip
     *
     * @param extensionPrivateIp
     */
    public void setExtensionPrivateIp(String extensionPrivateIp) {
        this.extensionPrivateIp = extensionPrivateIp;
    }

    /**
     * get 辅网口是否启用外网
     *
     * @return
     */
    public String getExtensionEnableInternet() {
        return extensionEnableInternet;
    }

    /**
     * set 辅网口是否启用外网
     *
     * @param extensionEnableInternet
     */
    public void setExtensionEnableInternet(String extensionEnableInternet) {
        this.extensionEnableInternet = extensionEnableInternet;
    }

    /**
     * get 辅网口弹性公网ip id
     *
     * @return
     */
    public String getExtensionElasticIpId() {
        return extensionElasticIpId;
    }

    /**
     * set 辅网口弹性公网ip id
     *
     * @param extensionElasticIpId
     */
    public void setExtensionElasticIpId(String extensionElasticIpId) {
        this.extensionElasticIpId = extensionElasticIpId;
    }

    /**
     * get 辅网口公网ip
     *
     * @return
     */
    public String getExtensionPublicIp() {
        return extensionPublicIp;
    }

    /**
     * set 辅网口公网ip
     *
     * @param extensionPublicIp
     */
    public void setExtensionPublicIp(String extensionPublicIp) {
        this.extensionPublicIp = extensionPublicIp;
    }

    /**
     * get 辅网口外网带宽，单位Mbps
     *
     * @return
     */
    public Integer getExtensionBandwidth() {
        return extensionBandwidth;
    }

    /**
     * set 辅网口外网带宽，单位Mbps
     *
     * @param extensionBandwidth
     */
    public void setExtensionBandwidth(Integer extensionBandwidth) {
        this.extensionBandwidth = extensionBandwidth;
    }

    /**
     * get 辅网口是否启用IPv6, 如 yes/no
     *
     * @return
     */
    public String getExtensionEnableIpv6() {
        return extensionEnableIpv6;
    }

    /**
     * set 辅网口是否启用IPv6, 如 yes/no
     *
     * @param extensionEnableIpv6
     */
    public void setExtensionEnableIpv6(String extensionEnableIpv6) {
        this.extensionEnableIpv6 = extensionEnableIpv6;
    }

    /**
     * get 辅网口IPv6地址
     *
     * @return
     */
    public String getExtensionIpv6Address() {
        return extensionIpv6Address;
    }

    /**
     * set 辅网口IPv6地址
     *
     * @param extensionIpv6Address
     */
    public void setExtensionIpv6Address(String extensionIpv6Address) {
        this.extensionIpv6Address = extensionIpv6Address;
    }

    /**
     * get 辅网口公网IPv6地址ID
     *
     * @return
     */
    public String getExtensionIpv6AddressId() {
        return extensionIpv6AddressId;
    }

    /**
     * set 辅网口公网IPv6地址ID
     *
     * @param extensionIpv6AddressId
     */
    public void setExtensionIpv6AddressId(String extensionIpv6AddressId) {
        this.extensionIpv6AddressId = extensionIpv6AddressId;
    }

    /**
     * get 辅网口IPv6公网带宽, 单位Mbps
     *
     * @return
     */
    public Integer getExtensionIpv6AddressBandwidth() {
        return extensionIpv6AddressBandwidth;
    }

    /**
     * set 辅网口IPv6公网带宽, 单位Mbps
     *
     * @param extensionIpv6AddressBandwidth
     */
    public void setExtensionIpv6AddressBandwidth(Integer extensionIpv6AddressBandwidth) {
        this.extensionIpv6AddressBandwidth = extensionIpv6AddressBandwidth;
    }

    /**
     * get IPv6网关ID
     *
     * @return
     */
    public String getExtensionIpv6GatewayId() {
        return extensionIpv6GatewayId;
    }

    /**
     * set IPv6网关ID
     *
     * @param extensionIpv6GatewayId
     */
    public void setExtensionIpv6GatewayId(String extensionIpv6GatewayId) {
        this.extensionIpv6GatewayId = extensionIpv6GatewayId;
    }

    /**
     * get 密钥对id
     *
     * @return
     */
    public String getKeypairId() {
        return keypairId;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public void setKeypairId(String keypairId) {
        this.keypairId = keypairId;
    }

    /**
     * get agent状态
     *
     * @return
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    /**
     * set agent状态
     *
     * @param agentStatus
     */
    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * get 计费信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }


    /**
     * set 云物理服务器实例ID
     *
     * @param instanceId
     */
    public Instance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 区域代码, 如 cn-north-1
     *
     * @param region
     */
    public Instance region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 可用区, 如 cn-north-1a
     *
     * @param az
     */
    public Instance az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 实例类型, 如 cps.c.normal
     *
     * @param deviceType
     */
    public Instance deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 云物理服务器名称
     *
     * @param name
     */
    public Instance name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云物理服务器描述
     *
     * @param description
     */
    public Instance description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 云物理服务器生命周期状态
     *
     * @param status
     */
    public Instance status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 是否启用外网, 如 yes/no
     *
     * @param enableInternet
     */
    public Instance enableInternet(String enableInternet) {
        this.enableInternet = enableInternet;
        return this;
    }

    /**
     * set 是否启用IPv6, 如 yes/no
     *
     * @param enableIpv6
     */
    public Instance enableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    /**
     * set 带宽, 单位Mbps
     *
     * @param bandwidth
     */
    public Instance bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 镜像类型, 如 standard
     *
     * @param imageType
     */
    public Instance imageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set 操作系统类型ID
     *
     * @param osTypeId
     */
    public Instance osTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
        return this;
    }

    /**
     * set 操作系统名称
     *
     * @param osName
     */
    public Instance osName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * set 操作系统类型, 如 ubuntu/centos
     *
     * @param osType
     */
    public Instance osType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set 操作系统版本, 如 16.04
     *
     * @param osVersion
     */
    public Instance osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * set 系统盘RAID类型ID
     *
     * @param sysRaidTypeId
     */
    public Instance sysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
        return this;
    }

    /**
     * set 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @param sysRaidType
     */
    public Instance sysRaidType(String sysRaidType) {
        this.sysRaidType = sysRaidType;
        return this;
    }

    /**
     * set 数据盘RAID类型ID
     *
     * @param dataRaidTypeId
     */
    public Instance dataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
        return this;
    }

    /**
     * set 数据盘RAID类型, 如 NORAID, RAID0, RAID1，RAID10
     *
     * @param dataRaidType
     */
    public Instance dataRaidType(String dataRaidType) {
        this.dataRaidType = dataRaidType;
        return this;
    }

    /**
     * set 网络类型：basic（基础网络）、vpc（私有网络）、retail（零售中台网络）
     *
     * @param networkType
     */
    public Instance networkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public Instance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 私有网络名称
     *
     * @param vpcName
     */
    public Instance vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set 私有网络IPv4 CIDR
     *
     * @param vpcIpv4Cidr
     */
    public Instance vpcIpv4Cidr(String vpcIpv4Cidr) {
        this.vpcIpv4Cidr = vpcIpv4Cidr;
        return this;
    }

    /**
     * set 私有网络IPv6 CIDR
     *
     * @param vpcIpv6Cidr
     */
    public Instance vpcIpv6Cidr(String vpcIpv6Cidr) {
        this.vpcIpv6Cidr = vpcIpv6Cidr;
        return this;
    }

    /**
     * set IPv6网关ID
     *
     * @param ipv6GatewayId
     */
    public Instance ipv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }

    /**
     * set 子网编号
     *
     * @param subnetId
     */
    public Instance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 子网名称
     *
     * @param subnetName
     */
    public Instance subnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * set 子网IPv4 CIDR
     *
     * @param subnetIpv4Cidr
     */
    public Instance subnetIpv4Cidr(String subnetIpv4Cidr) {
        this.subnetIpv4Cidr = subnetIpv4Cidr;
        return this;
    }

    /**
     * set 子网IPv6 CIDR
     *
     * @param subnetIpv6Cidr
     */
    public Instance subnetIpv6Cidr(String subnetIpv6Cidr) {
        this.subnetIpv6Cidr = subnetIpv6Cidr;
        return this;
    }

    /**
     * set 内网IP
     *
     * @param privateIp
     */
    public Instance privateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * set 外网链路类型, 如 bgp
     *
     * @param lineType
     */
    public Instance lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public Instance elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 公网IP
     *
     * @param publicIp
     */
    public Instance publicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * set IPv6地址
     *
     * @param ipv6Address
     */
    public Instance ipv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * set 公网IPv6地址ID
     *
     * @param ipv6AddressId
     */
    public Instance ipv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }

    /**
     * set 公网IPv6带宽, 单位Mbps
     *
     * @param ipv6AddressBandwidth
     */
    public Instance ipv6AddressBandwidth(Integer ipv6AddressBandwidth) {
        this.ipv6AddressBandwidth = ipv6AddressBandwidth;
        return this;
    }

    /**
     * set 网络接口模式：bond（网口bond）、dual（双网口）
     *
     * @param interfaceMode
     */
    public Instance interfaceMode(String interfaceMode) {
        this.interfaceMode = interfaceMode;
        return this;
    }

    /**
     * set 辅网口私有网络ID
     *
     * @param extensionVpcId
     */
    public Instance extensionVpcId(String extensionVpcId) {
        this.extensionVpcId = extensionVpcId;
        return this;
    }

    /**
     * set 辅网口私有网络名称
     *
     * @param extensionVpcName
     */
    public Instance extensionVpcName(String extensionVpcName) {
        this.extensionVpcName = extensionVpcName;
        return this;
    }

    /**
     * set 辅网口私有网络IPv4 CIDR
     *
     * @param extensionVpcIpv4Cidr
     */
    public Instance extensionVpcIpv4Cidr(String extensionVpcIpv4Cidr) {
        this.extensionVpcIpv4Cidr = extensionVpcIpv4Cidr;
        return this;
    }

    /**
     * set 辅网口私有网络IPv6 CIDR
     *
     * @param extensionVpcIpv6Cidr
     */
    public Instance extensionVpcIpv6Cidr(String extensionVpcIpv6Cidr) {
        this.extensionVpcIpv6Cidr = extensionVpcIpv6Cidr;
        return this;
    }

    /**
     * set 辅网口子网ID
     *
     * @param extensionSubnetId
     */
    public Instance extensionSubnetId(String extensionSubnetId) {
        this.extensionSubnetId = extensionSubnetId;
        return this;
    }

    /**
     * set 辅网口子网名称
     *
     * @param extensionSubnetName
     */
    public Instance extensionSubnetName(String extensionSubnetName) {
        this.extensionSubnetName = extensionSubnetName;
        return this;
    }

    /**
     * set 辅网口子网IPv4 CIDR
     *
     * @param extensionSubnetIpv4Cidr
     */
    public Instance extensionSubnetIpv4Cidr(String extensionSubnetIpv4Cidr) {
        this.extensionSubnetIpv4Cidr = extensionSubnetIpv4Cidr;
        return this;
    }

    /**
     * set 辅网口子网IPv6 CIDR
     *
     * @param extensionSubnetIpv6Cidr
     */
    public Instance extensionSubnetIpv6Cidr(String extensionSubnetIpv6Cidr) {
        this.extensionSubnetIpv6Cidr = extensionSubnetIpv6Cidr;
        return this;
    }

    /**
     * set 辅网口手动分配的内网ip
     *
     * @param extensionPrivateIp
     */
    public Instance extensionPrivateIp(String extensionPrivateIp) {
        this.extensionPrivateIp = extensionPrivateIp;
        return this;
    }

    /**
     * set 辅网口是否启用外网
     *
     * @param extensionEnableInternet
     */
    public Instance extensionEnableInternet(String extensionEnableInternet) {
        this.extensionEnableInternet = extensionEnableInternet;
        return this;
    }

    /**
     * set 辅网口弹性公网ip id
     *
     * @param extensionElasticIpId
     */
    public Instance extensionElasticIpId(String extensionElasticIpId) {
        this.extensionElasticIpId = extensionElasticIpId;
        return this;
    }

    /**
     * set 辅网口公网ip
     *
     * @param extensionPublicIp
     */
    public Instance extensionPublicIp(String extensionPublicIp) {
        this.extensionPublicIp = extensionPublicIp;
        return this;
    }

    /**
     * set 辅网口外网带宽，单位Mbps
     *
     * @param extensionBandwidth
     */
    public Instance extensionBandwidth(Integer extensionBandwidth) {
        this.extensionBandwidth = extensionBandwidth;
        return this;
    }

    /**
     * set 辅网口是否启用IPv6, 如 yes/no
     *
     * @param extensionEnableIpv6
     */
    public Instance extensionEnableIpv6(String extensionEnableIpv6) {
        this.extensionEnableIpv6 = extensionEnableIpv6;
        return this;
    }

    /**
     * set 辅网口IPv6地址
     *
     * @param extensionIpv6Address
     */
    public Instance extensionIpv6Address(String extensionIpv6Address) {
        this.extensionIpv6Address = extensionIpv6Address;
        return this;
    }

    /**
     * set 辅网口公网IPv6地址ID
     *
     * @param extensionIpv6AddressId
     */
    public Instance extensionIpv6AddressId(String extensionIpv6AddressId) {
        this.extensionIpv6AddressId = extensionIpv6AddressId;
        return this;
    }

    /**
     * set 辅网口IPv6公网带宽, 单位Mbps
     *
     * @param extensionIpv6AddressBandwidth
     */
    public Instance extensionIpv6AddressBandwidth(Integer extensionIpv6AddressBandwidth) {
        this.extensionIpv6AddressBandwidth = extensionIpv6AddressBandwidth;
        return this;
    }

    /**
     * set IPv6网关ID
     *
     * @param extensionIpv6GatewayId
     */
    public Instance extensionIpv6GatewayId(String extensionIpv6GatewayId) {
        this.extensionIpv6GatewayId = extensionIpv6GatewayId;
        return this;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public Instance keypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    /**
     * set agent状态
     *
     * @param agentStatus
     */
    public Instance agentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public Instance charge(Charge charge) {
        this.charge = charge;
        return this;
    }


}