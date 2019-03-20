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
 * SQL 拦截
 * SQL 拦截相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.InterceptResult;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看开启高安全模式后，当前实例的 SQL 拦截记录&lt;br&gt;- 仅支持MySQL
 */
public class DescribeInterceptResultResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * interceptResult
     */
    private List<InterceptResult> interceptResult;

    /**
     * totalCount
     */
    private Integer totalCount;


    /**
     * get interceptResult
     *
     * @return
     */
    public List<InterceptResult> getInterceptResult() {
        return interceptResult;
    }

    /**
     * set interceptResult
     *
     * @param interceptResult
     */
    public void setInterceptResult(List<InterceptResult> interceptResult) {
        this.interceptResult = interceptResult;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set interceptResult
     *
     * @param interceptResult
     */
    public DescribeInterceptResultResult interceptResult(List<InterceptResult> interceptResult) {
        this.interceptResult = interceptResult;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeInterceptResultResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to interceptResult
     *
     * @param interceptResult
     */
    public void addInterceptResult(InterceptResult interceptResult) {
        if (this.interceptResult == null) {
            this.interceptResult = new ArrayList<>();
        }
        this.interceptResult.add(interceptResult);
    }

}