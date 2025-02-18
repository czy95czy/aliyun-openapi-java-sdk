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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoProvisioningGroupsRequest extends RpcAcsRequest<DescribeAutoProvisioningGroupsResponse> {
	
	public DescribeAutoProvisioningGroupsRequest() {
		super("Ecs", "2014-05-26", "DescribeAutoProvisioningGroups", "ecs");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private List<String> autoProvisioningGroupStatuss;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> autoProvisioningGroupIds;

	private String autoProvisioningGroupName;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getAutoProvisioningGroupStatuss() {
		return this.autoProvisioningGroupStatuss;
	}

	public void setAutoProvisioningGroupStatuss(List<String> autoProvisioningGroupStatuss) {
		this.autoProvisioningGroupStatuss = autoProvisioningGroupStatuss;	
		if (autoProvisioningGroupStatuss != null) {
			for (int i = 0; i < autoProvisioningGroupStatuss.size(); i++) {
				putQueryParameter("AutoProvisioningGroupStatus." + (i + 1) , autoProvisioningGroupStatuss.get(i));
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getAutoProvisioningGroupIds() {
		return this.autoProvisioningGroupIds;
	}

	public void setAutoProvisioningGroupIds(List<String> autoProvisioningGroupIds) {
		this.autoProvisioningGroupIds = autoProvisioningGroupIds;	
		if (autoProvisioningGroupIds != null) {
			for (int i = 0; i < autoProvisioningGroupIds.size(); i++) {
				putQueryParameter("AutoProvisioningGroupId." + (i + 1) , autoProvisioningGroupIds.get(i));
			}
		}	
	}

	public String getAutoProvisioningGroupName() {
		return this.autoProvisioningGroupName;
	}

	public void setAutoProvisioningGroupName(String autoProvisioningGroupName) {
		this.autoProvisioningGroupName = autoProvisioningGroupName;
		if(autoProvisioningGroupName != null){
			putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
		}
	}

	@Override
	public Class<DescribeAutoProvisioningGroupsResponse> getResponseClass() {
		return DescribeAutoProvisioningGroupsResponse.class;
	}

}
