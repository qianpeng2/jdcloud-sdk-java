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

package com.jdcloud.sdk.service.censor.model;


/**
 * imageTask
 */
public class ImageTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据Id。需要保证在一次请求中所有的Id不重复
     */
    private String dataId;

    /**
     * 待检测图像的URL, 支持jpg、png、bmp，最大5M
     */
    private String url;


    /**
     * get 数据Id。需要保证在一次请求中所有的Id不重复
     *
     * @return
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * set 数据Id。需要保证在一次请求中所有的Id不重复
     *
     * @param dataId
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * get 待检测图像的URL, 支持jpg、png、bmp，最大5M
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 待检测图像的URL, 支持jpg、png、bmp，最大5M
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * set 数据Id。需要保证在一次请求中所有的Id不重复
     *
     * @param dataId
     */
    public ImageTask dataId(String dataId) {
        this.dataId = dataId;
        return this;
    }

    /**
     * set 待检测图像的URL, 支持jpg、png、bmp，最大5M
     *
     * @param url
     */
    public ImageTask url(String url) {
        this.url = url;
        return this;
    }


}