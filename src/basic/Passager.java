package basic;

import java.util.ArrayList;

public class Passager {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private int passagerID;
	private String realName;
	private String identityID;
	private String password;
	private ArrayList<Order> orderlist;
	public Passager(int id, String name, String identity,String pass,ArrayList<order> pay){
		this.passagerID = id;
		this.realName = name;
		this.identityID=identity;
		this.password=pass;
		this.orderlist = pay;
	}
	public Passager(String un, String pa){
		this.username=un;
		this.password=pa;
	}
	public ArrayList<Order> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(ArrayList<Order> orderlist) {
		this.orderlist = orderlist;
	}
	public int getPassagerID() {
		return passagerID;
	}
	public void setPassagerID(int passagerID) {
		this.passagerID = passagerID;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdentityID() {
		return identityID;
	}
	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
