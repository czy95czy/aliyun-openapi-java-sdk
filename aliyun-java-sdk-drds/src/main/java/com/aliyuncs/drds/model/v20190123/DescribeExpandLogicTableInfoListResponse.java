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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeExpandLogicTableInfoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpandLogicTableInfoListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String tableName;

		private String shardDbKey;

		private String shardTbKey;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getShardDbKey() {
			return this.shardDbKey;
		}

		public void setShardDbKey(String shardDbKey) {
			this.shardDbKey = shardDbKey;
		}

		public String getShardTbKey() {
			return this.shardTbKey;
		}

		public void setShardTbKey(String shardTbKey) {
			this.shardTbKey = shardTbKey;
		}
	}

	@Override
	public DescribeExpandLogicTableInfoListResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpandLogicTableInfoListResponseUnmarshaller.unmarshall(this, context);
	}
}
