package com.quest.synchronize.wait_notify_insert_test;

public class BackupB extends Thread {
	private DBTools dbTools;

	public BackupB(DBTools dbTools) {
		super();
		this.dbTools = dbTools;
	}

	@Override
	public void run() {
		dbTools.backupB();
	}
	
}
