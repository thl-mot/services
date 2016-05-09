package com.lauerbach.services.timeoutMonitoringService;

import java.io.Serializable;
import java.util.List;

public interface MonitorServiceRemote {

	void startMonitoring( MonitoringTransaction transaction, Class<MonitorCallback> callbackClass);
	void startMonitoring( MonitoringTransaction transaction, Class<MonitorCallback> callbackClass, int timeoutMillis);
	
	void removeMonitoring( Serializable processId, Serializable transactionId);
	
	List<MonitoringTransaction> listTransactions(); 
	List<MonitoringTransaction> listTransactions( Serializable processId); 
	
}
