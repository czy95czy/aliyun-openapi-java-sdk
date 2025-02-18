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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DatalinkReplicationPrecheckRequest extends RpcAcsRequest<DatalinkReplicationPrecheckResponse> {
	
	public DatalinkReplicationPrecheckRequest() {
		super("Drds", "2019-01-23", "DatalinkReplicationPrecheck", "drds");
	}

	private String dbName;

	private String srcTableName;

	private String dstTableName;

	private String drdsInstanceId;

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getSrcTableName() {
		return this.srcTableName;
	}

	public void setSrcTableName(String srcTableName) {
		this.srcTableName = srcTableName;
		if(srcTableName != null){
			putQueryParameter("SrcTableName", srcTableName);
		}
	}

	public String getDstTableName() {
		return this.dstTableName;
	}

	public void setDstTableName(String dstTableName) {
		this.dstTableName = dstTableName;
		if(dstTableName != null){
			putQueryParameter("DstTableName", dstTableName);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	@Override
	public Class<DatalinkReplicationPrecheckResponse> getResponseClass() {
		return DatalinkReplicationPrecheckResponse.class;
	}

}
