package com.lauerbach.services.timeoutMonitoringService;

public interface MonitorCallback {
	void timeout( MonitoringTransaction transaction);
}
