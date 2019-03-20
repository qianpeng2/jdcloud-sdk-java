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
 * 解析记录
 * 云解析OpenAPI解析记录接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.clouddnsservice.model.UpdateRR;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改主域名的某个解析记录
 */
public class UpdateRRRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * updateRR参数
     * Required:true
     */
    @Required
    private UpdateRR req;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 域名ID，请使用getDomains接口获取。
     * Required:true
     */
    @Required
    private String domainId;


    /**
     * get updateRR参数
     *
     * @return
     */
    public UpdateRR getReq() {
        return req;
    }

    /**
     * set updateRR参数
     *
     * @param req
     */
    public void setReq(UpdateRR req) {
        this.req = req;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 域名ID，请使用getDomains接口获取。
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID，请使用getDomains接口获取。
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }


    /**
     * set updateRR参数
     *
     * @param req
     */
    public UpdateRRRequest req(UpdateRR req) {
        this.req = req;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public UpdateRRRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 域名ID，请使用getDomains接口获取。
     *
     * @param domainId
     */
    public UpdateRRRequest domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }


}