/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class EnableOrderRequest extends RpcAcsRequest<EnableOrderResponse> {
	
	public EnableOrderRequest() {
		super("linkedmall", "2018-01-16", "EnableOrder", "linkedmall");
	}

	private String lmOrderId;

	private String bizUid;

	private String extJson;

	private String bizId;

	private String outTradeId;

	public String getLmOrderId() {
		return this.lmOrderId;
	}

	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
		if(lmOrderId != null){
			putQueryParameter("LmOrderId", lmOrderId);
		}
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public String getExtJson() {
		return this.extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
		if(extJson != null){
			putQueryParameter("ExtJson", extJson);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getOutTradeId() {
		return this.outTradeId;
	}

	public void setOutTradeId(String outTradeId) {
		this.outTradeId = outTradeId;
		if(outTradeId != null){
			putQueryParameter("OutTradeId", outTradeId);
		}
	}

	@Override
	public Class<EnableOrderResponse> getResponseClass() {
		return EnableOrderResponse.class;
	}

}
