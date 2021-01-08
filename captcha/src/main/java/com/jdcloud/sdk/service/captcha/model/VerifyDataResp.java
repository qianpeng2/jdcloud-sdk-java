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

package com.jdcloud.sdk.service.captcha.model;


/**
 * verifyDataResp
 */
public class VerifyDataResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代号，0000:验证成功，0001:验证失败，0002:内部错误
     */
    private String code;

    /**
     * 会话id，验证失败后返回
     */
    private String sessionId;


    /**
     * get 代号，0000:验证成功，0001:验证失败，0002:内部错误
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 代号，0000:验证成功，0001:验证失败，0002:内部错误
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get 会话id，验证失败后返回
     *
     * @return
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * set 会话id，验证失败后返回
     *
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * set 代号，0000:验证成功，0001:验证失败，0002:内部错误
     *
     * @param code
     */
    public VerifyDataResp code(String code) {
        this.code = code;
        return this;
    }

    /**
     * set 会话id，验证失败后返回
     *
     * @param sessionId
     */
    public VerifyDataResp sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }


}