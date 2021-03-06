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
 * createGrafanaDashboardSpec
 */
public class CreateGrafanaDashboardSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * description
     */
    private String description;

    /**
     * FolderId，文件夹id，默认为0
     */
    private Long folderId;

    /**
     * Params, 模板参数名称及指定值，key为名称、value为指定值
     * Required:true
     */
    @Required
    private Object params;

    /**
     * Title
     * Required:true
     */
    @Required
    private String title;


    /**
     * get description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get FolderId，文件夹id，默认为0
     *
     * @return
     */
    public Long getFolderId() {
        return folderId;
    }

    /**
     * set FolderId，文件夹id，默认为0
     *
     * @param folderId
     */
    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    /**
     * get Params, 模板参数名称及指定值，key为名称、value为指定值
     *
     * @return
     */
    public Object getParams() {
        return params;
    }

    /**
     * set Params, 模板参数名称及指定值，key为名称、value为指定值
     *
     * @param params
     */
    public void setParams(Object params) {
        this.params = params;
    }

    /**
     * get Title
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set Title
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * set description
     *
     * @param description
     */
    public CreateGrafanaDashboardSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set FolderId，文件夹id，默认为0
     *
     * @param folderId
     */
    public CreateGrafanaDashboardSpec folderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * set Params, 模板参数名称及指定值，key为名称、value为指定值
     *
     * @param params
     */
    public CreateGrafanaDashboardSpec params(Object params) {
        this.params = params;
        return this;
    }

    /**
     * set Title
     *
     * @param title
     */
    public CreateGrafanaDashboardSpec title(String title) {
        this.title = title;
        return this;
    }


}