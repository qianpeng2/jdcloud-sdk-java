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
 * Message-Credit-APIs
 * 富媒体资质创建、修改、删除、查询相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 增加富媒体短信资质接口
 */
public class AddCreditRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     * Required:true
     */
    @Required
    private String appId;

    /**
     * 资质名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 资质描述
     * Required:true
     */
    @Required
    private String description;

    /**
     * 营业执照图片,必须是jpg图片的base64编码，只支持jpg图片
     * Required:true
     */
    @Required
    private String businessLicense;

    /**
     * 营业执照名称
     * Required:true
     */
    @Required
    private String businessLicenseName;

    /**
     * 签名授权书图片,必须是jpg图片的base64编码，只支持jpg图片
     * Required:true
     */
    @Required
    private String signedAuthorization;

    /**
     * 签名授权书名称
     * Required:true
     */
    @Required
    private String signedAuthorizationName;

    /**
     * 信息安全保障责任书图片,必须是jpg图片的base64编码，只支持jpg图片
     * Required:true
     */
    @Required
    private String informationSecurity;

    /**
     * 信息安全保障责任书名称
     * Required:true
     */
    @Required
    private String informationSecurityName;

    /**
     * 会员证明图片,必须是jpg图片的base64编码，只支持jpg图片
     * Required:true
     */
    @Required
    private String membershipCertificate;

    /**
     * 会员证明名称
     * Required:true
     */
    @Required
    private String membershipCertificateName;

    /**
     * 其他证明图片,必须是jpg图片的base64编码，只支持jpg图片
     * Required:true
     */
    @Required
    private String otherCertificate;

    /**
     * 其他证明名称
     * Required:true
     */
    @Required
    private String otherCertificateName;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 资质名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 资质名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 资质描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 资质描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 营业执照图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @return
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * set 营业执照图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param businessLicense
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * get 营业执照名称
     *
     * @return
     */
    public String getBusinessLicenseName() {
        return businessLicenseName;
    }

    /**
     * set 营业执照名称
     *
     * @param businessLicenseName
     */
    public void setBusinessLicenseName(String businessLicenseName) {
        this.businessLicenseName = businessLicenseName;
    }

    /**
     * get 签名授权书图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @return
     */
    public String getSignedAuthorization() {
        return signedAuthorization;
    }

    /**
     * set 签名授权书图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param signedAuthorization
     */
    public void setSignedAuthorization(String signedAuthorization) {
        this.signedAuthorization = signedAuthorization;
    }

    /**
     * get 签名授权书名称
     *
     * @return
     */
    public String getSignedAuthorizationName() {
        return signedAuthorizationName;
    }

    /**
     * set 签名授权书名称
     *
     * @param signedAuthorizationName
     */
    public void setSignedAuthorizationName(String signedAuthorizationName) {
        this.signedAuthorizationName = signedAuthorizationName;
    }

    /**
     * get 信息安全保障责任书图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @return
     */
    public String getInformationSecurity() {
        return informationSecurity;
    }

    /**
     * set 信息安全保障责任书图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param informationSecurity
     */
    public void setInformationSecurity(String informationSecurity) {
        this.informationSecurity = informationSecurity;
    }

    /**
     * get 信息安全保障责任书名称
     *
     * @return
     */
    public String getInformationSecurityName() {
        return informationSecurityName;
    }

    /**
     * set 信息安全保障责任书名称
     *
     * @param informationSecurityName
     */
    public void setInformationSecurityName(String informationSecurityName) {
        this.informationSecurityName = informationSecurityName;
    }

    /**
     * get 会员证明图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @return
     */
    public String getMembershipCertificate() {
        return membershipCertificate;
    }

    /**
     * set 会员证明图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param membershipCertificate
     */
    public void setMembershipCertificate(String membershipCertificate) {
        this.membershipCertificate = membershipCertificate;
    }

    /**
     * get 会员证明名称
     *
     * @return
     */
    public String getMembershipCertificateName() {
        return membershipCertificateName;
    }

    /**
     * set 会员证明名称
     *
     * @param membershipCertificateName
     */
    public void setMembershipCertificateName(String membershipCertificateName) {
        this.membershipCertificateName = membershipCertificateName;
    }

    /**
     * get 其他证明图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @return
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * set 其他证明图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param otherCertificate
     */
    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * get 其他证明名称
     *
     * @return
     */
    public String getOtherCertificateName() {
        return otherCertificateName;
    }

    /**
     * set 其他证明名称
     *
     * @param otherCertificateName
     */
    public void setOtherCertificateName(String otherCertificateName) {
        this.otherCertificateName = otherCertificateName;
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
     * set 应用ID
     *
     * @param appId
     */
    public AddCreditRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 资质名称
     *
     * @param name
     */
    public AddCreditRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 资质描述
     *
     * @param description
     */
    public AddCreditRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 营业执照图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param businessLicense
     */
    public AddCreditRequest businessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
        return this;
    }

    /**
     * set 营业执照名称
     *
     * @param businessLicenseName
     */
    public AddCreditRequest businessLicenseName(String businessLicenseName) {
        this.businessLicenseName = businessLicenseName;
        return this;
    }

    /**
     * set 签名授权书图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param signedAuthorization
     */
    public AddCreditRequest signedAuthorization(String signedAuthorization) {
        this.signedAuthorization = signedAuthorization;
        return this;
    }

    /**
     * set 签名授权书名称
     *
     * @param signedAuthorizationName
     */
    public AddCreditRequest signedAuthorizationName(String signedAuthorizationName) {
        this.signedAuthorizationName = signedAuthorizationName;
        return this;
    }

    /**
     * set 信息安全保障责任书图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param informationSecurity
     */
    public AddCreditRequest informationSecurity(String informationSecurity) {
        this.informationSecurity = informationSecurity;
        return this;
    }

    /**
     * set 信息安全保障责任书名称
     *
     * @param informationSecurityName
     */
    public AddCreditRequest informationSecurityName(String informationSecurityName) {
        this.informationSecurityName = informationSecurityName;
        return this;
    }

    /**
     * set 会员证明图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param membershipCertificate
     */
    public AddCreditRequest membershipCertificate(String membershipCertificate) {
        this.membershipCertificate = membershipCertificate;
        return this;
    }

    /**
     * set 会员证明名称
     *
     * @param membershipCertificateName
     */
    public AddCreditRequest membershipCertificateName(String membershipCertificateName) {
        this.membershipCertificateName = membershipCertificateName;
        return this;
    }

    /**
     * set 其他证明图片,必须是jpg图片的base64编码，只支持jpg图片
     *
     * @param otherCertificate
     */
    public AddCreditRequest otherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
        return this;
    }

    /**
     * set 其他证明名称
     *
     * @param otherCertificateName
     */
    public AddCreditRequest otherCertificateName(String otherCertificateName) {
        this.otherCertificateName = otherCertificateName;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AddCreditRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}