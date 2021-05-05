package Entities;

public class Campaign {
	private int id;
	private String campaingName;
	private double discountRate;
	
	
	public Campaign(int id, String campaingName, double discountRate) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.discountRate = discountRate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaingName() {
		return campaingName;
	}


	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
