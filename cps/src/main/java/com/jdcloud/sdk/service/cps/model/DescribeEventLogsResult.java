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
import com.jdcloud.sdk.service.cps.model.EventLog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询云物理服务器监控报警日志信息
 */
public class DescribeEventLogsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * eventLogs
     */
    private List<EventLog> eventLogs;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[20, 100]
     */
    private Integer pageSize;

    /**
     * 查询结果总数
     */
    private Integer totalCount;


    /**
     * get eventLogs
     *
     * @return
     */
    public List<EventLog> getEventLogs() {
        return eventLogs;
    }

    /**
     * set eventLogs
     *
     * @param eventLogs
     */
    public void setEventLogs(List<EventLog> eventLogs) {
        this.eventLogs = eventLogs;
    }

    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为20；取值范围[20, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询结果总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set eventLogs
     *
     * @param eventLogs
     */
    public DescribeEventLogsResult eventLogs(List<EventLog> eventLogs) {
        this.eventLogs = eventLogs;
        return this;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeEventLogsResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public DescribeEventLogsResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public DescribeEventLogsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to eventLogs
     *
     * @param eventLog
     */
    public void addEventLog(EventLog eventLog) {
        if (this.eventLogs == null) {
            this.eventLogs = new ArrayList<>();
        }
        this.eventLogs.add(eventLog);
    }

}