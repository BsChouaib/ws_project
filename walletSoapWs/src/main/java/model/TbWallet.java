package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_wallet database table.
 * 
 */
@Entity
@Table(name="tb_wallet")
@NamedQuery(name="TbWallet.findAll", query="SELECT t FROM TbWallet t")
public class TbWallet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="k_subscriber")
	private int kSubscriber;

	private int amount;

	private int balance;

	public TbWallet() {
	}

	public int getKSubscriber() {
		return this.kSubscriber;
	}

	public void setKSubscriber(int kSubscriber) {
		this.kSubscriber = kSubscriber;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}