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


/**
 * wafConf
 */
public class WafConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否使能 0表示否
     */
    private Integer enable;

    /**
     * 0表示防护，1表示预警
     */
    private Integer wafMode;

    /**
     * 0表示宽松，1表示正常，2表示严格
     */
    private Integer wafLevel;

    /**
     * 自定义页面名称
     */
    private String redirection;


    /**
     * get 是否使能 0表示否
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get 0表示防护，1表示预警
     *
     * @return
     */
    public Integer getWafMode() {
        return wafMode;
    }

    /**
     * set 0表示防护，1表示预警
     *
     * @param wafMode
     */
    public void setWafMode(Integer wafMode) {
        this.wafMode = wafMode;
    }

    /**
     * get 0表示宽松，1表示正常，2表示严格
     *
     * @return
     */
    public Integer getWafLevel() {
        return wafLevel;
    }

    /**
     * set 0表示宽松，1表示正常，2表示严格
     *
     * @param wafLevel
     */
    public void setWafLevel(Integer wafLevel) {
        this.wafLevel = wafLevel;
    }

    /**
     * get 自定义页面名称
     *
     * @return
     */
    public String getRedirection() {
        return redirection;
    }

    /**
     * set 自定义页面名称
     *
     * @param redirection
     */
    public void setRedirection(String redirection) {
        this.redirection = redirection;
    }


    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public WafConf enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 0表示防护，1表示预警
     *
     * @param wafMode
     */
    public WafConf wafMode(Integer wafMode) {
        this.wafMode = wafMode;
        return this;
    }

    /**
     * set 0表示宽松，1表示正常，2表示严格
     *
     * @param wafLevel
     */
    public WafConf wafLevel(Integer wafLevel) {
        this.wafLevel = wafLevel;
        return this;
    }

    /**
     * set 自定义页面名称
     *
     * @param redirection
     */
    public WafConf redirection(String redirection) {
        this.redirection = redirection;
        return this;
    }


}