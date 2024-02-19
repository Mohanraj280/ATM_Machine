package atm;

import java.util.Date;

public class Transaction {
    private int id;
    private int userId;
    private String type;
    private double amount;
    private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Transaction(int id, int userId, String type, double amount, Date date) {
		super();
		this.id = id;
		this.userId = userId;
		this.type = type;
		this.amount = amount;
		this.date = date;
	}

    // Constructors, getters, and setters
	
}
