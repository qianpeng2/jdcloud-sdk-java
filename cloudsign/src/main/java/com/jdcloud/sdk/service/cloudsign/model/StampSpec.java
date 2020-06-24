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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * stampSpec
 */
public class StampSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 印章图片（base64）
     */
    private String stampContent;

    /**
     * 印章名称
     */
    private String stampName;


    /**
     * get 印章图片（base64）
     *
     * @return
     */
    public String getStampContent() {
        return stampContent;
    }

    /**
     * set 印章图片（base64）
     *
     * @param stampContent
     */
    public void setStampContent(String stampContent) {
        this.stampContent = stampContent;
    }

    /**
     * get 印章名称
     *
     * @return
     */
    public String getStampName() {
        return stampName;
    }

    /**
     * set 印章名称
     *
     * @param stampName
     */
    public void setStampName(String stampName) {
        this.stampName = stampName;
    }


    /**
     * set 印章图片（base64）
     *
     * @param stampContent
     */
    public StampSpec stampContent(String stampContent) {
        this.stampContent = stampContent;
        return this;
    }

    /**
     * set 印章名称
     *
     * @param stampName
     */
    public StampSpec stampName(String stampName) {
        this.stampName = stampName;
        return this;
    }


}