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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRuleRequest extends RpcAcsRequest<CreateRuleResponse> {
	
	public CreateRuleRequest() {
		super("Iot", "2018-01-20", "CreateRule", "iot");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String select;

	private String ruleDesc;

	private String dataType;

	private String iotInstanceId;

	private String name;

	private String where;

	private String productKey;

	private Integer topicType;

	private String shortTopic;

	public String getSelect() {
		return this.select;
	}

	public void setSelect(String select) {
		this.select = select;
		if(select != null){
			putQueryParameter("Select", select);
		}
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
		if(ruleDesc != null){
			putQueryParameter("RuleDesc", ruleDesc);
		}
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getWhere() {
		return this.where;
	}

	public void setWhere(String where) {
		this.where = where;
		if(where != null){
			putQueryParameter("Where", where);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Integer getTopicType() {
		return this.topicType;
	}

	public void setTopicType(Integer topicType) {
		this.topicType = topicType;
		if(topicType != null){
			putQueryParameter("TopicType", topicType.toString());
		}
	}

	public String getShortTopic() {
		return this.shortTopic;
	}

	public void setShortTopic(String shortTopic) {
		this.shortTopic = shortTopic;
		if(shortTopic != null){
			putQueryParameter("ShortTopic", shortTopic);
		}
	}

	@Override
	public Class<CreateRuleResponse> getResponseClass() {
		return CreateRuleResponse.class;
	}

}
