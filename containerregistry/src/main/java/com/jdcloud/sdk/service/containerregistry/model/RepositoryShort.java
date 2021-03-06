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

package com.jdcloud.sdk.service.containerregistry.model;


/**
 * 镜像仓库详情数据结构
 */
public class RepositoryShort  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录用户repository创建的时间。
     */
    private String createdAt;

    /**
     * 镜像仓库repository名称。
     */
    private String repositoryName;

    /**
     * repository的URI，用户通过docker CLI,制定该URI直接进行docker pull/push等操作。
     */
    private String repositoryUri;


    /**
     * get 记录用户repository创建的时间。
     *
     * @return
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * set 记录用户repository创建的时间。
     *
     * @param createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get 镜像仓库repository名称。
     *
     * @return
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * set 镜像仓库repository名称。
     *
     * @param repositoryName
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * get repository的URI，用户通过docker CLI,制定该URI直接进行docker pull/push等操作。
     *
     * @return
     */
    public String getRepositoryUri() {
        return repositoryUri;
    }

    /**
     * set repository的URI，用户通过docker CLI,制定该URI直接进行docker pull/push等操作。
     *
     * @param repositoryUri
     */
    public void setRepositoryUri(String repositoryUri) {
        this.repositoryUri = repositoryUri;
    }


    /**
     * set 记录用户repository创建的时间。
     *
     * @param createdAt
     */
    public RepositoryShort createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set 镜像仓库repository名称。
     *
     * @param repositoryName
     */
    public RepositoryShort repositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * set repository的URI，用户通过docker CLI,制定该URI直接进行docker pull/push等操作。
     *
     * @param repositoryUri
     */
    public RepositoryShort repositoryUri(String repositoryUri) {
        this.repositoryUri = repositoryUri;
        return this;
    }


}