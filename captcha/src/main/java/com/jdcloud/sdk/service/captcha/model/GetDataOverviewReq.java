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

package com.jdcloud.sdk.service.captcha.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * getDataOverviewReq
 */
public class GetDataOverviewReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     * Required:true
     */
    @Required
    private Integer start;

    /**
     * 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     * Required:true
     */
    @Required
    private Integer end;

    /**
     * 应用id
     */
    private List<Long> appIds;

    /**
     * 场景id
     */
    private List<Long> sceneIds;


    /**
     * get 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     *
     * @return
     */
    public Integer getStart() {
        return start;
    }

    /**
     * set 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     *
     * @param start
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * get 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     *
     * @return
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * set 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     *
     * @param end
     */
    public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     * get 应用id
     *
     * @return
     */
    public List<Long> getAppIds() {
        return appIds;
    }

    /**
     * set 应用id
     *
     * @param appIds
     */
    public void setAppIds(List<Long> appIds) {
        this.appIds = appIds;
    }

    /**
     * get 场景id
     *
     * @return
     */
    public List<Long> getSceneIds() {
        return sceneIds;
    }

    /**
     * set 场景id
     *
     * @param sceneIds
     */
    public void setSceneIds(List<Long> sceneIds) {
        this.sceneIds = sceneIds;
    }


    /**
     * set 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     *
     * @param start
     */
    public GetDataOverviewReq start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * set 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天
     *
     * @param end
     */
    public GetDataOverviewReq end(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * set 应用id
     *
     * @param appIds
     */
    public GetDataOverviewReq appIds(List<Long> appIds) {
        this.appIds = appIds;
        return this;
    }

    /**
     * set 场景id
     *
     * @param sceneIds
     */
    public GetDataOverviewReq sceneIds(List<Long> sceneIds) {
        this.sceneIds = sceneIds;
        return this;
    }


    /**
     * add item to 应用id
     *
     * @param appId
     */
    public void addAppId(Long appId) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appId);
    }

    /**
     * add item to 场景id
     *
     * @param sceneId
     */
    public void addSceneId(Long sceneId) {
        if (this.sceneIds == null) {
            this.sceneIds = new ArrayList<>();
        }
        this.sceneIds.add(sceneId);
    }

}