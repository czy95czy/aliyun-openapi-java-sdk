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
public class UpdateEdgeInstanceRequest extends RpcAcsRequest<UpdateEdgeInstanceResponse> {
	
	public UpdateEdgeInstanceRequest() {
		super("Iot", "2018-01-20", "UpdateEdgeInstance", "iot");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String instanceId;

	private String iotInstanceId;

	private String name;

	private Boolean bizEnable;

	private Integer spec;

	private String tags;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Boolean getBizEnable() {
		return this.bizEnable;
	}

	public void setBizEnable(Boolean bizEnable) {
		this.bizEnable = bizEnable;
		if(bizEnable != null){
			putQueryParameter("BizEnable", bizEnable.toString());
		}
	}

	public Integer getSpec() {
		return this.spec;
	}

	public void setSpec(Integer spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec.toString());
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	@Override
	public Class<UpdateEdgeInstanceResponse> getResponseClass() {
		return UpdateEdgeInstanceResponse.class;
	}

}
