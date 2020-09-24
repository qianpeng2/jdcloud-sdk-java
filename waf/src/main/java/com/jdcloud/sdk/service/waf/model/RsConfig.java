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

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * rsConfig
 */
public class RsConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回源地址
     * Required:true
     */
    @Required
    private List<String> rsAddr;

    /**
     * 回源地址权重，与rsAddr顺序对应
     */
    private List<Integer> weight;

    /**
     * http回源端口
     */
    private List<String> httpRsPort;

    /**
     * https回源端口
     */
    private List<String> httpsRsPort;

    /**
     * 回源地址类型，0为ip，1为域名
     */
    private Integer rsType;


    /**
     * get 回源地址
     *
     * @return
     */
    public List<String> getRsAddr() {
        return rsAddr;
    }

    /**
     * set 回源地址
     *
     * @param rsAddr
     */
    public void setRsAddr(List<String> rsAddr) {
        this.rsAddr = rsAddr;
    }

    /**
     * get 回源地址权重，与rsAddr顺序对应
     *
     * @return
     */
    public List<Integer> getWeight() {
        return weight;
    }

    /**
     * set 回源地址权重，与rsAddr顺序对应
     *
     * @param weight
     */
    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    /**
     * get http回源端口
     *
     * @return
     */
    public List<String> getHttpRsPort() {
        return httpRsPort;
    }

    /**
     * set http回源端口
     *
     * @param httpRsPort
     */
    public void setHttpRsPort(List<String> httpRsPort) {
        this.httpRsPort = httpRsPort;
    }

    /**
     * get https回源端口
     *
     * @return
     */
    public List<String> getHttpsRsPort() {
        return httpsRsPort;
    }

    /**
     * set https回源端口
     *
     * @param httpsRsPort
     */
    public void setHttpsRsPort(List<String> httpsRsPort) {
        this.httpsRsPort = httpsRsPort;
    }

    /**
     * get 回源地址类型，0为ip，1为域名
     *
     * @return
     */
    public Integer getRsType() {
        return rsType;
    }

    /**
     * set 回源地址类型，0为ip，1为域名
     *
     * @param rsType
     */
    public void setRsType(Integer rsType) {
        this.rsType = rsType;
    }


    /**
     * set 回源地址
     *
     * @param rsAddr
     */
    public RsConfig rsAddr(List<String> rsAddr) {
        this.rsAddr = rsAddr;
        return this;
    }

    /**
     * set 回源地址权重，与rsAddr顺序对应
     *
     * @param weight
     */
    public RsConfig weight(List<Integer> weight) {
        this.weight = weight;
        return this;
    }

    /**
     * set http回源端口
     *
     * @param httpRsPort
     */
    public RsConfig httpRsPort(List<String> httpRsPort) {
        this.httpRsPort = httpRsPort;
        return this;
    }

    /**
     * set https回源端口
     *
     * @param httpsRsPort
     */
    public RsConfig httpsRsPort(List<String> httpsRsPort) {
        this.httpsRsPort = httpsRsPort;
        return this;
    }

    /**
     * set 回源地址类型，0为ip，1为域名
     *
     * @param rsType
     */
    public RsConfig rsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }


    /**
     * add item to 回源地址
     *
     * @param rsAddr
     */
    public void addRsAddr(String rsAddr) {
        if (this.rsAddr == null) {
            this.rsAddr = new ArrayList<>();
        }
        this.rsAddr.add(rsAddr);
    }

    /**
     * add item to 回源地址权重，与rsAddr顺序对应
     *
     * @param weight
     */
    public void addWeight(Integer weight) {
        if (this.weight == null) {
            this.weight = new ArrayList<>();
        }
        this.weight.add(weight);
    }

    /**
     * add item to http回源端口
     *
     * @param httpRsPort
     */
    public void addHttpRsPort(String httpRsPort) {
        if (this.httpRsPort == null) {
            this.httpRsPort = new ArrayList<>();
        }
        this.httpRsPort.add(httpRsPort);
    }

    /**
     * add item to https回源端口
     *
     * @param httpsRsPort
     */
    public void addHttpsRsPort(String httpsRsPort) {
        if (this.httpsRsPort == null) {
            this.httpsRsPort = new ArrayList<>();
        }
        this.httpsRsPort.add(httpsRsPort);
    }

}