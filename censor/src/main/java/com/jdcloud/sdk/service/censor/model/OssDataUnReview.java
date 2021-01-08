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
 * ossDataUnReview
 */
public class OssDataUnReview  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 语音反垃圾
     */
    private Integer audio_antispam;

    /**
     * 文本反垃圾
     */
    private Integer text_antispam;

    /**
     * 涉黄
     */
    private Integer porn;

    /**
     * 涉政暴恐
     */
    private Integer politics_terrorism;

    /**
     * 机器识别量
     */
    private Integer recognization;

    /**
     * 正常量
     */
    private Integer pass;

    /**
     * 违规内容量
     */
    private Integer block;

    /**
     * 疑似内容量
     */
    private Integer review;

    /**
     * 5xx状态码量
     */
    private Integer status5xx;

    /**
     * 总的响应时间
     */
    private Integer taskMsec;

    /**
     * blockDetail
     */
    private BlockDetail blockDetail;

    /**
     * 音频识别详情
     */
    private AudioDetail audioDetail;

    /**
     * 视频识别详情（包括截帧数和音频时长）
     */
    private VideoDetail videoDetail;


    /**
     * get 语音反垃圾
     *
     * @return
     */
    public Integer getAudio_antispam() {
        return audio_antispam;
    }

    /**
     * set 语音反垃圾
     *
     * @param audio_antispam
     */
    public void setAudio_antispam(Integer audio_antispam) {
        this.audio_antispam = audio_antispam;
    }

    /**
     * get 文本反垃圾
     *
     * @return
     */
    public Integer getText_antispam() {
        return text_antispam;
    }

    /**
     * set 文本反垃圾
     *
     * @param text_antispam
     */
    public void setText_antispam(Integer text_antispam) {
        this.text_antispam = text_antispam;
    }

    /**
     * get 涉黄
     *
     * @return
     */
    public Integer getPorn() {
        return porn;
    }

    /**
     * set 涉黄
     *
     * @param porn
     */
    public void setPorn(Integer porn) {
        this.porn = porn;
    }

    /**
     * get 涉政暴恐
     *
     * @return
     */
    public Integer getPolitics_terrorism() {
        return politics_terrorism;
    }

    /**
     * set 涉政暴恐
     *
     * @param politics_terrorism
     */
    public void setPolitics_terrorism(Integer politics_terrorism) {
        this.politics_terrorism = politics_terrorism;
    }

    /**
     * get 机器识别量
     *
     * @return
     */
    public Integer getRecognization() {
        return recognization;
    }

    /**
     * set 机器识别量
     *
     * @param recognization
     */
    public void setRecognization(Integer recognization) {
        this.recognization = recognization;
    }

    /**
     * get 正常量
     *
     * @return
     */
    public Integer getPass() {
        return pass;
    }

    /**
     * set 正常量
     *
     * @param pass
     */
    public void setPass(Integer pass) {
        this.pass = pass;
    }

    /**
     * get 违规内容量
     *
     * @return
     */
    public Integer getBlock() {
        return block;
    }

    /**
     * set 违规内容量
     *
     * @param block
     */
    public void setBlock(Integer block) {
        this.block = block;
    }

    /**
     * get 疑似内容量
     *
     * @return
     */
    public Integer getReview() {
        return review;
    }

    /**
     * set 疑似内容量
     *
     * @param review
     */
    public void setReview(Integer review) {
        this.review = review;
    }

    /**
     * get 5xx状态码量
     *
     * @return
     */
    public Integer getStatus5xx() {
        return status5xx;
    }

    /**
     * set 5xx状态码量
     *
     * @param status5xx
     */
    public void setStatus5xx(Integer status5xx) {
        this.status5xx = status5xx;
    }

    /**
     * get 总的响应时间
     *
     * @return
     */
    public Integer getTaskMsec() {
        return taskMsec;
    }

    /**
     * set 总的响应时间
     *
     * @param taskMsec
     */
    public void setTaskMsec(Integer taskMsec) {
        this.taskMsec = taskMsec;
    }

    /**
     * get blockDetail
     *
     * @return
     */
    public BlockDetail getBlockDetail() {
        return blockDetail;
    }

    /**
     * set blockDetail
     *
     * @param blockDetail
     */
    public void setBlockDetail(BlockDetail blockDetail) {
        this.blockDetail = blockDetail;
    }

    /**
     * get 音频识别详情
     *
     * @return
     */
    public AudioDetail getAudioDetail() {
        return audioDetail;
    }

    /**
     * set 音频识别详情
     *
     * @param audioDetail
     */
    public void setAudioDetail(AudioDetail audioDetail) {
        this.audioDetail = audioDetail;
    }

    /**
     * get 视频识别详情（包括截帧数和音频时长）
     *
     * @return
     */
    public VideoDetail getVideoDetail() {
        return videoDetail;
    }

    /**
     * set 视频识别详情（包括截帧数和音频时长）
     *
     * @param videoDetail
     */
    public void setVideoDetail(VideoDetail videoDetail) {
        this.videoDetail = videoDetail;
    }


    /**
     * set 语音反垃圾
     *
     * @param audio_antispam
     */
    public OssDataUnReview audio_antispam(Integer audio_antispam) {
        this.audio_antispam = audio_antispam;
        return this;
    }

    /**
     * set 文本反垃圾
     *
     * @param text_antispam
     */
    public OssDataUnReview text_antispam(Integer text_antispam) {
        this.text_antispam = text_antispam;
        return this;
    }

    /**
     * set 涉黄
     *
     * @param porn
     */
    public OssDataUnReview porn(Integer porn) {
        this.porn = porn;
        return this;
    }

    /**
     * set 涉政暴恐
     *
     * @param politics_terrorism
     */
    public OssDataUnReview politics_terrorism(Integer politics_terrorism) {
        this.politics_terrorism = politics_terrorism;
        return this;
    }

    /**
     * set 机器识别量
     *
     * @param recognization
     */
    public OssDataUnReview recognization(Integer recognization) {
        this.recognization = recognization;
        return this;
    }

    /**
     * set 正常量
     *
     * @param pass
     */
    public OssDataUnReview pass(Integer pass) {
        this.pass = pass;
        return this;
    }

    /**
     * set 违规内容量
     *
     * @param block
     */
    public OssDataUnReview block(Integer block) {
        this.block = block;
        return this;
    }

    /**
     * set 疑似内容量
     *
     * @param review
     */
    public OssDataUnReview review(Integer review) {
        this.review = review;
        return this;
    }

    /**
     * set 5xx状态码量
     *
     * @param status5xx
     */
    public OssDataUnReview status5xx(Integer status5xx) {
        this.status5xx = status5xx;
        return this;
    }

    /**
     * set 总的响应时间
     *
     * @param taskMsec
     */
    public OssDataUnReview taskMsec(Integer taskMsec) {
        this.taskMsec = taskMsec;
        return this;
    }

    /**
     * set blockDetail
     *
     * @param blockDetail
     */
    public OssDataUnReview blockDetail(BlockDetail blockDetail) {
        this.blockDetail = blockDetail;
        return this;
    }

    /**
     * set 音频识别详情
     *
     * @param audioDetail
     */
    public OssDataUnReview audioDetail(AudioDetail audioDetail) {
        this.audioDetail = audioDetail;
        return this;
    }

    /**
     * set 视频识别详情（包括截帧数和音频时长）
     *
     * @param videoDetail
     */
    public OssDataUnReview videoDetail(VideoDetail videoDetail) {
        this.videoDetail = videoDetail;
        return this;
    }


}