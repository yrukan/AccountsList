package by.htp.runner;

import by.htp.model.*;
import by.htp.logic.*;

public class MainApp {

	public static void main(String[] args) {
			
		DepositAccount deposit1 = new DepositAccount(5000);
		DepositAccount deposit2 = new DepositAccount(2000);
		CardAccount cardacc1 = new CardAccount(1000, "Visa");
		CardAccount cardacc2 = new CardAccount(3000, "Visa");
		CreditAccount creditacc1 = new CreditAccount(0, "MasterCard", 2000);
		CreditAccount creditacc2 = new CreditAccount(0, "MasterCard", 4000);
	
		Client client = new Client("Jack", "Daniels");
		Account[] accounts = new Account[10];
		ClientAccounts acc = new ClientAccounts(client, accounts);
		
		//открытие счетов клиенту
		acc.addAccount(deposit1);
		acc.addAccount(creditacc1);
		acc.addAccount(cardacc1);
		acc.addAccount(deposit2);
		acc.addAccount(creditacc2);
		acc.addAccount(cardacc2);

		//блокировка счетов клиента
		acc.blockAllAccounts();
		//разблокировка счетов клиента
		acc.unblockAllAccounts();
		
		//сортировка всех счетов клиента по остатку по возрастанию
		acc.sortByAccountAmountAsc();
		//вывод всех счетов клиента
		acc.printAccounts();
		//вывод итогового остатка по всем счетам клиента
		acc.printClientTotalBalance();
		//вывод всех счетов клиента по заданному типу счета
		//acc.printAccounts("Счет с овердрафтом");
	
	}

}
