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

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * datasourceToken
 */
public class DatasourceToken  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ark节点名称
     * Required:true
     */
    @Required
    private String arkNode;

    /**
     * cloudMonitorOption
     */
    private CloudMonitorOption cloudMonitorOption;

    /**
     * cloudmonitor\hawkeye\deeplog
     * Required:true
     */
    @Required
    private String datasourceType;

    /**
     * orgId
     */
    private Integer orgId;


    /**
     * get ark节点名称
     *
     * @return
     */
    public String getArkNode() {
        return arkNode;
    }

    /**
     * set ark节点名称
     *
     * @param arkNode
     */
    public void setArkNode(String arkNode) {
        this.arkNode = arkNode;
    }

    /**
     * get cloudMonitorOption
     *
     * @return
     */
    public CloudMonitorOption getCloudMonitorOption() {
        return cloudMonitorOption;
    }

    /**
     * set cloudMonitorOption
     *
     * @param cloudMonitorOption
     */
    public void setCloudMonitorOption(CloudMonitorOption cloudMonitorOption) {
        this.cloudMonitorOption = cloudMonitorOption;
    }

    /**
     * get cloudmonitor\hawkeye\deeplog
     *
     * @return
     */
    public String getDatasourceType() {
        return datasourceType;
    }

    /**
     * set cloudmonitor\hawkeye\deeplog
     *
     * @param datasourceType
     */
    public void setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
    }

    /**
     * get orgId
     *
     * @return
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * set orgId
     *
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }


    /**
     * set ark节点名称
     *
     * @param arkNode
     */
    public DatasourceToken arkNode(String arkNode) {
        this.arkNode = arkNode;
        return this;
    }

    /**
     * set cloudMonitorOption
     *
     * @param cloudMonitorOption
     */
    public DatasourceToken cloudMonitorOption(CloudMonitorOption cloudMonitorOption) {
        this.cloudMonitorOption = cloudMonitorOption;
        return this;
    }

    /**
     * set cloudmonitor\hawkeye\deeplog
     *
     * @param datasourceType
     */
    public DatasourceToken datasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * set orgId
     *
     * @param orgId
     */
    public DatasourceToken orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }


}