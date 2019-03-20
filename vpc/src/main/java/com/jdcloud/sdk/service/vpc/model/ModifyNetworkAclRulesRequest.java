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
 * Acl
 * Acl相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkAclRuleSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改networkAcl接口
 */
public class ModifyNetworkAclRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * networkAcl规则列表
     * Required:true
     */
    @Required
    private List<ModifyNetworkAclRuleSpec> modifyNetworkAclRuleSpecs;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * networkAclId ID
     * Required:true
     */
    @Required
    private String networkAclId;


    /**
     * get networkAcl规则列表
     *
     * @return
     */
    public List<ModifyNetworkAclRuleSpec> getModifyNetworkAclRuleSpecs() {
        return modifyNetworkAclRuleSpecs;
    }

    /**
     * set networkAcl规则列表
     *
     * @param modifyNetworkAclRuleSpecs
     */
    public void setModifyNetworkAclRuleSpecs(List<ModifyNetworkAclRuleSpec> modifyNetworkAclRuleSpecs) {
        this.modifyNetworkAclRuleSpecs = modifyNetworkAclRuleSpecs;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get networkAclId ID
     *
     * @return
     */
    public String getNetworkAclId() {
        return networkAclId;
    }

    /**
     * set networkAclId ID
     *
     * @param networkAclId
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }


    /**
     * set networkAcl规则列表
     *
     * @param modifyNetworkAclRuleSpecs
     */
    public ModifyNetworkAclRulesRequest modifyNetworkAclRuleSpecs(List<ModifyNetworkAclRuleSpec> modifyNetworkAclRuleSpecs) {
        this.modifyNetworkAclRuleSpecs = modifyNetworkAclRuleSpecs;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyNetworkAclRulesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set networkAclId ID
     *
     * @param networkAclId
     */
    public ModifyNetworkAclRulesRequest networkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }


    /**
     * add item to networkAcl规则列表
     *
     * @param modifyNetworkAclRuleSpec
     */
    public void addModifyNetworkAclRuleSpec(ModifyNetworkAclRuleSpec modifyNetworkAclRuleSpec) {
        if (this.modifyNetworkAclRuleSpecs == null) {
            this.modifyNetworkAclRuleSpecs = new ArrayList<>();
        }
        this.modifyNetworkAclRuleSpecs.add(modifyNetworkAclRuleSpec);
    }

}