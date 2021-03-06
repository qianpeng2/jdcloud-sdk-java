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

package com.jdcloud.sdk.service.sms.model;


/**
 * respQuerySignListData
 */
public class RespQuerySignListData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 签名ID
     */
    private String signId;

    /**
     * 签名内容
     */
    private String signName;

    /**
     * 签名状态: -1 草稿， 0 审核中， 1 审核通过， 2 审核不通过， 3 停用
     */
    private String signStatus;

    /**
     * 短信创建时间 yyyy-MM-dd HH:mm:ss
     */
    private String createTime;


    /**
     * get 签名ID
     *
     * @return
     */
    public String getSignId() {
        return signId;
    }

    /**
     * set 签名ID
     *
     * @param signId
     */
    public void setSignId(String signId) {
        this.signId = signId;
    }

    /**
     * get 签名内容
     *
     * @return
     */
    public String getSignName() {
        return signName;
    }

    /**
     * set 签名内容
     *
     * @param signName
     */
    public void setSignName(String signName) {
        this.signName = signName;
    }

    /**
     * get 签名状态: -1 草稿， 0 审核中， 1 审核通过， 2 审核不通过， 3 停用
     *
     * @return
     */
    public String getSignStatus() {
        return signStatus;
    }

    /**
     * set 签名状态: -1 草稿， 0 审核中， 1 审核通过， 2 审核不通过， 3 停用
     *
     * @param signStatus
     */
    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }

    /**
     * get 短信创建时间 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 短信创建时间 yyyy-MM-dd HH:mm:ss
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 签名ID
     *
     * @param signId
     */
    public RespQuerySignListData signId(String signId) {
        this.signId = signId;
        return this;
    }

    /**
     * set 签名内容
     *
     * @param signName
     */
    public RespQuerySignListData signName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * set 签名状态: -1 草稿， 0 审核中， 1 审核通过， 2 审核不通过， 3 停用
     *
     * @param signStatus
     */
    public RespQuerySignListData signStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }

    /**
     * set 短信创建时间 yyyy-MM-dd HH:mm:ss
     *
     * @param createTime
     */
    public RespQuerySignListData createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}