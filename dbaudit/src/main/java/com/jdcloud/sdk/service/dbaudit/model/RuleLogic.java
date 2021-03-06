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

package com.jdcloud.sdk.service.dbaudit.model;


/**
 * 规则逻辑型
 */
public class RuleLogic  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 逻辑: 0-&gt;不包含, 1-&gt;包含, 2-&gt;等于, 3-&gt;小于等于, 4-&gt;小于, 5-&gt;大于等于, 6-&gt;大于, 7-&gt;不等于, 8-&gt;正则
     */
    private Integer logic;

    /**
     * 值
     */
    private String value;


    /**
     * get 是否启用
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 逻辑: 0-&gt;不包含, 1-&gt;包含, 2-&gt;等于, 3-&gt;小于等于, 4-&gt;小于, 5-&gt;大于等于, 6-&gt;大于, 7-&gt;不等于, 8-&gt;正则
     *
     * @return
     */
    public Integer getLogic() {
        return logic;
    }

    /**
     * set 逻辑: 0-&gt;不包含, 1-&gt;包含, 2-&gt;等于, 3-&gt;小于等于, 4-&gt;小于, 5-&gt;大于等于, 6-&gt;大于, 7-&gt;不等于, 8-&gt;正则
     *
     * @param logic
     */
    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    /**
     * get 值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * set 是否启用
     *
     * @param enabled
     */
    public RuleLogic enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 逻辑: 0-&gt;不包含, 1-&gt;包含, 2-&gt;等于, 3-&gt;小于等于, 4-&gt;小于, 5-&gt;大于等于, 6-&gt;大于, 7-&gt;不等于, 8-&gt;正则
     *
     * @param logic
     */
    public RuleLogic logic(Integer logic) {
        this.logic = logic;
        return this;
    }

    /**
     * set 值
     *
     * @param value
     */
    public RuleLogic value(String value) {
        this.value = value;
        return this;
    }


}