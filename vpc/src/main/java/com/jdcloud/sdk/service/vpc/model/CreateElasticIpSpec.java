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

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * createElasticIpSpec
 */
public class CreateElasticIpSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购买弹性ip数量；取值范围：[1,100]
     * Required:true
     */
    @Required
    private Integer maxCount;

    /**
     * 指定弹性ip地址进行创建，当申请创建多个弹性ip时，必须为空
     */
    private String elasticIpAddress;

    /**
     * 弹性ip规格
     * Required:true
     */
    @Required
    private ElasticIpSpec elasticIpSpec;

    /**
     * 用户标签
     */
    private List<Tag> userTags;

    /**
     * 弹性ip类型，取值：standard(标准公网IP)，edge(边缘公网IP)，默认为standard
     */
    private String ipType;


    /**
     * get 购买弹性ip数量；取值范围：[1,100]
     *
     * @return
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * set 购买弹性ip数量；取值范围：[1,100]
     *
     * @param maxCount
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * get 指定弹性ip地址进行创建，当申请创建多个弹性ip时，必须为空
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 指定弹性ip地址进行创建，当申请创建多个弹性ip时，必须为空
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }

    /**
     * get 弹性ip规格
     *
     * @return
     */
    public ElasticIpSpec getElasticIpSpec() {
        return elasticIpSpec;
    }

    /**
     * set 弹性ip规格
     *
     * @param elasticIpSpec
     */
    public void setElasticIpSpec(ElasticIpSpec elasticIpSpec) {
        this.elasticIpSpec = elasticIpSpec;
    }

    /**
     * get 用户标签
     *
     * @return
     */
    public List<Tag> getUserTags() {
        return userTags;
    }

    /**
     * set 用户标签
     *
     * @param userTags
     */
    public void setUserTags(List<Tag> userTags) {
        this.userTags = userTags;
    }

    /**
     * get 弹性ip类型，取值：standard(标准公网IP)，edge(边缘公网IP)，默认为standard
     *
     * @return
     */
    public String getIpType() {
        return ipType;
    }

    /**
     * set 弹性ip类型，取值：standard(标准公网IP)，edge(边缘公网IP)，默认为standard
     *
     * @param ipType
     */
    public void setIpType(String ipType) {
        this.ipType = ipType;
    }


    /**
     * set 购买弹性ip数量；取值范围：[1,100]
     *
     * @param maxCount
     */
    public CreateElasticIpSpec maxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * set 指定弹性ip地址进行创建，当申请创建多个弹性ip时，必须为空
     *
     * @param elasticIpAddress
     */
    public CreateElasticIpSpec elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }

    /**
     * set 弹性ip规格
     *
     * @param elasticIpSpec
     */
    public CreateElasticIpSpec elasticIpSpec(ElasticIpSpec elasticIpSpec) {
        this.elasticIpSpec = elasticIpSpec;
        return this;
    }

    /**
     * set 用户标签
     *
     * @param userTags
     */
    public CreateElasticIpSpec userTags(List<Tag> userTags) {
        this.userTags = userTags;
        return this;
    }

    /**
     * set 弹性ip类型，取值：standard(标准公网IP)，edge(边缘公网IP)，默认为standard
     *
     * @param ipType
     */
    public CreateElasticIpSpec ipType(String ipType) {
        this.ipType = ipType;
        return this;
    }


    /**
     * add item to 用户标签
     *
     * @param userTag
     */
    public void addUserTag(Tag userTag) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTag);
    }

}