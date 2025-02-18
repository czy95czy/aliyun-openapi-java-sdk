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

import com.aliyuncs.vs.model.v20181212.DescribeTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplateResponseUnmarshaller {

	public static DescribeTemplateResponse unmarshall(DescribeTemplateResponse describeTemplateResponse, UnmarshallerContext _ctx) {
		
		describeTemplateResponse.setRequestId(_ctx.stringValue("DescribeTemplateResponse.RequestId"));
		describeTemplateResponse.setId(_ctx.stringValue("DescribeTemplateResponse.Id"));
		describeTemplateResponse.setName(_ctx.stringValue("DescribeTemplateResponse.Name"));
		describeTemplateResponse.setDescription(_ctx.stringValue("DescribeTemplateResponse.Description"));
		describeTemplateResponse.setType(_ctx.stringValue("DescribeTemplateResponse.Type"));
		describeTemplateResponse.setRegion(_ctx.stringValue("DescribeTemplateResponse.Region"));
		describeTemplateResponse.setOssBucket(_ctx.stringValue("DescribeTemplateResponse.OssBucket"));
		describeTemplateResponse.setOssEndpoint(_ctx.stringValue("DescribeTemplateResponse.OssEndpoint"));
		describeTemplateResponse.setOssFilePrefix(_ctx.stringValue("DescribeTemplateResponse.OssFilePrefix"));
		describeTemplateResponse.setStartTime(_ctx.stringValue("DescribeTemplateResponse.StartTime"));
		describeTemplateResponse.setEndTime(_ctx.stringValue("DescribeTemplateResponse.EndTime"));
		describeTemplateResponse.setInterval(_ctx.longValue("DescribeTemplateResponse.Interval"));
		describeTemplateResponse.setFileFormat(_ctx.stringValue("DescribeTemplateResponse.FileFormat"));
		describeTemplateResponse.setJpgOverwrite(_ctx.stringValue("DescribeTemplateResponse.JpgOverwrite"));
		describeTemplateResponse.setJpgSequence(_ctx.stringValue("DescribeTemplateResponse.JpgSequence"));
		describeTemplateResponse.setMp4(_ctx.stringValue("DescribeTemplateResponse.Mp4"));
		describeTemplateResponse.setFlv(_ctx.stringValue("DescribeTemplateResponse.Flv"));
		describeTemplateResponse.setHlsM3u8(_ctx.stringValue("DescribeTemplateResponse.HlsM3u8"));
		describeTemplateResponse.setHlsTs(_ctx.stringValue("DescribeTemplateResponse.HlsTs"));
		describeTemplateResponse.setCallback(_ctx.stringValue("DescribeTemplateResponse.Callback"));
		describeTemplateResponse.setCreatedTime(_ctx.stringValue("DescribeTemplateResponse.CreatedTime"));
	 
	 	return describeTemplateResponse;
	}
}