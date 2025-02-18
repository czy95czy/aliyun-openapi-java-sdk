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
import java.util.List;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InvokeDataAPIServiceRequest extends RpcAcsRequest<InvokeDataAPIServiceResponse> {
	
	public InvokeDataAPIServiceRequest() {
		super("Iot", "2018-01-20", "InvokeDataAPIService", "iot");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String apiSrn;

	private List<Param> params;

	public String getApiSrn() {
		return this.apiSrn;
	}

	public void setApiSrn(String apiSrn) {
		this.apiSrn = apiSrn;
		if(apiSrn != null){
			putQueryParameter("ApiSrn", apiSrn);
		}
	}

	public List<Param> getParams() {
		return this.params;
	}

	public void setParams(List<Param> params) {
		this.params = params;	
		if (params != null) {
			for (int depth1 = 0; depth1 < params.size(); depth1++) {
				putBodyParameter("Param." + (depth1 + 1) + ".ListParamType" , params.get(depth1).getListParamType());
				if (params.get(depth1).getListParamValues() != null) {
					for (int i = 0; i < params.get(depth1).getListParamValues().size(); i++) {
						putBodyParameter("Param." + (depth1 + 1) + ".ListParamValue." + (i + 1) , params.get(depth1).getListParamValues().get(i));
					}
				}
				putBodyParameter("Param." + (depth1 + 1) + ".ParamValue" , params.get(depth1).getParamValue());
				putBodyParameter("Param." + (depth1 + 1) + ".ParamName" , params.get(depth1).getParamName());
			}
		}	
	}

	public static class Param {

		private String listParamType;

		private List<String> listParamValues;

		private String paramValue;

		private String paramName;

		public String getListParamType() {
			return this.listParamType;
		}

		public void setListParamType(String listParamType) {
			this.listParamType = listParamType;
		}

		public List<String> getListParamValues() {
			return this.listParamValues;
		}

		public void setListParamValues(List<String> listParamValues) {
			this.listParamValues = listParamValues;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}

		public String getParamName() {
			return this.paramName;
		}

		public void setParamName(String paramName) {
			this.paramName = paramName;
		}
	}

	@Override
	public Class<InvokeDataAPIServiceResponse> getResponseClass() {
		return InvokeDataAPIServiceResponse.class;
	}

}
