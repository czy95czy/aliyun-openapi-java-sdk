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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMasterSlaveVServerGroupRequest extends RpcAcsRequest<CreateMasterSlaveVServerGroupResponse> {
	
	public CreateMasterSlaveVServerGroupRequest() {
		super("Slb", "2014-05-15", "CreateMasterSlaveVServerGroup", "slb");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String access_key_id;

	private Long resourceOwnerId;

	private String masterSlaveBackendServers;

	private String loadBalancerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String masterSlaveVServerGroupName;

	private Long ownerId;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getMasterSlaveBackendServers() {
		return this.masterSlaveBackendServers;
	}

	public void setMasterSlaveBackendServers(String masterSlaveBackendServers) {
		this.masterSlaveBackendServers = masterSlaveBackendServers;
		if(masterSlaveBackendServers != null){
			putQueryParameter("MasterSlaveBackendServers", masterSlaveBackendServers);
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
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

	public String getMasterSlaveVServerGroupName() {
		return this.masterSlaveVServerGroupName;
	}

	public void setMasterSlaveVServerGroupName(String masterSlaveVServerGroupName) {
		this.masterSlaveVServerGroupName = masterSlaveVServerGroupName;
		if(masterSlaveVServerGroupName != null){
			putQueryParameter("MasterSlaveVServerGroupName", masterSlaveVServerGroupName);
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

	@Override
	public Class<CreateMasterSlaveVServerGroupResponse> getResponseClass() {
		return CreateMasterSlaveVServerGroupResponse.class;
	}

}
