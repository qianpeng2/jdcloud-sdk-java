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

import java.util.List;
import java.util.ArrayList;

/**
 * 版本信息
 */
public class VersionInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * redis引擎版本：目前支持2.8、4.0
     */
    private String redisVersion;

    /**
     * 类型信息列表
     */
    private List<TypeInfo> instanceTypes;


    /**
     * get redis引擎版本：目前支持2.8、4.0
     *
     * @return
     */
    public String getRedisVersion() {
        return redisVersion;
    }

    /**
     * set redis引擎版本：目前支持2.8、4.0
     *
     * @param redisVersion
     */
    public void setRedisVersion(String redisVersion) {
        this.redisVersion = redisVersion;
    }

    /**
     * get 类型信息列表
     *
     * @return
     */
    public List<TypeInfo> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * set 类型信息列表
     *
     * @param instanceTypes
     */
    public void setInstanceTypes(List<TypeInfo> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }


    /**
     * set redis引擎版本：目前支持2.8、4.0
     *
     * @param redisVersion
     */
    public VersionInfo redisVersion(String redisVersion) {
        this.redisVersion = redisVersion;
        return this;
    }

    /**
     * set 类型信息列表
     *
     * @param instanceTypes
     */
    public VersionInfo instanceTypes(List<TypeInfo> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }


    /**
     * add item to 类型信息列表
     *
     * @param instanceType
     */
    public void addInstanceType(TypeInfo instanceType) {
        if (this.instanceTypes == null) {
            this.instanceTypes = new ArrayList<>();
        }
        this.instanceTypes.add(instanceType);
    }

}