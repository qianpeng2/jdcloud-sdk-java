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

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;

/**
 * oribandwidthTopItem
 */
public class OribandwidthTopItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * name
     */
    private String name;

    /**
     * total
     */
    private Double total;

    /**
     * details
     */
    private List<OriBandwithDetailItem> details;


    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get total
     *
     * @return
     */
    public Double getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * get details
     *
     * @return
     */
    public List<OriBandwithDetailItem> getDetails() {
        return details;
    }

    /**
     * set details
     *
     * @param details
     */
    public void setDetails(List<OriBandwithDetailItem> details) {
        this.details = details;
    }


    /**
     * set name
     *
     * @param name
     */
    public OribandwidthTopItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set total
     *
     * @param total
     */
    public OribandwidthTopItem total(Double total) {
        this.total = total;
        return this;
    }

    /**
     * set details
     *
     * @param details
     */
    public OribandwidthTopItem details(List<OriBandwithDetailItem> details) {
        this.details = details;
        return this;
    }


    /**
     * add item to details
     *
     * @param detail
     */
    public void addDetail(OriBandwithDetailItem detail) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detail);
    }

}