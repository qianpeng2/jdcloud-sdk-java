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

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;

/**
 * routeTable
 */
public class RouteTable  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由表ID
     */
    private String routeTableId;

    /**
     * 地域
     */
    private String region;

    /**
     * 私有网络ID
     */
    private String vpcId;

    /**
     * 名称
     */
    private String name;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 路由规则
     */
    private List<Route> routes;


    /**
     * get 路由表ID
     *
     * @return
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * set 路由表ID
     *
     * @param routeTableId
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 路由规则
     *
     * @return
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * set 路由规则
     *
     * @param routes
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }


    /**
     * set 路由表ID
     *
     * @param routeTableId
     */
    public RouteTable routeTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public RouteTable region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public RouteTable vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public RouteTable name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public RouteTable createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 路由规则
     *
     * @param routes
     */
    public RouteTable routes(List<Route> routes) {
        this.routes = routes;
        return this;
    }


    /**
     * add item to 路由规则
     *
     * @param route
     */
    public void addRoute(Route route) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(route);
    }

}