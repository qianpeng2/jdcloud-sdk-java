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

package com.jdcloud.sdk.service.asset.model;


/**
 * withdrawAmountVo
 */
public class WithdrawAmountVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 提现金额
     */
    private String amount;


    /**
     * get 提现金额
     *
     * @return
     */
    public String getAmount() {
        return amount;
    }

    /**
     * set 提现金额
     *
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * set 提现金额
     *
     * @param amount
     */
    public WithdrawAmountVo amount(String amount) {
        this.amount = amount;
        return this;
    }


}