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
 * Send-Message-Related-APIs
 * 模版相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * respTemplatePageResult
 */
public class RespTemplatePageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总条数
     */
    private Long count;

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 数据
     */
    private List<RespQueryTemplateListData> list;


    /**
     * get 总条数
     *
     * @return
     */
    public Long getCount() {
        return count;
    }

    /**
     * set 总条数
     *
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * get 当前页
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 当前页
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * get 每页条数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * set 总页数
     *
     * @param pageCount
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * get 数据
     *
     * @return
     */
    public List<RespQueryTemplateListData> getList() {
        return list;
    }

    /**
     * set 数据
     *
     * @param list
     */
    public void setList(List<RespQueryTemplateListData> list) {
        this.list = list;
    }


    /**
     * set 总条数
     *
     * @param count
     */
    public RespTemplatePageResult count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * set 当前页
     *
     * @param pageNum
     */
    public RespTemplatePageResult pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * set 每页条数
     *
     * @param pageSize
     */
    public RespTemplatePageResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 总页数
     *
     * @param pageCount
     */
    public RespTemplatePageResult pageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    /**
     * set 数据
     *
     * @param list
     */
    public RespTemplatePageResult list(List<RespQueryTemplateListData> list) {
        this.list = list;
        return this;
    }


    /**
     * add item to 数据
     *
     * @param list
     */
    public void addList(RespQueryTemplateListData list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }

}