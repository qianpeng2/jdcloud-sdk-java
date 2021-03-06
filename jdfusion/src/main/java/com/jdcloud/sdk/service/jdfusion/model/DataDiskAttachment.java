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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * dataDiskAttachment
 */
public class DataDiskAttachment  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否随云主机一起删除,true：自动；false：非自动
     */
    private Boolean autoDelete;

    /**
     * dataDisk
     */
    private DataDiskInfo dataDisk;

    /**
     * 数据盘逻辑挂载点
     */
    private String deviceName;

    /**
     * 磁盘分类,取值为本地盘(local)或者数据盘(cloud)
     */
    private String diskCategory;


    /**
     * get 是否随云主机一起删除,true：自动；false：非自动
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 是否随云主机一起删除,true：自动；false：非自动
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get dataDisk
     *
     * @return
     */
    public DataDiskInfo getDataDisk() {
        return dataDisk;
    }

    /**
     * set dataDisk
     *
     * @param dataDisk
     */
    public void setDataDisk(DataDiskInfo dataDisk) {
        this.dataDisk = dataDisk;
    }

    /**
     * get 数据盘逻辑挂载点
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 数据盘逻辑挂载点
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 磁盘分类,取值为本地盘(local)或者数据盘(cloud)
     *
     * @return
     */
    public String getDiskCategory() {
        return diskCategory;
    }

    /**
     * set 磁盘分类,取值为本地盘(local)或者数据盘(cloud)
     *
     * @param diskCategory
     */
    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }


    /**
     * set 是否随云主机一起删除,true：自动；false：非自动
     *
     * @param autoDelete
     */
    public DataDiskAttachment autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set dataDisk
     *
     * @param dataDisk
     */
    public DataDiskAttachment dataDisk(DataDiskInfo dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }

    /**
     * set 数据盘逻辑挂载点
     *
     * @param deviceName
     */
    public DataDiskAttachment deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 磁盘分类,取值为本地盘(local)或者数据盘(cloud)
     *
     * @param diskCategory
     */
    public DataDiskAttachment diskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }


}