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
 * 域名
 * httpdns OpenAPI域名接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.httpdns.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询使用httpdns服务的域名
 */
public class GetDomainsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页数，起始值为1
     * Required:true
     */
    @Required
    private Integer pageIndex;

    /**
     * 分页查询时设置的每页行数
     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * 关键字，按照”%domainName%”模式搜索域名
     */
    private String domainName;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 当前页数，起始值为1
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页数，起始值为1
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 分页查询时设置的每页行数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页查询时设置的每页行数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 关键字，按照”%domainName%”模式搜索域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 关键字，按照”%domainName%”模式搜索域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
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
     * set 当前页数，起始值为1
     *
     * @param pageIndex
     */
    public GetDomainsRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 分页查询时设置的每页行数
     *
     * @param pageSize
     */
    public GetDomainsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 关键字，按照”%domainName%”模式搜索域名
     *
     * @param domainName
     */
    public GetDomainsRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public GetDomainsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}