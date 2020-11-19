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
 * Domain-Management
 * 域名管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domain.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据域名修改域名对应的 DNS 信息
 */
public class ModifyDnsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 要修改的域名
     * Required:true
     */
    @Required
    private String domainName;

    /**
     * 要修改的DNS,个数要求再2个-6个之间
     * Required:true
     */
    @Required
    private List<String> dns;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 要修改的域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 要修改的域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 要修改的DNS,个数要求再2个-6个之间
     *
     * @return
     */
    public List<String> getDns() {
        return dns;
    }

    /**
     * set 要修改的DNS,个数要求再2个-6个之间
     *
     * @param dns
     */
    public void setDns(List<String> dns) {
        this.dns = dns;
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
     * set 要修改的域名
     *
     * @param domainName
     */
    public ModifyDnsRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 要修改的DNS,个数要求再2个-6个之间
     *
     * @param dns
     */
    public ModifyDnsRequest dns(List<String> dns) {
        this.dns = dns;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public ModifyDnsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 要修改的DNS,个数要求再2个-6个之间
     *
     * @param dn
     */
    public void addDn(String dn) {
        if (this.dns == null) {
            this.dns = new ArrayList<>();
        }
        this.dns.add(dn);
    }

}