package entity;

import org.openswing.swing.message.receive.java.ValueObjectImpl;


public class UserEn extends ValueObjectImpl{
	//实体对应
	private String userId ;
	private String userGroup ;
	private String userName;
	private String userInfor;
	
	public UserEn() {
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserGroup() {
		return userGroup;
	}
	
	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserInfor() {
		return userInfor;
	}
	
	public void setUserInfor(String userInfor) {
		this.userInfor = userInfor;
	}

}
