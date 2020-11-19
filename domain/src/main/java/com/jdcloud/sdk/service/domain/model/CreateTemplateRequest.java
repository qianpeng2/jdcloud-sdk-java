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
 * Domain-Template
 * 域名模板相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domain.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建域名信息模板
 */
public class CreateTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系人姓名(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     */
    private String userNameCh;

    /**
     * 联系人姓(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     */
    private String userNameEn1;

    /**
     * 联系人名(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     */
    private String userNameEn2;

    /**
     * 域名所有者或所有者单位名称(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     */
    private String ownerNameCh;

    /**
     * 域名所有者或所有者单位名称(英文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     */
    private String ownerNameEn;

    /**
     * 国家及地区（中文）
     */
    private String nationCodeCh;

    /**
     * 国家及地区（英文）
     */
    private String nationCodeEn;

    /**
     * 省份（中文）
     */
    private String provinceCodeCh;

    /**
     * 省份（英文）
     */
    private String provinceCodeEn;

    /**
     * 城市（中文）
     */
    private String cityCodeCh;

    /**
     * 城市（英文）
     */
    private String cityCodeEn;

    /**
     * 通信地址（中文）
     */
    private String addressCh;

    /**
     * 通信地址（英文）
     */
    private String addressEn;

    /**
     * 邮编 6位数字
     */
    private String zipCode;

    /**
     * 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     */
    private String phone;

    /**
     * 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     */
    private String fax;

    /**
     * 邮件
     */
    private String email;

    /**
     * 所有者类型  1个人 2企业
     */
    private Integer ownerType;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 联系人姓名(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @return
     */
    public String getUserNameCh() {
        return userNameCh;
    }

    /**
     * set 联系人姓名(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param userNameCh
     */
    public void setUserNameCh(String userNameCh) {
        this.userNameCh = userNameCh;
    }

    /**
     * get 联系人姓(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @return
     */
    public String getUserNameEn1() {
        return userNameEn1;
    }

    /**
     * set 联系人姓(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param userNameEn1
     */
    public void setUserNameEn1(String userNameEn1) {
        this.userNameEn1 = userNameEn1;
    }

    /**
     * get 联系人名(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @return
     */
    public String getUserNameEn2() {
        return userNameEn2;
    }

    /**
     * set 联系人名(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param userNameEn2
     */
    public void setUserNameEn2(String userNameEn2) {
        this.userNameEn2 = userNameEn2;
    }

    /**
     * get 域名所有者或所有者单位名称(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @return
     */
    public String getOwnerNameCh() {
        return ownerNameCh;
    }

    /**
     * set 域名所有者或所有者单位名称(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param ownerNameCh
     */
    public void setOwnerNameCh(String ownerNameCh) {
        this.ownerNameCh = ownerNameCh;
    }

    /**
     * get 域名所有者或所有者单位名称(英文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @return
     */
    public String getOwnerNameEn() {
        return ownerNameEn;
    }

    /**
     * set 域名所有者或所有者单位名称(英文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param ownerNameEn
     */
    public void setOwnerNameEn(String ownerNameEn) {
        this.ownerNameEn = ownerNameEn;
    }

    /**
     * get 国家及地区（中文）
     *
     * @return
     */
    public String getNationCodeCh() {
        return nationCodeCh;
    }

    /**
     * set 国家及地区（中文）
     *
     * @param nationCodeCh
     */
    public void setNationCodeCh(String nationCodeCh) {
        this.nationCodeCh = nationCodeCh;
    }

    /**
     * get 国家及地区（英文）
     *
     * @return
     */
    public String getNationCodeEn() {
        return nationCodeEn;
    }

    /**
     * set 国家及地区（英文）
     *
     * @param nationCodeEn
     */
    public void setNationCodeEn(String nationCodeEn) {
        this.nationCodeEn = nationCodeEn;
    }

    /**
     * get 省份（中文）
     *
     * @return
     */
    public String getProvinceCodeCh() {
        return provinceCodeCh;
    }

    /**
     * set 省份（中文）
     *
     * @param provinceCodeCh
     */
    public void setProvinceCodeCh(String provinceCodeCh) {
        this.provinceCodeCh = provinceCodeCh;
    }

    /**
     * get 省份（英文）
     *
     * @return
     */
    public String getProvinceCodeEn() {
        return provinceCodeEn;
    }

    /**
     * set 省份（英文）
     *
     * @param provinceCodeEn
     */
    public void setProvinceCodeEn(String provinceCodeEn) {
        this.provinceCodeEn = provinceCodeEn;
    }

    /**
     * get 城市（中文）
     *
     * @return
     */
    public String getCityCodeCh() {
        return cityCodeCh;
    }

    /**
     * set 城市（中文）
     *
     * @param cityCodeCh
     */
    public void setCityCodeCh(String cityCodeCh) {
        this.cityCodeCh = cityCodeCh;
    }

    /**
     * get 城市（英文）
     *
     * @return
     */
    public String getCityCodeEn() {
        return cityCodeEn;
    }

    /**
     * set 城市（英文）
     *
     * @param cityCodeEn
     */
    public void setCityCodeEn(String cityCodeEn) {
        this.cityCodeEn = cityCodeEn;
    }

    /**
     * get 通信地址（中文）
     *
     * @return
     */
    public String getAddressCh() {
        return addressCh;
    }

    /**
     * set 通信地址（中文）
     *
     * @param addressCh
     */
    public void setAddressCh(String addressCh) {
        this.addressCh = addressCh;
    }

    /**
     * get 通信地址（英文）
     *
     * @return
     */
    public String getAddressEn() {
        return addressEn;
    }

    /**
     * set 通信地址（英文）
     *
     * @param addressEn
     */
    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn;
    }

    /**
     * get 邮编 6位数字
     *
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * set 邮编 6位数字
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * get 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * get 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @return
     */
    public String getFax() {
        return fax;
    }

    /**
     * set 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * get 邮件
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮件
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get 所有者类型  1个人 2企业
     *
     * @return
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * set 所有者类型  1个人 2企业
     *
     * @param ownerType
     */
    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 联系人姓名(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param userNameCh
     */
    public CreateTemplateRequest userNameCh(String userNameCh) {
        this.userNameCh = userNameCh;
        return this;
    }

    /**
     * set 联系人姓(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param userNameEn1
     */
    public CreateTemplateRequest userNameEn1(String userNameEn1) {
        this.userNameEn1 = userNameEn1;
        return this;
    }

    /**
     * set 联系人名(英文),必填,必须含有英文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param userNameEn2
     */
    public CreateTemplateRequest userNameEn2(String userNameEn2) {
        this.userNameEn2 = userNameEn2;
        return this;
    }

    /**
     * set 域名所有者或所有者单位名称(中文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param ownerNameCh
     */
    public CreateTemplateRequest ownerNameCh(String ownerNameCh) {
        this.ownerNameCh = ownerNameCh;
        return this;
    }

    /**
     * set 域名所有者或所有者单位名称(英文),必填,必须含有中文,只允许输入特殊字符(.,、·()()-&quot;&quot;“”/\&#39;),最多可输入64 字符
     *
     * @param ownerNameEn
     */
    public CreateTemplateRequest ownerNameEn(String ownerNameEn) {
        this.ownerNameEn = ownerNameEn;
        return this;
    }

    /**
     * set 国家及地区（中文）
     *
     * @param nationCodeCh
     */
    public CreateTemplateRequest nationCodeCh(String nationCodeCh) {
        this.nationCodeCh = nationCodeCh;
        return this;
    }

    /**
     * set 国家及地区（英文）
     *
     * @param nationCodeEn
     */
    public CreateTemplateRequest nationCodeEn(String nationCodeEn) {
        this.nationCodeEn = nationCodeEn;
        return this;
    }

    /**
     * set 省份（中文）
     *
     * @param provinceCodeCh
     */
    public CreateTemplateRequest provinceCodeCh(String provinceCodeCh) {
        this.provinceCodeCh = provinceCodeCh;
        return this;
    }

    /**
     * set 省份（英文）
     *
     * @param provinceCodeEn
     */
    public CreateTemplateRequest provinceCodeEn(String provinceCodeEn) {
        this.provinceCodeEn = provinceCodeEn;
        return this;
    }

    /**
     * set 城市（中文）
     *
     * @param cityCodeCh
     */
    public CreateTemplateRequest cityCodeCh(String cityCodeCh) {
        this.cityCodeCh = cityCodeCh;
        return this;
    }

    /**
     * set 城市（英文）
     *
     * @param cityCodeEn
     */
    public CreateTemplateRequest cityCodeEn(String cityCodeEn) {
        this.cityCodeEn = cityCodeEn;
        return this;
    }

    /**
     * set 通信地址（中文）
     *
     * @param addressCh
     */
    public CreateTemplateRequest addressCh(String addressCh) {
        this.addressCh = addressCh;
        return this;
    }

    /**
     * set 通信地址（英文）
     *
     * @param addressEn
     */
    public CreateTemplateRequest addressEn(String addressEn) {
        this.addressEn = addressEn;
        return this;
    }

    /**
     * set 邮编 6位数字
     *
     * @param zipCode
     */
    public CreateTemplateRequest zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * set 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param phone
     */
    public CreateTemplateRequest phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param fax
     */
    public CreateTemplateRequest fax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * set 邮件
     *
     * @param email
     */
    public CreateTemplateRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set 所有者类型  1个人 2企业
     *
     * @param ownerType
     */
    public CreateTemplateRequest ownerType(Integer ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public CreateTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}