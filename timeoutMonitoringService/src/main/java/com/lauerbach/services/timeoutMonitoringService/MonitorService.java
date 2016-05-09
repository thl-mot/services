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
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
@Lock( LockType.READ)
@Remote( MonitorServiceRemote.class)
@Local( MonitorServiceLocal.class)
public class MonitorService implements MonitorServiceLocal, MonitorServiceRemote {


	@PostConstruct
	public void init() {
		
	}
	
	public void startMonitoring(MonitoringTransaction transaction, Class<MonitorCallback> callbackClass) {
		// TODO Auto-generated method stub
	}

	public void startMonitoring(MonitoringTransaction transaction, Class<MonitorCallback> callbackClass, int timeoutMillis) {
		// TODO Auto-generated method stub
	}

	public void removeMonitoring(Serializable processId, Serializable transactionId) {
		// TODO Auto-generated method stub
	}

	public List<MonitoringTransaction> listTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MonitoringTransaction> listTransactions(Serializable processId) {
		// TODO Auto-generated method stub
		return null;
	}

}
