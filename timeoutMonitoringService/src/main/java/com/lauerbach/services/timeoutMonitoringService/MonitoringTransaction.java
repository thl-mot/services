package com.lauerbach.services.timeoutMonitoringService;

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
