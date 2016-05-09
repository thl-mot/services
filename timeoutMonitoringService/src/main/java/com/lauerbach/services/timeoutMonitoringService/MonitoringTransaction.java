package com.lauerbach.services.timeoutMonitoringService;
/**
 * Copyright 2016 Thomas Lauerbach
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
import java.io.Serializable;

public class MonitoringTransaction implements Serializable {
	private static final long serialVersionUID = 7086684457666300288L;

	Object processId;
	Object transactionId;
	
	public MonitoringTransaction(Object processId, Object transactionId) {
		super();
		this.processId = processId;
		this.transactionId = transactionId;
	}
	
}
