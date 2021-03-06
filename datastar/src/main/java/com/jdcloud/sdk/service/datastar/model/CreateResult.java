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
 * 定制画像多级筛选接口
 * 定制画像多级筛选接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.datastar.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建多级筛选
 */
public class CreateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * true为成功，false为失败
     */
    private Boolean status;

    /**
     * 描述信息
     */
    private String message;

    /**
     * 多级筛选的任务ID
     */
    private String data;


    /**
     * get true为成功，false为失败
     *
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * set true为成功，false为失败
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * get 描述信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 描述信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 多级筛选的任务ID
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * set 多级筛选的任务ID
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }


    /**
     * set true为成功，false为失败
     *
     * @param status
     */
    public CreateResult status(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * set 描述信息
     *
     * @param message
     */
    public CreateResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 多级筛选的任务ID
     *
     * @param data
     */
    public CreateResult data(String data) {
        this.data = data;
        return this;
    }


}