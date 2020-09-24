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
 * Distributed-Cloud-Physical-Server
 * 分布式云物理服务器共享带宽操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.service.edcps.model.BandwidthPackage;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询共享带宽详情
 */
public class DescribeBandwidthPackageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 共享带宽详细信息
     */
    private BandwidthPackage bandwidthPackage;


    /**
     * get 共享带宽详细信息
     *
     * @return
     */
    public BandwidthPackage getBandwidthPackage() {
        return bandwidthPackage;
    }

    /**
     * set 共享带宽详细信息
     *
     * @param bandwidthPackage
     */
    public void setBandwidthPackage(BandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
    }


    /**
     * set 共享带宽详细信息
     *
     * @param bandwidthPackage
     */
    public DescribeBandwidthPackageResult bandwidthPackage(BandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
        return this;
    }


}