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

/**
 * usrBotRules
 */
public class UsrBotRules  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则id
     */
    private Integer id;

    /**
     * 规则名
     */
    private String ruleName;

    /**
     * 次数阈值
     */
    private Integer detectThrsd;

    /**
     * 检测时长，秒
     */
    private Integer detectPeriod;

    /**
     * 匹配条件集,总长度不能超过4096
     */
    private List<BotMatchItem> matchItems;

    /**
     * 动作配置，默认为告警
     */
    private DenyActionCfg action;

    /**
     * 0-使用中 1-禁用
     */
    private Integer disable;

    /**
     * 更新时间
     */
    private Integer updateTime;


    /**
     * get 规则id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 规则id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 规则名
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get 次数阈值
     *
     * @return
     */
    public Integer getDetectThrsd() {
        return detectThrsd;
    }

    /**
     * set 次数阈值
     *
     * @param detectThrsd
     */
    public void setDetectThrsd(Integer detectThrsd) {
        this.detectThrsd = detectThrsd;
    }

    /**
     * get 检测时长，秒
     *
     * @return
     */
    public Integer getDetectPeriod() {
        return detectPeriod;
    }

    /**
     * set 检测时长，秒
     *
     * @param detectPeriod
     */
    public void setDetectPeriod(Integer detectPeriod) {
        this.detectPeriod = detectPeriod;
    }

    /**
     * get 匹配条件集,总长度不能超过4096
     *
     * @return
     */
    public List<BotMatchItem> getMatchItems() {
        return matchItems;
    }

    /**
     * set 匹配条件集,总长度不能超过4096
     *
     * @param matchItems
     */
    public void setMatchItems(List<BotMatchItem> matchItems) {
        this.matchItems = matchItems;
    }

    /**
     * get 动作配置，默认为告警
     *
     * @return
     */
    public DenyActionCfg getAction() {
        return action;
    }

    /**
     * set 动作配置，默认为告警
     *
     * @param action
     */
    public void setAction(DenyActionCfg action) {
        this.action = action;
    }

    /**
     * get 0-使用中 1-禁用
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 规则id
     *
     * @param id
     */
    public UsrBotRules id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 规则名
     *
     * @param ruleName
     */
    public UsrBotRules ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set 次数阈值
     *
     * @param detectThrsd
     */
    public UsrBotRules detectThrsd(Integer detectThrsd) {
        this.detectThrsd = detectThrsd;
        return this;
    }

    /**
     * set 检测时长，秒
     *
     * @param detectPeriod
     */
    public UsrBotRules detectPeriod(Integer detectPeriod) {
        this.detectPeriod = detectPeriod;
        return this;
    }

    /**
     * set 匹配条件集,总长度不能超过4096
     *
     * @param matchItems
     */
    public UsrBotRules matchItems(List<BotMatchItem> matchItems) {
        this.matchItems = matchItems;
        return this;
    }

    /**
     * set 动作配置，默认为告警
     *
     * @param action
     */
    public UsrBotRules action(DenyActionCfg action) {
        this.action = action;
        return this;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public UsrBotRules disable(Integer disable) {
        this.disable = disable;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public UsrBotRules updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 匹配条件集,总长度不能超过4096
     *
     * @param matchItem
     */
    public void addMatchItem(BotMatchItem matchItem) {
        if (this.matchItems == null) {
            this.matchItems = new ArrayList<>();
        }
        this.matchItems.add(matchItem);
    }

}