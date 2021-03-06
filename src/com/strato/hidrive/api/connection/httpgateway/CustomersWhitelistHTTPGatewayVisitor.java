
/**
* Copyright 2014 STRATO AG
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
package com.strato.hidrive.api.connection.httpgateway;

import com.strato.hidrive.api.connection.httpgateway.interfaces.HTTPGatewayVisitor;


public class CustomersWhitelistHTTPGatewayVisitor extends DefaultHTTPGatewayVisitor implements HTTPGatewayVisitor{
	public CustomersWhitelistHTTPGatewayVisitor(){
		super();
	}
	
	protected String getUrl() {
		return "https://www.hidrive.strato.com/apps/";
	}
}
