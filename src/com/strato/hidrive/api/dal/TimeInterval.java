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
package com.strato.hidrive.api.dal;

public class TimeInterval {
	private int value;
	private String intervalName;


	public TimeInterval(String timeInterval) {
		super();

		if(timeInterval.equalsIgnoreCase("d")){
			this.value = 365;
		}else {
			try{
				this.value = Integer.valueOf(timeInterval.replace("d", ""));
			}
			catch(NumberFormatException exeption){
				this.value = 0;
			}
	    }
		this.intervalName = "d";
	
	}


	public int getValue() {
		return value;
	}


	public String getIntervalName() {
		return intervalName;
	}
}
