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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScaleInApplicationRequest extends RoaAcsRequest<ScaleInApplicationResponse> {
	
	public ScaleInApplicationRequest() {
		super("Edas", "2017-08-01", "ScaleInApplication", "edas");
		setUriPattern("/pop/v5/changeorder/co_scale_in");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean forceStatus;

	private String appId;

	private String eccInfo;

	public Boolean getForceStatus() {
		return this.forceStatus;
	}

	public void setForceStatus(Boolean forceStatus) {
		this.forceStatus = forceStatus;
		if(forceStatus != null){
			putQueryParameter("ForceStatus", forceStatus.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getEccInfo() {
		return this.eccInfo;
	}

	public void setEccInfo(String eccInfo) {
		this.eccInfo = eccInfo;
		if(eccInfo != null){
			putQueryParameter("EccInfo", eccInfo);
		}
	}

	@Override
	public Class<ScaleInApplicationResponse> getResponseClass() {
		return ScaleInApplicationResponse.class;
	}

}
