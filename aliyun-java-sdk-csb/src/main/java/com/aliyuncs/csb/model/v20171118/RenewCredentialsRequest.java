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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.csb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RenewCredentialsRequest extends RpcAcsRequest<RenewCredentialsResponse> {
	
	public RenewCredentialsRequest() {
		super("CSB", "2017-11-18", "RenewCredentials");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long credentialId;

	public Long getCredentialId() {
		return this.credentialId;
	}

	public void setCredentialId(Long credentialId) {
		this.credentialId = credentialId;
		if(credentialId != null){
			putQueryParameter("CredentialId", credentialId.toString());
		}
	}

	@Override
	public Class<RenewCredentialsResponse> getResponseClass() {
		return RenewCredentialsResponse.class;
	}

}
