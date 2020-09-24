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
 * Listener
 * 监听器资源相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.lb.model.ExtCertificateUpdateSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * listener批量修改扩展证书
 */
public class UpdateListenerCertificatesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 【alb Https和Tls协议】Listener绑定的扩展证书列表
     * Required:true
     */
    @Required
    private List<ExtCertificateUpdateSpec> certificates;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 监听器ID
     * Required:true
     */
    @Required
    private String listenerId;


    /**
     * get 【alb Https和Tls协议】Listener绑定的扩展证书列表
     *
     * @return
     */
    public List<ExtCertificateUpdateSpec> getCertificates() {
        return certificates;
    }

    /**
     * set 【alb Https和Tls协议】Listener绑定的扩展证书列表
     *
     * @param certificates
     */
    public void setCertificates(List<ExtCertificateUpdateSpec> certificates) {
        this.certificates = certificates;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 监听器ID
     *
     * @return
     */
    public String getListenerId() {
        return listenerId;
    }

    /**
     * set 监听器ID
     *
     * @param listenerId
     */
    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }


    /**
     * set 【alb Https和Tls协议】Listener绑定的扩展证书列表
     *
     * @param certificates
     */
    public UpdateListenerCertificatesRequest certificates(List<ExtCertificateUpdateSpec> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public UpdateListenerCertificatesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 监听器ID
     *
     * @param listenerId
     */
    public UpdateListenerCertificatesRequest listenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }


    /**
     * add item to 【alb Https和Tls协议】Listener绑定的扩展证书列表
     *
     * @param certificate
     */
    public void addCertificate(ExtCertificateUpdateSpec certificate) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificate);
    }

}