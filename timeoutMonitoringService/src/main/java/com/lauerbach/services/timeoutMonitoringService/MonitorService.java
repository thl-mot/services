package com.lauerbach.services.timeoutMonitoringService;

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
