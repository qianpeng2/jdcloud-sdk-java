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
 * Anti DDos Pro Web Rule Configuration APIs
 * Anti DDos Pro Web Rule Configuration APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.ipanti.model.DeleteJsPageOfWebRuleResponse;

/**
 * 删除网站类规则允许插入 JS 指纹的页面。支持批量操作, 批量操作时 jsPageId 传多个, 以 &#39;,&#39; 分隔
 */
class DeleteJsPageOfWebRuleExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "DELETE";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}/jsPages/{jsPageId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DeleteJsPageOfWebRuleResponse.class;
    }
}
