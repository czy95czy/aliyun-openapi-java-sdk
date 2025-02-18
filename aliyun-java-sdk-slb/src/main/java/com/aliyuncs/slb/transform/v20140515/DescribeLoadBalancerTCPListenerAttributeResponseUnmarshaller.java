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

package com.aliyuncs.slb.transform.v20140515;

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancerTCPListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller {

	public static DescribeLoadBalancerTCPListenerAttributeResponse unmarshall(DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerTCPListenerAttributeResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.RequestId"));
		describeLoadBalancerTCPListenerAttributeResponse.setListenerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.ListenerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setBackendServerPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.BackendServerPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setStatus(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Status"));
		describeLoadBalancerTCPListenerAttributeResponse.setBandwidth(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.Bandwidth"));
		describeLoadBalancerTCPListenerAttributeResponse.setScheduler(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Scheduler"));
		describeLoadBalancerTCPListenerAttributeResponse.setSynProxy(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.SynProxy"));
		describeLoadBalancerTCPListenerAttributeResponse.setPersistenceTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.PersistenceTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setEstablishedTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.EstablishedTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheck(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheck"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.UnhealthyThreshold"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectTimeout(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectTimeout"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckConnectPort"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckInterval(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckInterval"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckHttpCode(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckHttpCode"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckDomain(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckDomain"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckURI(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckURI"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckType(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckType"));
		describeLoadBalancerTCPListenerAttributeResponse.setHealthCheckMethod(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.HealthCheckMethod"));
		describeLoadBalancerTCPListenerAttributeResponse.setMaxConnection(_ctx.integerValue("DescribeLoadBalancerTCPListenerAttributeResponse.MaxConnection"));
		describeLoadBalancerTCPListenerAttributeResponse.setVServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.MasterSlaveServerGroupId"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclId(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclId"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclType(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclType"));
		describeLoadBalancerTCPListenerAttributeResponse.setAclStatus(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.AclStatus"));
		describeLoadBalancerTCPListenerAttributeResponse.setVpcIds(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.VpcIds"));
		describeLoadBalancerTCPListenerAttributeResponse.setDescription(_ctx.stringValue("DescribeLoadBalancerTCPListenerAttributeResponse.Description"));
	 
	 	return describeLoadBalancerTCPListenerAttributeResponse;
	}
}