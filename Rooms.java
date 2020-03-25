package accomodate.Model;

import java.io.InputStream;



public class Rooms {
	
	private String textPrice, txtLocation, textType, txtDescription;
	InputStream lblimage;
	

	public String getTxtLocation() {
		return txtLocation;
	}

	public void setTxtLocation(String txtLocation) {
		this.txtLocation = txtLocation;
	}

	public String getTextType() {
		return textType;
	}

	public void setTextType(String textType) {
		this.textType = textType;
	}

	public String getTxtDescription() {
		return txtDescription;
	}

	public void setTxtDescription(String txtDescription) {
		this.txtDescription = txtDescription;
	}

	public String getTextPrice() {
		return textPrice;
	}

	public void setTextPrice(String textPrice) {
		this.textPrice = textPrice;
	}
	public String toString()
	{
		return this.textPrice+", "+this.txtLocation+", "+this.textType+", "+this.txtDescription+","+this.lblimage;
	}

	public InputStream getLblimage() {
		return lblimage;
	}

	public void setLblimage(InputStream lblimage) {
		this.lblimage = lblimage;
	}

}
