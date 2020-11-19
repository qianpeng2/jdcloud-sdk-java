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
 * Domain-Template
 * 域名模板相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domain.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建域名信息模板
 */
public class CreateTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板Id
     */
    private Long templateId;


    /**
     * get 模板Id
     *
     * @return
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * set 模板Id
     *
     * @param templateId
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }


    /**
     * set 模板Id
     *
     * @param templateId
     */
    public CreateTemplateResult templateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }


}