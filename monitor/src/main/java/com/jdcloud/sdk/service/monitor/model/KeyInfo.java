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

package com.jdcloud.sdk.service.monitor.model;


/**
 * keyInfo
 */
public class KeyInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * keyUID
     */
    private String key;

    /**
     * key名字
     */
    private String keyName;


    /**
     * get keyUID
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set keyUID
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * get key名字
     *
     * @return
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * set key名字
     *
     * @param keyName
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }


    /**
     * set keyUID
     *
     * @param key
     */
    public KeyInfo key(String key) {
        this.key = key;
        return this;
    }

    /**
     * set key名字
     *
     * @param keyName
     */
    public KeyInfo keyName(String keyName) {
        this.keyName = keyName;
        return this;
    }


}