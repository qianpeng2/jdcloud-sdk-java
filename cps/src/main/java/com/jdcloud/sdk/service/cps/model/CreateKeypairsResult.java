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
 * 云物理服务器密钥对操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建密钥对
 */
public class CreateKeypairsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密钥对id
     */
    private String keypairId;

    /**
     * 地域
     */
    private String region;

    /**
     * 密钥对名称
     */
    private String name;

    /**
     * 公钥
     */
    private String publicKey;

    /**
     * 指纹
     */
    private String fingerPrint;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 私钥
     */
    private String privateKey;


    /**
     * get 密钥对id
     *
     * @return
     */
    public String getKeypairId() {
        return keypairId;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public void setKeypairId(String keypairId) {
        this.keypairId = keypairId;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 密钥对名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 密钥对名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 公钥
     *
     * @return
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * set 公钥
     *
     * @param publicKey
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * get 指纹
     *
     * @return
     */
    public String getFingerPrint() {
        return fingerPrint;
    }

    /**
     * set 指纹
     *
     * @param fingerPrint
     */
    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
     * get 私钥
     *
     * @return
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * set 私钥
     *
     * @param privateKey
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }


    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public CreateKeypairsResult keypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public CreateKeypairsResult region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 密钥对名称
     *
     * @param name
     */
    public CreateKeypairsResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 公钥
     *
     * @param publicKey
     */
    public CreateKeypairsResult publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * set 指纹
     *
     * @param fingerPrint
     */
    public CreateKeypairsResult fingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public CreateKeypairsResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public CreateKeypairsResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 私钥
     *
     * @param privateKey
     */
    public CreateKeypairsResult privateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }


}