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
 * JDCLOUD asset API
 * 资金账户相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.asset.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.asset.model.DescribeAccountAmountRequest;
import com.jdcloud.sdk.service.asset.model.DescribeAccountAmountResponse;
import com.jdcloud.sdk.service.asset.client.DescribeAccountAmountExecutor;
import com.jdcloud.sdk.service.asset.model.ModifyBalanceWarningInfoRequest;
import com.jdcloud.sdk.service.asset.model.ModifyBalanceWarningInfoResponse;
import com.jdcloud.sdk.service.asset.client.ModifyBalanceWarningInfoExecutor;

/**
 * assetClient
 */
public class AssetClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "asset.jdcloud-api.com";
    public final static String ServiceName = "asset";
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

    private AssetClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询账户金额（总金额、可用金额、冻结金额、可提现金额、提现中金额）
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAccountAmountResponse describeAccountAmount(DescribeAccountAmountRequest request) throws JdcloudSdkException {
        return new DescribeAccountAmountExecutor().client(this).execute(request);
    }

    /**
     * 设置余额预警信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyBalanceWarningInfoResponse modifyBalanceWarningInfo(ModifyBalanceWarningInfoRequest request) throws JdcloudSdkException {
        return new ModifyBalanceWarningInfoExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public AssetClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private AssetClient assetClient;

        public DefaultBuilder() {
            assetClient = new AssetClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            assetClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            assetClient.httpRequestConfig = config;
            return this;
        }

        public AssetClient build() throws JdcloudSdkException {

            if (assetClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                assetClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (assetClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("AssetClient build error: jdcloud credentials provider not set");
                }
            }
            if (assetClient.httpRequestConfig == null) {
                assetClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (assetClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("AssetClient build error: http request config not set");
                }
            }
            return assetClient;
        }

        public Builder environment(Environment environment) {
            assetClient.environment = environment;
            return this;
        }
    }
}
