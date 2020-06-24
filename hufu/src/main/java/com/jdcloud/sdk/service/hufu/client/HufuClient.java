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
 * 云鼎虎符 openapi
 * 云鼎虎符 openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.hufu.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.hufu.model.EncryptRequest;
import com.jdcloud.sdk.service.hufu.model.EncryptResponse;
import com.jdcloud.sdk.service.hufu.client.EncryptExecutor;
import com.jdcloud.sdk.service.hufu.model.DescribeDeploymentRequest;
import com.jdcloud.sdk.service.hufu.model.DescribeDeploymentResponse;
import com.jdcloud.sdk.service.hufu.client.DescribeDeploymentExecutor;
import com.jdcloud.sdk.service.hufu.model.QueryAccessLogRequest;
import com.jdcloud.sdk.service.hufu.model.QueryAccessLogResponse;
import com.jdcloud.sdk.service.hufu.client.QueryAccessLogExecutor;
import com.jdcloud.sdk.service.hufu.model.DeployRequest;
import com.jdcloud.sdk.service.hufu.model.DeployResponse;
import com.jdcloud.sdk.service.hufu.client.DeployExecutor;
import com.jdcloud.sdk.service.hufu.model.IsEncryptDataRequest;
import com.jdcloud.sdk.service.hufu.model.IsEncryptDataResponse;
import com.jdcloud.sdk.service.hufu.client.IsEncryptDataExecutor;

/**
 * hufuClient
 */
public class HufuClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "hufu.jdcloud-api.com";
    public final static String ServiceName = "hufu";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private HufuClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 加密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EncryptResponse encrypt(EncryptRequest request) throws JdcloudSdkException {
        return new EncryptExecutor().client(this).execute(request);
    }

    /**
     * 查询该版本的部署详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeploymentResponse describeDeployment(DescribeDeploymentRequest request) throws JdcloudSdkException {
        return new DescribeDeploymentExecutor().client(this).execute(request);
    }

    /**
     * 查询access日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryAccessLogResponse queryAccessLog(QueryAccessLogRequest request) throws JdcloudSdkException {
        return new QueryAccessLogExecutor().client(this).execute(request);
    }

    /**
     * 发布版本
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeployResponse deploy(DeployRequest request) throws JdcloudSdkException {
        return new DeployExecutor().client(this).execute(request);
    }

    /**
     * 加密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public IsEncryptDataResponse isEncryptData(IsEncryptDataRequest request) throws JdcloudSdkException {
        return new IsEncryptDataExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public HufuClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private HufuClient hufuClient;

        public DefaultBuilder() {
            hufuClient = new HufuClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            hufuClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            hufuClient.httpRequestConfig = config;
            return this;
        }

        public HufuClient build() throws JdcloudSdkException {

            if (hufuClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                hufuClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (hufuClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("HufuClient build error: jdcloud credentials provider not set");
                }
            }
            if (hufuClient.httpRequestConfig == null) {
                hufuClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (hufuClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("HufuClient build error: http request config not set");
                }
            }
            return hufuClient;
        }

        public Builder environment(Environment environment) {
            hufuClient.environment = environment;
            return this;
        }
    }
}
