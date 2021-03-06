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

import java.util.List;
import java.util.ArrayList;

/**
 * product
 */
public class Product  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 维度信息
     */
    private List<Dimension> dimensions;

    /**
     * 产品标识
     */
    private String product;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * product对应的产品线
     */
    private String serviceCode;

    /**
     * 对应的标签服务serviceCode
     */
    private String tagServiceCode;

    /**
     * tags
     */
    private Object tags;


    /**
     * get 维度信息
     *
     * @return
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * set 维度信息
     *
     * @param dimensions
     */
    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * get 产品标识
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 产品标识
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get product对应的产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set product对应的产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 对应的标签服务serviceCode
     *
     * @return
     */
    public String getTagServiceCode() {
        return tagServiceCode;
    }

    /**
     * set 对应的标签服务serviceCode
     *
     * @param tagServiceCode
     */
    public void setTagServiceCode(String tagServiceCode) {
        this.tagServiceCode = tagServiceCode;
    }

    /**
     * get tags
     *
     * @return
     */
    public Object getTags() {
        return tags;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }


    /**
     * set 维度信息
     *
     * @param dimensions
     */
    public Product dimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * set 产品标识
     *
     * @param product
     */
    public Product product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public Product productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set product对应的产品线
     *
     * @param serviceCode
     */
    public Product serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 对应的标签服务serviceCode
     *
     * @param tagServiceCode
     */
    public Product tagServiceCode(String tagServiceCode) {
        this.tagServiceCode = tagServiceCode;
        return this;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public Product tags(Object tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 维度信息
     *
     * @param dimension
     */
    public void addDimension(Dimension dimension) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimension);
    }

}