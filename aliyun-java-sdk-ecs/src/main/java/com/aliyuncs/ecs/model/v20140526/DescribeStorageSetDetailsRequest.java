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
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeStorageSetDetailsRequest extends RpcAcsRequest<DescribeStorageSetDetailsResponse> {
	
	public DescribeStorageSetDetailsRequest() {
		super("Ecs", "2014-05-26", "DescribeStorageSetDetails", "ecs");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String clientToken;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer storageSetPartitionNumber;

	private String diskIds;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String storageSetId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Integer getStorageSetPartitionNumber() {
		return this.storageSetPartitionNumber;
	}

	public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
		this.storageSetPartitionNumber = storageSetPartitionNumber;
		if(storageSetPartitionNumber != null){
			putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber.toString());
		}
	}

	public String getDiskIds() {
		return this.diskIds;
	}

	public void setDiskIds(String diskIds) {
		this.diskIds = diskIds;
		if(diskIds != null){
			putQueryParameter("DiskIds", diskIds);
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

	public String getStorageSetId() {
		return this.storageSetId;
	}

	public void setStorageSetId(String storageSetId) {
		this.storageSetId = storageSetId;
		if(storageSetId != null){
			putQueryParameter("StorageSetId", storageSetId);
		}
	}

	@Override
	public Class<DescribeStorageSetDetailsResponse> getResponseClass() {
		return DescribeStorageSetDetailsResponse.class;
	}

}
