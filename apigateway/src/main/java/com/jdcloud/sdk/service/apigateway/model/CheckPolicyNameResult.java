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
 * 流控策略
 * 关于流控策略配置和查看的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 检查策略名是否重复
 */
public class CheckPolicyNameResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回policyID
     */
    private String policyId;


    /**
     * get 返回policyID
     *
     * @return
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * set 返回policyID
     *
     * @param policyId
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }


    /**
     * set 返回policyID
     *
     * @param policyId
     */
    public CheckPolicyNameResult policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }


}