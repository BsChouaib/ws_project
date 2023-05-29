package service;

import dao.WalletDao;
import model.TbWallet;

public class WalletServiceImpl implements IWalletService {
	
	private int amount;
	private int balance;
	private int k_Subscriber;
	
	
	private WalletDao dao = new WalletDao();
	

	@Override
	public TbWallet chercherWallet(int id) {
		return dao.getById(id);
	}
	
	@WebMethod
	public void transaction(@WebParam(name = "sender") String sender,
	                        @WebParam(name = "receiver") String receiver,
	                        @WebParam(name = "amount") double amount) {
	    
	    if (sender != null && !sender.isEmpty() && receiver != null && !receiver.isEmpty() && amount > 0) {
	        
	        System.out.println("Transaction effectuée avec succès :");
	        System.out.println("Expéditeur : " + sender);
	        System.out.println("Destinataire : " + receiver);
	        System.out.println("Montant : " + amount);
	    } else {
	    	System.out.println("Paramètres de transaction invalides");
	    }
	
	    }


	@WebMethod
	public void delete(String k_subscriber) {
	    
	    if (k_subscriber == null || k_subscriber.isEmpty()) {
	        System.out.println("Paramètre k_subscriber invalide");
	        return;
	    }
	    
	    boolean deletionSuccessful = deleteWallet(k_subscriber);
	    if (deletionSuccessful) {
	        System.out.println("Portefeuille supprimé avec succès : " + k_subscriber);
	    } else {
	        System.out.println("La suppression du portefeuille a échoué.");
	    }
	}

	
	private boolean deleteWallet(String k_subscriber) {
	    
	    System.out.println("Suppression du portefeuille : " + k_subscriber);
	    return true;
	}

    
	@WebMethod
	public void create(String k_subscriber, int balance, int amount) {
	    
	    if (k_subscriber == null || k_subscriber.isEmpty()) {
	        System.out.println("Paramètre k_subscriber invalide");
	        return;
	    }
	    
	    TbWallet newWallet = new TbWallet(k_subscriber, balance);
	    
	    newWallet.setBalance(newWallet.getBalance() + amount);
	    
	    boolean creationSuccessful = saveTbWallet(newTbWallet);
	    if (creationSuccessful) {
	        System.out.println("Portefeuille créé avec succès : " + k_subscriber);
	    } else {
	        System.out.println("La création du portefeuille a échoué.");
	    }
	}

	private boolean saveWallet(TbWallet wallet) {
	    
	    System.out.println("Enregistrement du portefeuille : " + wallet.getK_subscriber());
	    return true;
	}



	public int getBalance() {
		return balance;
	}
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public int getAmount() {
		return amount;
	}
	
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return the kSubscriber
	 */
	public int getkSubscriber() {
		return k_Subscriber;
	}
	/**
	 * @param kSubscriber the kSubscriber to set
	 */
	public void setkSubscriber(int kSubscriber) {
		this.k_Subscriber = kSubscriber;
	}
	
	
	

}
