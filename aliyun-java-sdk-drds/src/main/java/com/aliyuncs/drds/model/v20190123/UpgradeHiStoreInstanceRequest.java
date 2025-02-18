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
public class UpgradeHiStoreInstanceRequest extends RpcAcsRequest<UpgradeHiStoreInstanceResponse> {
	
	public UpgradeHiStoreInstanceRequest() {
		super("Drds", "2019-01-23", "UpgradeHiStoreInstance", "drds");
	}

	private String historeInstanceId;

	private String drdsInstanceId;

	public String getHistoreInstanceId() {
		return this.historeInstanceId;
	}

	public void setHistoreInstanceId(String historeInstanceId) {
		this.historeInstanceId = historeInstanceId;
		if(historeInstanceId != null){
			putQueryParameter("HistoreInstanceId", historeInstanceId);
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
	public Class<UpgradeHiStoreInstanceResponse> getResponseClass() {
		return UpgradeHiStoreInstanceResponse.class;
	}

}
