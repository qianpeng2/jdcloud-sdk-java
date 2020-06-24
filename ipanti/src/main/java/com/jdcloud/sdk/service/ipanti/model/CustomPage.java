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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * customPage
 */
public class CustomPage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义页面Id
     */
    private String id;

    /**
     * 自定义页面名称
     */
    private String name;

    /**
     * 自定义页面内容
     */
    private String content;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * approving: 审批中, refused: 审批不通过, approved: 审批通过
     */
    private String status;


    /**
     * get 自定义页面Id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 自定义页面Id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 自定义页面名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 自定义页面名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 自定义页面内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 自定义页面内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get approving: 审批中, refused: 审批不通过, approved: 审批通过
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set approving: 审批中, refused: 审批不通过, approved: 审批通过
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 自定义页面Id
     *
     * @param id
     */
    public CustomPage id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 自定义页面名称
     *
     * @param name
     */
    public CustomPage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 自定义页面内容
     *
     * @param content
     */
    public CustomPage content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public CustomPage updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set approving: 审批中, refused: 审批不通过, approved: 审批通过
     *
     * @param status
     */
    public CustomPage status(String status) {
        this.status = status;
        return this;
    }


}