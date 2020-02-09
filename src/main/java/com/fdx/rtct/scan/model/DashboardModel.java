package com.fdx.rtct.scan.model;

public class DashboardModel {
	private int scanCompleted;
	private int scanPending;
	private int scanfailed;
	private String user;
	
	
	
	public DashboardModel() {
	}
	public DashboardModel(int scanCompleted, int scanPending, int scanfailed, String user) {
		this.scanCompleted = scanCompleted;
		this.scanPending = scanPending;
		this.scanfailed = scanfailed;
		this.user = user;
	}
	public int getScanCompleted() {
		return scanCompleted;
	}
	public void setScanCompleted(int scanCompleted) {
		this.scanCompleted = scanCompleted;
	}
	public int getScanPending() {
		return scanPending;
	}
	public void setScanPending(int scanPending) {
		this.scanPending = scanPending;
	}
	public int getScanfailed() {
		return scanfailed;
	}
	public void setScanfailed(int scanfailed) {
		this.scanfailed = scanfailed;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}
