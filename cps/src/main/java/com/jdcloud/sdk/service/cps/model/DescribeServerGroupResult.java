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
 * Cloud-Physical-Server
 * 云物理虚拟服务器组操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.cps.model.ServerGroup;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询虚拟服务器组
 */
public class DescribeServerGroupResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务器组详细信息
     */
    private ServerGroup serverGroup;


    /**
     * get 服务器组详细信息
     *
     * @return
     */
    public ServerGroup getServerGroup() {
        return serverGroup;
    }

    /**
     * set 服务器组详细信息
     *
     * @param serverGroup
     */
    public void setServerGroup(ServerGroup serverGroup) {
        this.serverGroup = serverGroup;
    }


    /**
     * set 服务器组详细信息
     *
     * @param serverGroup
     */
    public DescribeServerGroupResult serverGroup(ServerGroup serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }


}