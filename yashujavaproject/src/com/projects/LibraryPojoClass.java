package com.projects;

public class LibraryPojoClass {
	private static int count = 100;
	private String sname;
	private String sid;
	private String bname;
	private String bid;

	LibraryPojoClass() {
		count++;
		sid = "JFS-B68-" + count;

	}

	public void setSname(String sname) {
		this.sname = "Mr/Miss "+sname;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public String getSid() {
		return sid;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public String getBid() {
		return bid;
	}

}
