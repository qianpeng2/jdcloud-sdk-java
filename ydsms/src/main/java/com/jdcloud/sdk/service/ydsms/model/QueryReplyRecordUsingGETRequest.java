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
 * 云鼎短信服务-应用相关接口
 * 云鼎短信服务-应用相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询短信回复记录
 */
public class QueryReplyRecordUsingGETRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 手机号码
     */
    private String sendNumber;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 结束时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 开始时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 应用id
     * Required:true
     */
    @Required
    private String appId;


    /**
     * get 手机号码
     *
     * @return
     */
    public String getSendNumber() {
        return sendNumber;
    }

    /**
     * set 手机号码
     *
     * @param sendNumber
     */
    public void setSendNumber(String sendNumber) {
        this.sendNumber = sendNumber;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 结束时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 开始时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 应用id
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }


    /**
     * set 手机号码
     *
     * @param sendNumber
     */
    public QueryReplyRecordUsingGETRequest sendNumber(String sendNumber) {
        this.sendNumber = sendNumber;
        return this;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public QueryReplyRecordUsingGETRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public QueryReplyRecordUsingGETRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 结束时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     *
     * @param endTime
     */
    public QueryReplyRecordUsingGETRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 开始时间,pattern &#x3D;&quot;yyyy-MM-dd HH:mm:ss&quot;,timezone&#x3D;&quot;GMT+8&quot;
     *
     * @param startTime
     */
    public QueryReplyRecordUsingGETRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public QueryReplyRecordUsingGETRequest appId(String appId) {
        this.appId = appId;
        return this;
    }


}