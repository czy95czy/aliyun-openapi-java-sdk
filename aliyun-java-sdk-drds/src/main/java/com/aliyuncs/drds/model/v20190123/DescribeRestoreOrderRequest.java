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
public class DescribeRestoreOrderRequest extends RpcAcsRequest<DescribeRestoreOrderResponse> {
	
	public DescribeRestoreOrderRequest() {
		super("Drds", "2019-01-23", "DescribeRestoreOrder", "drds");
	}

	private String preferredBackupTime;

	private String backupDbNames;

	private String backupId;

	private String backupMode;

	private String backupLevel;

	private String drdsInstanceId;

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
		if(preferredBackupTime != null){
			putQueryParameter("PreferredBackupTime", preferredBackupTime);
		}
	}

	public String getBackupDbNames() {
		return this.backupDbNames;
	}

	public void setBackupDbNames(String backupDbNames) {
		this.backupDbNames = backupDbNames;
		if(backupDbNames != null){
			putQueryParameter("BackupDbNames", backupDbNames);
		}
	}

	public String getBackupId() {
		return this.backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId);
		}
	}

	public String getBackupMode() {
		return this.backupMode;
	}

	public void setBackupMode(String backupMode) {
		this.backupMode = backupMode;
		if(backupMode != null){
			putQueryParameter("BackupMode", backupMode);
		}
	}

	public String getBackupLevel() {
		return this.backupLevel;
	}

	public void setBackupLevel(String backupLevel) {
		this.backupLevel = backupLevel;
		if(backupLevel != null){
			putQueryParameter("BackupLevel", backupLevel);
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
	public Class<DescribeRestoreOrderResponse> getResponseClass() {
		return DescribeRestoreOrderResponse.class;
	}

}
