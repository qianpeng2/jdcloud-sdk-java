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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * service
 */
public class Service  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务名称
     */
    private String name;

    /**
     * 服务ID
     */
    private String serviceId;

    /**
     * 服务描述
     */
    private String description;

    /**
     * 服务入参,object的key为参数名称，value为参数值
     */
    private Object input;

    /**
     * 服务出参,object的key为参数名称，value为参数值
     */
    private Object output;

    /**
     * 结果码200:成功,400:参数错误
     */
    private Integer code;

    /**
     * 创建时间
     */
    private Long createdTime;

    /**
     * 记录ID
     */
    private String msgId;

    /**
     * 失败原因
     */
    private String message;


    /**
     * get 服务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 服务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 服务ID
     *
     * @return
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * set 服务ID
     *
     * @param serviceId
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * get 服务描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 服务描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 服务入参,object的key为参数名称，value为参数值
     *
     * @return
     */
    public Object getInput() {
        return input;
    }

    /**
     * set 服务入参,object的key为参数名称，value为参数值
     *
     * @param input
     */
    public void setInput(Object input) {
        this.input = input;
    }

    /**
     * get 服务出参,object的key为参数名称，value为参数值
     *
     * @return
     */
    public Object getOutput() {
        return output;
    }

    /**
     * set 服务出参,object的key为参数名称，value为参数值
     *
     * @param output
     */
    public void setOutput(Object output) {
        this.output = output;
    }

    /**
     * get 结果码200:成功,400:参数错误
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 结果码200:成功,400:参数错误
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 记录ID
     *
     * @return
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * set 记录ID
     *
     * @param msgId
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * get 失败原因
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 失败原因
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set 服务名称
     *
     * @param name
     */
    public Service name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 服务ID
     *
     * @param serviceId
     */
    public Service serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * set 服务描述
     *
     * @param description
     */
    public Service description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 服务入参,object的key为参数名称，value为参数值
     *
     * @param input
     */
    public Service input(Object input) {
        this.input = input;
        return this;
    }

    /**
     * set 服务出参,object的key为参数名称，value为参数值
     *
     * @param output
     */
    public Service output(Object output) {
        this.output = output;
        return this;
    }

    /**
     * set 结果码200:成功,400:参数错误
     *
     * @param code
     */
    public Service code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public Service createdTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 记录ID
     *
     * @param msgId
     */
    public Service msgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * set 失败原因
     *
     * @param message
     */
    public Service message(String message) {
        this.message = message;
        return this;
    }


}