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

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * subnetSpec
 */
public class SubnetSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子网所属vpc的Id
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     * Required:true
     */
    @Required
    private String subnetName;

    /**
     * 子网网段，vpc内子网网段不能重叠，cidr的取值范围：10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间，如果vpc含有cidr，则必须为vpc所在cidr的子网
     * Required:true
     */
    @Required
    private String addressPrefix;

    /**
     * 子网关联的路由表Id, 默认为vpc的默认路由表,子网关联路由表需检查路由表中已绑定的子网与本子网类型是否一致（一致标准为：或者都为标准子网，或者都为相同边缘可用区的边缘子网）
     */
    private String routeTableId;

    /**
     * 子网描述信息,允许输入UTF-8编码下的全部字符，不超过256字符。
     */
    private String description;

    /**
     * 子网类型，取值：standard(标准子网)，edge(边缘子网)
     */
    private String subnetType;

    /**
     * 子网可用区，边缘子网必须指定可用区
     */
    private String az;


    /**
     * get 子网所属vpc的Id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 子网所属vpc的Id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getSubnetName() {
        return subnetName;
    }

    /**
     * set 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param subnetName
     */
    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    /**
     * get 子网网段，vpc内子网网段不能重叠，cidr的取值范围：10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间，如果vpc含有cidr，则必须为vpc所在cidr的子网
     *
     * @return
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * set 子网网段，vpc内子网网段不能重叠，cidr的取值范围：10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间，如果vpc含有cidr，则必须为vpc所在cidr的子网
     *
     * @param addressPrefix
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }

    /**
     * get 子网关联的路由表Id, 默认为vpc的默认路由表,子网关联路由表需检查路由表中已绑定的子网与本子网类型是否一致（一致标准为：或者都为标准子网，或者都为相同边缘可用区的边缘子网）
     *
     * @return
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * set 子网关联的路由表Id, 默认为vpc的默认路由表,子网关联路由表需检查路由表中已绑定的子网与本子网类型是否一致（一致标准为：或者都为标准子网，或者都为相同边缘可用区的边缘子网）
     *
     * @param routeTableId
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * get 子网描述信息,允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 子网描述信息,允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 子网类型，取值：standard(标准子网)，edge(边缘子网)
     *
     * @return
     */
    public String getSubnetType() {
        return subnetType;
    }

    /**
     * set 子网类型，取值：standard(标准子网)，edge(边缘子网)
     *
     * @param subnetType
     */
    public void setSubnetType(String subnetType) {
        this.subnetType = subnetType;
    }

    /**
     * get 子网可用区，边缘子网必须指定可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 子网可用区，边缘子网必须指定可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }


    /**
     * set 子网所属vpc的Id
     *
     * @param vpcId
     */
    public SubnetSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param subnetName
     */
    public SubnetSpec subnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * set 子网网段，vpc内子网网段不能重叠，cidr的取值范围：10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间，如果vpc含有cidr，则必须为vpc所在cidr的子网
     *
     * @param addressPrefix
     */
    public SubnetSpec addressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * set 子网关联的路由表Id, 默认为vpc的默认路由表,子网关联路由表需检查路由表中已绑定的子网与本子网类型是否一致（一致标准为：或者都为标准子网，或者都为相同边缘可用区的边缘子网）
     *
     * @param routeTableId
     */
    public SubnetSpec routeTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * set 子网描述信息,允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public SubnetSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 子网类型，取值：standard(标准子网)，edge(边缘子网)
     *
     * @param subnetType
     */
    public SubnetSpec subnetType(String subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    /**
     * set 子网可用区，边缘子网必须指定可用区
     *
     * @param az
     */
    public SubnetSpec az(String az) {
        this.az = az;
        return this;
    }


}