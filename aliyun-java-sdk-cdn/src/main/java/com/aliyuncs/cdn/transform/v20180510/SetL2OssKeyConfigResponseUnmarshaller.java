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

package com.aliyuncs.cdn.transform.v20180510;

import com.aliyuncs.cdn.model.v20180510.SetL2OssKeyConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetL2OssKeyConfigResponseUnmarshaller {

	public static SetL2OssKeyConfigResponse unmarshall(SetL2OssKeyConfigResponse setL2OssKeyConfigResponse, UnmarshallerContext _ctx) {
		
		setL2OssKeyConfigResponse.setRequestId(_ctx.stringValue("SetL2OssKeyConfigResponse.RequestId"));
	 
	 	return setL2OssKeyConfigResponse;
	}
}