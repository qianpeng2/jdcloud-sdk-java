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

import com.jdcloud.sdk.annotation.Required;

/**
 * rewriteRuleCfg
 */
public class RewriteRuleCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号id,更新时需要
     */
    private Integer id;

    /**
     * 原始值
     * Required:true
     */
    @Required
    private String oriVal;

    /**
     * 重写值
     * Required:true
     */
    @Required
    private String setVal;


    /**
     * get 序号id,更新时需要
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 序号id,更新时需要
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 原始值
     *
     * @return
     */
    public String getOriVal() {
        return oriVal;
    }

    /**
     * set 原始值
     *
     * @param oriVal
     */
    public void setOriVal(String oriVal) {
        this.oriVal = oriVal;
    }

    /**
     * get 重写值
     *
     * @return
     */
    public String getSetVal() {
        return setVal;
    }

    /**
     * set 重写值
     *
     * @param setVal
     */
    public void setSetVal(String setVal) {
        this.setVal = setVal;
    }


    /**
     * set 序号id,更新时需要
     *
     * @param id
     */
    public RewriteRuleCfg id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 原始值
     *
     * @param oriVal
     */
    public RewriteRuleCfg oriVal(String oriVal) {
        this.oriVal = oriVal;
        return this;
    }

    /**
     * set 重写值
     *
     * @param setVal
     */
    public RewriteRuleCfg setVal(String setVal) {
        this.setVal = setVal;
        return this;
    }


}