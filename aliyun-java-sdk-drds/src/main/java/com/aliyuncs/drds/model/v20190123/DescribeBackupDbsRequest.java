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
public class DescribeBackupDbsRequest extends RpcAcsRequest<DescribeBackupDbsResponse> {
	
	public DescribeBackupDbsRequest() {
		super("Drds", "2019-01-23", "DescribeBackupDbs", "drds");
	}

	private String preferredRestoreTime;

	private String backupId;

	private String drdsInstanceId;

	public String getPreferredRestoreTime() {
		return this.preferredRestoreTime;
	}

	public void setPreferredRestoreTime(String preferredRestoreTime) {
		this.preferredRestoreTime = preferredRestoreTime;
		if(preferredRestoreTime != null){
			putQueryParameter("PreferredRestoreTime", preferredRestoreTime);
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
	public Class<DescribeBackupDbsResponse> getResponseClass() {
		return DescribeBackupDbsResponse.class;
	}

}
