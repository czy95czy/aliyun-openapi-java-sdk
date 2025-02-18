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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeGroupResponse;
import com.aliyuncs.vs.model.v20181212.DescribeGroupResponse.Stats;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupResponseUnmarshaller {

	public static DescribeGroupResponse unmarshall(DescribeGroupResponse describeGroupResponse, UnmarshallerContext _ctx) {
		
		describeGroupResponse.setRequestId(_ctx.stringValue("DescribeGroupResponse.RequestId"));
		describeGroupResponse.setId(_ctx.stringValue("DescribeGroupResponse.Id"));
		describeGroupResponse.setName(_ctx.stringValue("DescribeGroupResponse.Name"));
		describeGroupResponse.setDescription(_ctx.stringValue("DescribeGroupResponse.Description"));
		describeGroupResponse.setApp(_ctx.stringValue("DescribeGroupResponse.App"));
		describeGroupResponse.setRegion(_ctx.stringValue("DescribeGroupResponse.Region"));
		describeGroupResponse.setInProtocol(_ctx.stringValue("DescribeGroupResponse.InProtocol"));
		describeGroupResponse.setOutProtocol(_ctx.stringValue("DescribeGroupResponse.OutProtocol"));
		describeGroupResponse.setEnabled(_ctx.booleanValue("DescribeGroupResponse.Enabled"));
		describeGroupResponse.setStatus(_ctx.stringValue("DescribeGroupResponse.Status"));
		describeGroupResponse.setCreatedTime(_ctx.stringValue("DescribeGroupResponse.CreatedTime"));
		describeGroupResponse.setPushDomain(_ctx.stringValue("DescribeGroupResponse.PushDomain"));
		describeGroupResponse.setPlayDomain(_ctx.stringValue("DescribeGroupResponse.PlayDomain"));
		describeGroupResponse.setGbId(_ctx.stringValue("DescribeGroupResponse.GbId"));
		describeGroupResponse.setGbIp(_ctx.stringValue("DescribeGroupResponse.GbIp"));
		describeGroupResponse.setGbPort(_ctx.longValue("DescribeGroupResponse.GbPort"));
		describeGroupResponse.setGbUdpPort(_ctx.longValue("DescribeGroupResponse.GbUdpPort"));
		describeGroupResponse.setGbTcpPort(_ctx.longValue("DescribeGroupResponse.GbTcpPort"));

		Stats stats = new Stats();
		stats.setDeviceNum(_ctx.longValue("DescribeGroupResponse.Stats.DeviceNum"));
		stats.setIedNum(_ctx.longValue("DescribeGroupResponse.Stats.IedNum"));
		stats.setIpcNum(_ctx.longValue("DescribeGroupResponse.Stats.IpcNum"));
		stats.setPlatformNum(_ctx.longValue("DescribeGroupResponse.Stats.PlatformNum"));
		describeGroupResponse.setStats(stats);
	 
	 	return describeGroupResponse;
	}
}