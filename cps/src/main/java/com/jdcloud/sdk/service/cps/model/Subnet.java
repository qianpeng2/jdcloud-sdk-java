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
 * subnet
 */
public class Subnet  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域代码, 如cn-north-1
     */
    private String region;

    /**
     * 可用区, 如cn-north-1c
     */
    private String az;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 子网名称
     */
    private String name;

    /**
     * 子网ipv4 CIDR
     */
    private String cidr;

    /**
     * 子网IPv6 CIDR
     */
    private String ipv6Cidr;

    /**
     * 私有网络Id
     */
    private String vpcId;

    /**
     * 私有网络名称
     */
    private String vpcName;

    /**
     * 私有网络IPv4 CIDR
     */
    private String vpcCidr;

    /**
     * 私有网络IPv6 CIDR
     */
    private String vpcIpv6Cidr;

    /**
     * 可用IPv4地址数量
     */
    private Integer availableIpCount;

    /**
     * 总IPv4地址数量
     */
    private Integer totalIpCount;

    /**
     * 已用IPv6地址数量
     */
    private Integer usedIpv6IpCount;

    /**
     * 总IPv6地址数量
     */
    private String totalIpv6IpCount;

    /**
     * 子网次要CIDR名称
     */
    private String secondaryCidrName;

    /**
     * 子网次要CIDR
     */
    private String secondaryCidr;

    /**
     * 子网次要CIDR ID
     */
    private String secondaryCidrId;

    /**
     * 网络类型
     */
    private String networkType;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createTime;


    /**
     * get 地域代码, 如cn-north-1
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域代码, 如cn-north-1
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 可用区, 如cn-north-1c
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区, 如cn-north-1c
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
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
     * get 子网名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 子网名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 子网ipv4 CIDR
     *
     * @return
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * set 子网ipv4 CIDR
     *
     * @param cidr
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * get 子网IPv6 CIDR
     *
     * @return
     */
    public String getIpv6Cidr() {
        return ipv6Cidr;
    }

    /**
     * set 子网IPv6 CIDR
     *
     * @param ipv6Cidr
     */
    public void setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
    }

    /**
     * get 私有网络Id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络Id
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
    public String getVpcCidr() {
        return vpcCidr;
    }

    /**
     * set 私有网络IPv4 CIDR
     *
     * @param vpcCidr
     */
    public void setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
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
     * get 可用IPv4地址数量
     *
     * @return
     */
    public Integer getAvailableIpCount() {
        return availableIpCount;
    }

    /**
     * set 可用IPv4地址数量
     *
     * @param availableIpCount
     */
    public void setAvailableIpCount(Integer availableIpCount) {
        this.availableIpCount = availableIpCount;
    }

    /**
     * get 总IPv4地址数量
     *
     * @return
     */
    public Integer getTotalIpCount() {
        return totalIpCount;
    }

    /**
     * set 总IPv4地址数量
     *
     * @param totalIpCount
     */
    public void setTotalIpCount(Integer totalIpCount) {
        this.totalIpCount = totalIpCount;
    }

    /**
     * get 已用IPv6地址数量
     *
     * @return
     */
    public Integer getUsedIpv6IpCount() {
        return usedIpv6IpCount;
    }

    /**
     * set 已用IPv6地址数量
     *
     * @param usedIpv6IpCount
     */
    public void setUsedIpv6IpCount(Integer usedIpv6IpCount) {
        this.usedIpv6IpCount = usedIpv6IpCount;
    }

    /**
     * get 总IPv6地址数量
     *
     * @return
     */
    public String getTotalIpv6IpCount() {
        return totalIpv6IpCount;
    }

    /**
     * set 总IPv6地址数量
     *
     * @param totalIpv6IpCount
     */
    public void setTotalIpv6IpCount(String totalIpv6IpCount) {
        this.totalIpv6IpCount = totalIpv6IpCount;
    }

    /**
     * get 子网次要CIDR名称
     *
     * @return
     */
    public String getSecondaryCidrName() {
        return secondaryCidrName;
    }

    /**
     * set 子网次要CIDR名称
     *
     * @param secondaryCidrName
     */
    public void setSecondaryCidrName(String secondaryCidrName) {
        this.secondaryCidrName = secondaryCidrName;
    }

    /**
     * get 子网次要CIDR
     *
     * @return
     */
    public String getSecondaryCidr() {
        return secondaryCidr;
    }

    /**
     * set 子网次要CIDR
     *
     * @param secondaryCidr
     */
    public void setSecondaryCidr(String secondaryCidr) {
        this.secondaryCidr = secondaryCidr;
    }

    /**
     * get 子网次要CIDR ID
     *
     * @return
     */
    public String getSecondaryCidrId() {
        return secondaryCidrId;
    }

    /**
     * set 子网次要CIDR ID
     *
     * @param secondaryCidrId
     */
    public void setSecondaryCidrId(String secondaryCidrId) {
        this.secondaryCidrId = secondaryCidrId;
    }

    /**
     * get 网络类型
     *
     * @return
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * set 网络类型
     *
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
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
     * set 地域代码, 如cn-north-1
     *
     * @param region
     */
    public Subnet region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 可用区, 如cn-north-1c
     *
     * @param az
     */
    public Subnet az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public Subnet subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 子网名称
     *
     * @param name
     */
    public Subnet name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 子网ipv4 CIDR
     *
     * @param cidr
     */
    public Subnet cidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * set 子网IPv6 CIDR
     *
     * @param ipv6Cidr
     */
    public Subnet ipv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
        return this;
    }

    /**
     * set 私有网络Id
     *
     * @param vpcId
     */
    public Subnet vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 私有网络名称
     *
     * @param vpcName
     */
    public Subnet vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set 私有网络IPv4 CIDR
     *
     * @param vpcCidr
     */
    public Subnet vpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    /**
     * set 私有网络IPv6 CIDR
     *
     * @param vpcIpv6Cidr
     */
    public Subnet vpcIpv6Cidr(String vpcIpv6Cidr) {
        this.vpcIpv6Cidr = vpcIpv6Cidr;
        return this;
    }

    /**
     * set 可用IPv4地址数量
     *
     * @param availableIpCount
     */
    public Subnet availableIpCount(Integer availableIpCount) {
        this.availableIpCount = availableIpCount;
        return this;
    }

    /**
     * set 总IPv4地址数量
     *
     * @param totalIpCount
     */
    public Subnet totalIpCount(Integer totalIpCount) {
        this.totalIpCount = totalIpCount;
        return this;
    }

    /**
     * set 已用IPv6地址数量
     *
     * @param usedIpv6IpCount
     */
    public Subnet usedIpv6IpCount(Integer usedIpv6IpCount) {
        this.usedIpv6IpCount = usedIpv6IpCount;
        return this;
    }

    /**
     * set 总IPv6地址数量
     *
     * @param totalIpv6IpCount
     */
    public Subnet totalIpv6IpCount(String totalIpv6IpCount) {
        this.totalIpv6IpCount = totalIpv6IpCount;
        return this;
    }

    /**
     * set 子网次要CIDR名称
     *
     * @param secondaryCidrName
     */
    public Subnet secondaryCidrName(String secondaryCidrName) {
        this.secondaryCidrName = secondaryCidrName;
        return this;
    }

    /**
     * set 子网次要CIDR
     *
     * @param secondaryCidr
     */
    public Subnet secondaryCidr(String secondaryCidr) {
        this.secondaryCidr = secondaryCidr;
        return this;
    }

    /**
     * set 子网次要CIDR ID
     *
     * @param secondaryCidrId
     */
    public Subnet secondaryCidrId(String secondaryCidrId) {
        this.secondaryCidrId = secondaryCidrId;
        return this;
    }

    /**
     * set 网络类型
     *
     * @param networkType
     */
    public Subnet networkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public Subnet description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public Subnet createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}