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
import com.aliyuncs.csb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FindServiceListRequest extends RpcAcsRequest<FindServiceListResponse> {
	
	public FindServiceListRequest() {
		super("CSB", "2017-11-18", "FindServiceList");
		setProtocol(ProtocolType.HTTPS);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String projectName;

	private Boolean showDelService;

	private Integer casShowType;

	private Long csbId;

	private String alias;

	private String serviceName;

	private Integer pageNum;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Boolean getShowDelService() {
		return this.showDelService;
	}

	public void setShowDelService(Boolean showDelService) {
		this.showDelService = showDelService;
		if(showDelService != null){
			putQueryParameter("ShowDelService", showDelService.toString());
		}
	}

	public Integer getCasShowType() {
		return this.casShowType;
	}

	public void setCasShowType(Integer casShowType) {
		this.casShowType = casShowType;
		if(casShowType != null){
			putQueryParameter("CasShowType", casShowType.toString());
		}
	}

	public Long getCsbId() {
		return this.csbId;
	}

	public void setCsbId(Long csbId) {
		this.csbId = csbId;
		if(csbId != null){
			putQueryParameter("CsbId", csbId.toString());
		}
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putQueryParameter("Alias", alias);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	@Override
	public Class<FindServiceListResponse> getResponseClass() {
		return FindServiceListResponse.class;
	}

}
