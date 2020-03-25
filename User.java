package accomodate.Model;

public class User {
	
	private String txtFirstName, txtSurName, txtIdNo, txtPhone,txtUsername, txtPasword;

	public String getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(String txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public String getTxtSurName() {
		return txtSurName;
	}

	public void setTxtSurName(String txtSurName) {
		this.txtSurName = txtSurName;
	}

	public String getTxtIdNo() {
		return txtIdNo;
	}

	public void setTxtIdNo(String txtIdNo) {
		this.txtIdNo = txtIdNo;
	}

	public String getTxtPhone() {
		return txtPhone;
	}

	public void setTxtPhone(String txtPhone) {
		this.txtPhone = txtPhone;
	}

	public String getTxtPasword() {
		return txtPasword;
	}

	public void setTxtPasword(String txtPasword) {
		this.txtPasword = txtPasword;
	}
	public String toString()
	{
		return this.txtFirstName+", "+this.txtSurName+", "+this.txtIdNo+", "+this.txtPhone+", "+this.txtUsername;
	}

	public String getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(String txtUsername) {
		this.txtUsername = txtUsername;
	}

}
