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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryBatchRegisterDeviceStatusRequest extends RpcAcsRequest<QueryBatchRegisterDeviceStatusResponse> {
	
	public QueryBatchRegisterDeviceStatusRequest() {
		super("Iot", "2018-01-20", "QueryBatchRegisterDeviceStatus", "iot");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long applyId;

	private String iotInstanceId;

	private String productKey;

	public Long getApplyId() {
		return this.applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
		if(applyId != null){
			putQueryParameter("ApplyId", applyId.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	@Override
	public Class<QueryBatchRegisterDeviceStatusResponse> getResponseClass() {
		return QueryBatchRegisterDeviceStatusResponse.class;
	}

}
