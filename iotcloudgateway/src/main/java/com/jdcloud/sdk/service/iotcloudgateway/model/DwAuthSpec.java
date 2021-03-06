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

package com.jdcloud.sdk.service.iotcloudgateway.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * dwAuthSpec
 */
public class DwAuthSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品key
     * Required:true
     */
    @Required
    private String productKey;

    /**
     * 设备IDENT
     * Required:true
     */
    @Required
    private String deviceIdent;

    /**
     * 设备密钥
     * Required:true
     */
    @Required
    private String deviceSecret;


    /**
     * get 产品key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    /**
     * get 设备IDENT
     *
     * @return
     */
    public String getDeviceIdent() {
        return deviceIdent;
    }

    /**
     * set 设备IDENT
     *
     * @param deviceIdent
     */
    public void setDeviceIdent(String deviceIdent) {
        this.deviceIdent = deviceIdent;
    }

    /**
     * get 设备密钥
     *
     * @return
     */
    public String getDeviceSecret() {
        return deviceSecret;
    }

    /**
     * set 设备密钥
     *
     * @param deviceSecret
     */
    public void setDeviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
    }


    /**
     * set 产品key
     *
     * @param productKey
     */
    public DwAuthSpec productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * set 设备IDENT
     *
     * @param deviceIdent
     */
    public DwAuthSpec deviceIdent(String deviceIdent) {
        this.deviceIdent = deviceIdent;
        return this;
    }

    /**
     * set 设备密钥
     *
     * @param deviceSecret
     */
    public DwAuthSpec deviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
        return this;
    }


}