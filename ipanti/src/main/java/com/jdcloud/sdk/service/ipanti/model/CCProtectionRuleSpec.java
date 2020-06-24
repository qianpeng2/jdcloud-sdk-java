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

import com.jdcloud.sdk.annotation.Required;

/**
 * cCProtectionRuleSpec
 */
public class CCProtectionRuleSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CC 防护规则名称, 不允许为空, 长度不超过 32 个字符, 支持中文, 大小写字母, 数字及字符&#39;-&#39;、&#39;/&#39;、&#39;.&#39;、&#39;_&#39;
     * Required:true
     */
    @Required
    private String name;

    /**
     * uri, 不允许为空, 以 / 开头, 长度不超过 2048 个字符
     * Required:true
     */
    @Required
    private String uri;

    /**
     * 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     * Required:true
     */
    @Required
    private Integer matchType;

    /**
     * 检测周期, 单位为秒, 取值范围[5, 10800]
     * Required:true
     */
    @Required
    private Long detectPeriod;

    /**
     * ip 访问次数, 取值范围[2, 2000]
     * Required:true
     */
    @Required
    private Long singleIpLimit;

    /**
     * 阻断类型, 1: 封禁, 2: 人机交互
     * Required:true
     */
    @Required
    private Integer blockType;

    /**
     * 阻断持续时间, 单位为秒, 取值范围[10, 86400]
     * Required:true
     */
    @Required
    private Long blockTime;

    /**
     * 关联的自定义页面id
     */
    private String pageId;


    /**
     * get CC 防护规则名称, 不允许为空, 长度不超过 32 个字符, 支持中文, 大小写字母, 数字及字符&#39;-&#39;、&#39;/&#39;、&#39;.&#39;、&#39;_&#39;
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set CC 防护规则名称, 不允许为空, 长度不超过 32 个字符, 支持中文, 大小写字母, 数字及字符&#39;-&#39;、&#39;/&#39;、&#39;.&#39;、&#39;_&#39;
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get uri, 不允许为空, 以 / 开头, 长度不超过 2048 个字符
     *
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * set uri, 不允许为空, 以 / 开头, 长度不超过 2048 个字符
     *
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * get 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     *
     * @return
     */
    public Integer getMatchType() {
        return matchType;
    }

    /**
     * set 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     *
     * @param matchType
     */
    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    /**
     * get 检测周期, 单位为秒, 取值范围[5, 10800]
     *
     * @return
     */
    public Long getDetectPeriod() {
        return detectPeriod;
    }

    /**
     * set 检测周期, 单位为秒, 取值范围[5, 10800]
     *
     * @param detectPeriod
     */
    public void setDetectPeriod(Long detectPeriod) {
        this.detectPeriod = detectPeriod;
    }

    /**
     * get ip 访问次数, 取值范围[2, 2000]
     *
     * @return
     */
    public Long getSingleIpLimit() {
        return singleIpLimit;
    }

    /**
     * set ip 访问次数, 取值范围[2, 2000]
     *
     * @param singleIpLimit
     */
    public void setSingleIpLimit(Long singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
    }

    /**
     * get 阻断类型, 1: 封禁, 2: 人机交互
     *
     * @return
     */
    public Integer getBlockType() {
        return blockType;
    }

    /**
     * set 阻断类型, 1: 封禁, 2: 人机交互
     *
     * @param blockType
     */
    public void setBlockType(Integer blockType) {
        this.blockType = blockType;
    }

    /**
     * get 阻断持续时间, 单位为秒, 取值范围[10, 86400]
     *
     * @return
     */
    public Long getBlockTime() {
        return blockTime;
    }

    /**
     * set 阻断持续时间, 单位为秒, 取值范围[10, 86400]
     *
     * @param blockTime
     */
    public void setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
    }

    /**
     * get 关联的自定义页面id
     *
     * @return
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * set 关联的自定义页面id
     *
     * @param pageId
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }


    /**
     * set CC 防护规则名称, 不允许为空, 长度不超过 32 个字符, 支持中文, 大小写字母, 数字及字符&#39;-&#39;、&#39;/&#39;、&#39;.&#39;、&#39;_&#39;
     *
     * @param name
     */
    public CCProtectionRuleSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set uri, 不允许为空, 以 / 开头, 长度不超过 2048 个字符
     *
     * @param uri
     */
    public CCProtectionRuleSpec uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * set 匹配 uri 类型, 0: 精确匹配, 1: 前缀匹配
     *
     * @param matchType
     */
    public CCProtectionRuleSpec matchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * set 检测周期, 单位为秒, 取值范围[5, 10800]
     *
     * @param detectPeriod
     */
    public CCProtectionRuleSpec detectPeriod(Long detectPeriod) {
        this.detectPeriod = detectPeriod;
        return this;
    }

    /**
     * set ip 访问次数, 取值范围[2, 2000]
     *
     * @param singleIpLimit
     */
    public CCProtectionRuleSpec singleIpLimit(Long singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
        return this;
    }

    /**
     * set 阻断类型, 1: 封禁, 2: 人机交互
     *
     * @param blockType
     */
    public CCProtectionRuleSpec blockType(Integer blockType) {
        this.blockType = blockType;
        return this;
    }

    /**
     * set 阻断持续时间, 单位为秒, 取值范围[10, 86400]
     *
     * @param blockTime
     */
    public CCProtectionRuleSpec blockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * set 关联的自定义页面id
     *
     * @param pageId
     */
    public CCProtectionRuleSpec pageId(String pageId) {
        this.pageId = pageId;
        return this;
    }


}