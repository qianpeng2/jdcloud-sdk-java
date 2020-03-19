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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * ossScanCfgReq
 */
public class OssScanCfgReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id标识,更新时传入，新增时传0
     */
    private Integer id;

    /**
     * 检测类型，increment-增量，stock-存量
     * Required:true
     */
    @Required
    private String scanType;

    /**
     * 存量检测的开始时间，增量时无意义
     */
    private Integer startTime;

    /**
     * 存量检测的截止时间，增量时无意义
     */
    private Integer endTime;

    /**
     * 需要检测的oss bucket信息
     * Required:true
     */
    @Required
    private List<BucketPrefixCfg> bucketsInfo;

    /**
     * 冻结方式，policy-修改权限，remove-移动到备份文件夹，目前仅支持remove
     * Required:true
     */
    @Required
    private String freezeAction;

    /**
     * 图片配置
     * Required:true
     */
    @Required
    private ScanConf imageInfo;

    /**
     * 视频配置
     * Required:true
     */
    @Required
    private ScanConf videoInfo;

    /**
     * 视频截帧配置, 暂不支持
     */
    private FrameConf frameInfo;


    /**
     * get id标识,更新时传入，新增时传0
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id标识,更新时传入，新增时传0
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 检测类型，increment-增量，stock-存量
     *
     * @return
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * set 检测类型，increment-增量，stock-存量
     *
     * @param scanType
     */
    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * get 存量检测的开始时间，增量时无意义
     *
     * @return
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * set 存量检测的开始时间，增量时无意义
     *
     * @param startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * get 存量检测的截止时间，增量时无意义
     *
     * @return
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * set 存量检测的截止时间，增量时无意义
     *
     * @param endTime
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * get 需要检测的oss bucket信息
     *
     * @return
     */
    public List<BucketPrefixCfg> getBucketsInfo() {
        return bucketsInfo;
    }

    /**
     * set 需要检测的oss bucket信息
     *
     * @param bucketsInfo
     */
    public void setBucketsInfo(List<BucketPrefixCfg> bucketsInfo) {
        this.bucketsInfo = bucketsInfo;
    }

    /**
     * get 冻结方式，policy-修改权限，remove-移动到备份文件夹，目前仅支持remove
     *
     * @return
     */
    public String getFreezeAction() {
        return freezeAction;
    }

    /**
     * set 冻结方式，policy-修改权限，remove-移动到备份文件夹，目前仅支持remove
     *
     * @param freezeAction
     */
    public void setFreezeAction(String freezeAction) {
        this.freezeAction = freezeAction;
    }

    /**
     * get 图片配置
     *
     * @return
     */
    public ScanConf getImageInfo() {
        return imageInfo;
    }

    /**
     * set 图片配置
     *
     * @param imageInfo
     */
    public void setImageInfo(ScanConf imageInfo) {
        this.imageInfo = imageInfo;
    }

    /**
     * get 视频配置
     *
     * @return
     */
    public ScanConf getVideoInfo() {
        return videoInfo;
    }

    /**
     * set 视频配置
     *
     * @param videoInfo
     */
    public void setVideoInfo(ScanConf videoInfo) {
        this.videoInfo = videoInfo;
    }

    /**
     * get 视频截帧配置, 暂不支持
     *
     * @return
     */
    public FrameConf getFrameInfo() {
        return frameInfo;
    }

    /**
     * set 视频截帧配置, 暂不支持
     *
     * @param frameInfo
     */
    public void setFrameInfo(FrameConf frameInfo) {
        this.frameInfo = frameInfo;
    }


    /**
     * set id标识,更新时传入，新增时传0
     *
     * @param id
     */
    public OssScanCfgReq id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 检测类型，increment-增量，stock-存量
     *
     * @param scanType
     */
    public OssScanCfgReq scanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * set 存量检测的开始时间，增量时无意义
     *
     * @param startTime
     */
    public OssScanCfgReq startTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 存量检测的截止时间，增量时无意义
     *
     * @param endTime
     */
    public OssScanCfgReq endTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 需要检测的oss bucket信息
     *
     * @param bucketsInfo
     */
    public OssScanCfgReq bucketsInfo(List<BucketPrefixCfg> bucketsInfo) {
        this.bucketsInfo = bucketsInfo;
        return this;
    }

    /**
     * set 冻结方式，policy-修改权限，remove-移动到备份文件夹，目前仅支持remove
     *
     * @param freezeAction
     */
    public OssScanCfgReq freezeAction(String freezeAction) {
        this.freezeAction = freezeAction;
        return this;
    }

    /**
     * set 图片配置
     *
     * @param imageInfo
     */
    public OssScanCfgReq imageInfo(ScanConf imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    /**
     * set 视频配置
     *
     * @param videoInfo
     */
    public OssScanCfgReq videoInfo(ScanConf videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }

    /**
     * set 视频截帧配置, 暂不支持
     *
     * @param frameInfo
     */
    public OssScanCfgReq frameInfo(FrameConf frameInfo) {
        this.frameInfo = frameInfo;
        return this;
    }


    /**
     * add item to 需要检测的oss bucket信息
     *
     * @param bucketsInfo
     */
    public void addBucketsInfo(BucketPrefixCfg bucketsInfo) {
        if (this.bucketsInfo == null) {
            this.bucketsInfo = new ArrayList<>();
        }
        this.bucketsInfo.add(bucketsInfo);
    }

}