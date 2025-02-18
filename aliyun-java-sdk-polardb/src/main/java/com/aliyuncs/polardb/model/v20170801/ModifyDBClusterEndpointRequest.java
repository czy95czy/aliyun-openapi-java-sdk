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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterEndpointRequest extends RpcAcsRequest<ModifyDBClusterEndpointResponse> {
	
	public ModifyDBClusterEndpointRequest() {
		super("polardb", "2017-08-01", "ModifyDBClusterEndpoint", "polardb");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String autoAddNewNodes;

	private Long resourceOwnerId;

	private String nodes;

	private String readWriteMode;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String dBEndpointId;

	private String endpointConfig;

	private Long ownerId;

	public String getAutoAddNewNodes() {
		return this.autoAddNewNodes;
	}

	public void setAutoAddNewNodes(String autoAddNewNodes) {
		this.autoAddNewNodes = autoAddNewNodes;
		if(autoAddNewNodes != null){
			putQueryParameter("AutoAddNewNodes", autoAddNewNodes);
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

	public String getNodes() {
		return this.nodes;
	}

	public void setNodes(String nodes) {
		this.nodes = nodes;
		if(nodes != null){
			putQueryParameter("Nodes", nodes);
		}
	}

	public String getReadWriteMode() {
		return this.readWriteMode;
	}

	public void setReadWriteMode(String readWriteMode) {
		this.readWriteMode = readWriteMode;
		if(readWriteMode != null){
			putQueryParameter("ReadWriteMode", readWriteMode);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getDBEndpointId() {
		return this.dBEndpointId;
	}

	public void setDBEndpointId(String dBEndpointId) {
		this.dBEndpointId = dBEndpointId;
		if(dBEndpointId != null){
			putQueryParameter("DBEndpointId", dBEndpointId);
		}
	}

	public String getEndpointConfig() {
		return this.endpointConfig;
	}

	public void setEndpointConfig(String endpointConfig) {
		this.endpointConfig = endpointConfig;
		if(endpointConfig != null){
			putQueryParameter("EndpointConfig", endpointConfig);
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
	public Class<ModifyDBClusterEndpointResponse> getResponseClass() {
		return ModifyDBClusterEndpointResponse.class;
	}

}
