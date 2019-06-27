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
 * 部署目标
 * 云部署云主机相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.deploy.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * checkAgentStatusRequest
 */
public class CheckAgentStatusRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部署组名
     * Required:true
     */
    @Required
    private String groupId;


    /**
     * get 部署组名
     *
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * set 部署组名
     *
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    /**
     * set 部署组名
     *
     * @param groupId
     */
    public CheckAgentStatusRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }


}