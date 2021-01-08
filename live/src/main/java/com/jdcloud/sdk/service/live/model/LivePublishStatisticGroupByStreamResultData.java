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

package com.jdcloud.sdk.service.live.model;


/**
 * livePublishStatisticGroupByStreamResultData
 */
public class LivePublishStatisticGroupByStreamResultData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流名称

     */
    private String streamName;

    /**
     * 帧率

     */
    private Long framerate;

    /**
     * 码率，单位：bps

     */
    private Long bitrate;


    /**
     * get 流名称

     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 帧率

     *
     * @return
     */
    public Long getFramerate() {
        return framerate;
    }

    /**
     * set 帧率

     *
     * @param framerate
     */
    public void setFramerate(Long framerate) {
        this.framerate = framerate;
    }

    /**
     * get 码率，单位：bps

     *
     * @return
     */
    public Long getBitrate() {
        return bitrate;
    }

    /**
     * set 码率，单位：bps

     *
     * @param bitrate
     */
    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }


    /**
     * set 流名称

     *
     * @param streamName
     */
    public LivePublishStatisticGroupByStreamResultData streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 帧率

     *
     * @param framerate
     */
    public LivePublishStatisticGroupByStreamResultData framerate(Long framerate) {
        this.framerate = framerate;
        return this;
    }

    /**
     * set 码率，单位：bps

     *
     * @param bitrate
     */
    public LivePublishStatisticGroupByStreamResultData bitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }


}