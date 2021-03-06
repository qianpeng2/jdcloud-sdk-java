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
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cps.model.MetricData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询云物理服务器监控信息
 */
public class DescribeInstanceMonitorInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * metricDatas
     */
    private List<MetricData> metricDatas;


    /**
     * get metricDatas
     *
     * @return
     */
    public List<MetricData> getMetricDatas() {
        return metricDatas;
    }

    /**
     * set metricDatas
     *
     * @param metricDatas
     */
    public void setMetricDatas(List<MetricData> metricDatas) {
        this.metricDatas = metricDatas;
    }


    /**
     * set metricDatas
     *
     * @param metricDatas
     */
    public DescribeInstanceMonitorInfoResult metricDatas(List<MetricData> metricDatas) {
        this.metricDatas = metricDatas;
        return this;
    }


    /**
     * add item to metricDatas
     *
     * @param metricData
     */
    public void addMetricData(MetricData metricData) {
        if (this.metricDatas == null) {
            this.metricDatas = new ArrayList<>();
        }
        this.metricDatas.add(metricData);
    }

}