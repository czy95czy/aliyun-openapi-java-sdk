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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindImagePackageRequest extends RpcAcsRequest<BindImagePackageResponse> {
	
	public BindImagePackageRequest() {
		super("Market", "2015-11-01", "BindImagePackage");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String ecsInstanceId;

	private String imagePackageInstanceId;

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
		if(ecsInstanceId != null){
			putQueryParameter("EcsInstanceId", ecsInstanceId);
		}
	}

	public String getImagePackageInstanceId() {
		return this.imagePackageInstanceId;
	}

	public void setImagePackageInstanceId(String imagePackageInstanceId) {
		this.imagePackageInstanceId = imagePackageInstanceId;
		if(imagePackageInstanceId != null){
			putQueryParameter("ImagePackageInstanceId", imagePackageInstanceId);
		}
	}

	@Override
	public Class<BindImagePackageResponse> getResponseClass() {
		return BindImagePackageResponse.class;
	}

}
