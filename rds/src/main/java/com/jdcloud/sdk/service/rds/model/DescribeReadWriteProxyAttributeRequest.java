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
 * Read-Write-Proxy-Management
 * 读写分离代理管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看指定RDS读写分离代理详情&lt;br&gt;- 仅支持MySQL
 */
public class DescribeReadWriteProxyAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 读写分离代理服务ID
     * Required:true
     */
    @Required
    private String readWriteProxyId;


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 读写分离代理服务ID
     *
     * @return
     */
    public String getReadWriteProxyId() {
        return readWriteProxyId;
    }

    /**
     * set 读写分离代理服务ID
     *
     * @param readWriteProxyId
     */
    public void setReadWriteProxyId(String readWriteProxyId) {
        this.readWriteProxyId = readWriteProxyId;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DescribeReadWriteProxyAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 读写分离代理服务ID
     *
     * @param readWriteProxyId
     */
    public DescribeReadWriteProxyAttributeRequest readWriteProxyId(String readWriteProxyId) {
        this.readWriteProxyId = readWriteProxyId;
        return this;
    }


}