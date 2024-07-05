package com.mayank.bean;

public class employee {

		
		private int eid;
		private String ename;
		private String profile;
		
		
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return ename;
		}
		public void setName(String ename) {
			this.ename = ename;
		}
		public String getCity() {
			return profile;
		}
		public void setCity(String profile) {
			this.profile = profile;
		}
		/*
		public employee(int eid, String name, String city) {
			super();
			this.eid = eid;
			this.name = name;
			this.city = city;
		}*/

		
		
		public void show() {
			System.out.println(eid + "  " + ename + "  " + profile+ "  " );
			}

		
	

}
