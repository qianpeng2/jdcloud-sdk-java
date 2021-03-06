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
 * Instance-Voucher
 * 实例抵扣券相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.instancevoucher.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改实例抵扣券的 名称 和 描述。&lt;br&gt;
name 和 description 必须要指定一个

 */
public class ModifyInstanceVoucherAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例抵扣券名称
     */
    private String name;

    /**
     * 实例抵扣券描述
     */
    private String description;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例抵扣券 ID
     * Required:true
     */
    @Required
    private String instanceVoucherId;


    /**
     * get 实例抵扣券名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例抵扣券名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 实例抵扣券描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 实例抵扣券描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例抵扣券 ID
     *
     * @return
     */
    public String getInstanceVoucherId() {
        return instanceVoucherId;
    }

    /**
     * set 实例抵扣券 ID
     *
     * @param instanceVoucherId
     */
    public void setInstanceVoucherId(String instanceVoucherId) {
        this.instanceVoucherId = instanceVoucherId;
    }


    /**
     * set 实例抵扣券名称
     *
     * @param name
     */
    public ModifyInstanceVoucherAttributeRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 实例抵扣券描述
     *
     * @param description
     */
    public ModifyInstanceVoucherAttributeRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public ModifyInstanceVoucherAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例抵扣券 ID
     *
     * @param instanceVoucherId
     */
    public ModifyInstanceVoucherAttributeRequest instanceVoucherId(String instanceVoucherId) {
        this.instanceVoucherId = instanceVoucherId;
        return this;
    }


}