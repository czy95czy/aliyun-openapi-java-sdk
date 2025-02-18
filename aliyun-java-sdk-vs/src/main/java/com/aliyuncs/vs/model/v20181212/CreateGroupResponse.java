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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.CreateGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateGroupResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String gbId;

	private String gbIp;

	private Long gbPort;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGbId() {
		return this.gbId;
	}

	public void setGbId(String gbId) {
		this.gbId = gbId;
	}

	public String getGbIp() {
		return this.gbIp;
	}

	public void setGbIp(String gbIp) {
		this.gbIp = gbIp;
	}

	public Long getGbPort() {
		return this.gbPort;
	}

	public void setGbPort(Long gbPort) {
		this.gbPort = gbPort;
	}

	@Override
	public CreateGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
