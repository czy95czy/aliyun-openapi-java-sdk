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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SetupTableRequest extends RpcAcsRequest<SetupTableResponse> {
	
	public SetupTableRequest() {
		super("Drds", "2019-01-23", "SetupTable", "drds");
	}

	private String dbName;

	private Boolean allowFullTableScan;

	private List<String> tableNames;

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

	public Boolean getAllowFullTableScan() {
		return this.allowFullTableScan;
	}

	public void setAllowFullTableScan(Boolean allowFullTableScan) {
		this.allowFullTableScan = allowFullTableScan;
		if(allowFullTableScan != null){
			putQueryParameter("AllowFullTableScan", allowFullTableScan.toString());
		}
	}

	public List<String> getTableNames() {
		return this.tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;	
		if (tableNames != null) {
			for (int i = 0; i < tableNames.size(); i++) {
				putQueryParameter("TableName." + (i + 1) , tableNames.get(i));
			}
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
	public Class<SetupTableResponse> getResponseClass() {
		return SetupTableResponse.class;
	}

}
