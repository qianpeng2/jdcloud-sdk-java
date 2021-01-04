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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * generateTokenAuthInfo
 */
public class GenerateTokenAuthInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appId
     */
    private String appId;

    /**
     * appKey
     */
    private String appKey;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 会议号
     */
    private Long roomId;

    /**
     * 时间戳-毫秒
     */
    private Long timestamp;


    /**
     * get appId
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set appId
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get appKey
     *
     * @return
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * set appKey
     *
     * @param appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * get 用户id
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 用户id
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * get 会议号
     *
     * @return
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * set 会议号
     *
     * @param roomId
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * get 时间戳-毫秒
     *
     * @return
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * set 时间戳-毫秒
     *
     * @param timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * set appId
     *
     * @param appId
     */
    public GenerateTokenAuthInfo appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set appKey
     *
     * @param appKey
     */
    public GenerateTokenAuthInfo appKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * set 用户id
     *
     * @param userId
     */
    public GenerateTokenAuthInfo userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * set 会议号
     *
     * @param roomId
     */
    public GenerateTokenAuthInfo roomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * set 时间戳-毫秒
     *
     * @param timestamp
     */
    public GenerateTokenAuthInfo timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }


}