package entity;

import java.sql.Date;

import org.openswing.swing.message.receive.java.ValueObjectImpl;

public class ProjectEn extends ValueObjectImpl{
	//实体对应
	//opens Swing中必须继承ValueObjectImpl
	private String proId ;
	private String proName;
	private String proVersion;
	private String proFormat;
	private String proSecurity;
	private String proDepartment;
	private String proUser;
	private String proDmtype;
	private String proDate;
	
	

	public String getProDate() {
		return proDate;
	}

	public void setProDate(String proDate) {
		this.proDate = proDate;
	}

	public ProjectEn() {
	  }

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProVersion() {
		return proVersion;
	}

	public void setProVersion(String proVersion) {
		this.proVersion = proVersion;
	}

	public String getProFormat() {
		return proFormat;
	}

	public void setProFormat(String proFormat) {
		this.proFormat = proFormat;
	}

	

	public String getProSecurity() {
		return proSecurity;
	}

	public void setProSecurity(String proSecurity) {
		this.proSecurity = proSecurity;
	}

	public String getProDepartment() {
		return proDepartment;
	}

	public void setProDepartment(String proDepartment) {
		this.proDepartment = proDepartment;
	}

	public String getProUser() {
		return proUser;
	}

	public void setProUser(String proUser) {
		this.proUser = proUser;
	}

	public String getProDmtype() {
		return proDmtype;
	}

	public void setProDmtype(String proDmtype) {
		this.proDmtype = proDmtype;
	}

}
