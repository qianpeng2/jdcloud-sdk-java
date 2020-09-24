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

package com.jdcloud.sdk.service.redis.model;


/**
 * 内部节点角色
 */
public class NodeRole  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点角色，包括：1）master 主分片节点；2）slave 从分片节点；3）proxy 代理节点；4）admin 管理节点
     */
    private String kind;

    /**
     * 节点个数
     */
    private Integer num;

    /**
     * 节点规格
     */
    private NodeSpec nodeSpec;


    /**
     * get 节点角色，包括：1）master 主分片节点；2）slave 从分片节点；3）proxy 代理节点；4）admin 管理节点
     *
     * @return
     */
    public String getKind() {
        return kind;
    }

    /**
     * set 节点角色，包括：1）master 主分片节点；2）slave 从分片节点；3）proxy 代理节点；4）admin 管理节点
     *
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * get 节点个数
     *
     * @return
     */
    public Integer getNum() {
        return num;
    }

    /**
     * set 节点个数
     *
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * get 节点规格
     *
     * @return
     */
    public NodeSpec getNodeSpec() {
        return nodeSpec;
    }

    /**
     * set 节点规格
     *
     * @param nodeSpec
     */
    public void setNodeSpec(NodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
    }


    /**
     * set 节点角色，包括：1）master 主分片节点；2）slave 从分片节点；3）proxy 代理节点；4）admin 管理节点
     *
     * @param kind
     */
    public NodeRole kind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * set 节点个数
     *
     * @param num
     */
    public NodeRole num(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * set 节点规格
     *
     * @param nodeSpec
     */
    public NodeRole nodeSpec(NodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }


}