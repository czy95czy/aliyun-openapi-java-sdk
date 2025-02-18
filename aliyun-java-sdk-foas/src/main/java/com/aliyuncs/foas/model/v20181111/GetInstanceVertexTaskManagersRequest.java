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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceVertexTaskManagersRequest extends RoaAcsRequest<GetInstanceVertexTaskManagersResponse> {
	
	public GetInstanceVertexTaskManagersRequest() {
		super("foas", "2018-11-11", "GetInstanceVertexTaskManagers", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/projects/[projectName]/jobs/[jobName]/instances/[instanceId]/vertices/[vertexId]/taskmanagers");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String projectName;

	private Long instanceId;

	private String vertexId;

	private String jobName;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putPathParameter("projectName", projectName);
		}
	}

	public Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId.toString());
		}
	}

	public String getVertexId() {
		return this.vertexId;
	}

	public void setVertexId(String vertexId) {
		this.vertexId = vertexId;
		if(vertexId != null){
			putPathParameter("vertexId", vertexId);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putPathParameter("jobName", jobName);
		}
	}

	@Override
	public Class<GetInstanceVertexTaskManagersResponse> getResponseClass() {
		return GetInstanceVertexTaskManagersResponse.class;
	}

}
