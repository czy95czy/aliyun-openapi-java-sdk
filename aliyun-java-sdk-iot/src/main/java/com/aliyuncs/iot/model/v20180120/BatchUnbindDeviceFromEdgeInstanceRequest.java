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
import java.util.List;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchUnbindDeviceFromEdgeInstanceRequest extends RpcAcsRequest<BatchUnbindDeviceFromEdgeInstanceResponse> {
	
	public BatchUnbindDeviceFromEdgeInstanceRequest() {
		super("Iot", "2018-01-20", "BatchUnbindDeviceFromEdgeInstance", "iot");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String instanceId;

	private List<String> iotIdss;

	private String iotInstanceId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getIotIdss() {
		return this.iotIdss;
	}

	public void setIotIdss(List<String> iotIdss) {
		this.iotIdss = iotIdss;	
		if (iotIdss != null) {
			for (int i = 0; i < iotIdss.size(); i++) {
				putQueryParameter("IotIds." + (i + 1) , iotIdss.get(i));
			}
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

	@Override
	public Class<BatchUnbindDeviceFromEdgeInstanceResponse> getResponseClass() {
		return BatchUnbindDeviceFromEdgeInstanceResponse.class;
	}

}
