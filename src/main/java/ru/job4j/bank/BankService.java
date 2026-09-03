package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    // метод должен добавить пользователя в систему
    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    // метод, который позволит удалить пользователя из системы
    public void deleteUser(String passport) {
        User deleteUser = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                deleteUser = user;
                break;
            }
        }
        if (deleteUser != null) {
            users.remove(deleteUser);
        }
    }

    // метод должен добавить новый счет к пользователю
    public void addAccount(String passport, Account account) {
        User userAddAccount = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                userAddAccount = user;
                break;
            }
        }
        if (userAddAccount == null) {
            return;
        }
        List<Account> accounts = users.get(userAddAccount);
        boolean duplicate = false;
        for (Account existing : accounts) {
            if (existing.getRequisite().equals(account.getRequisite())) {
                duplicate = true;
                break;
            }
        }
        if (!duplicate) {
            accounts.add(account);
        }
    }

    // метод ищет пользователя по номеру паспорта
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }
    // метод ищет счет пользователя по реквизитам
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = users.get(user);
        if (accounts == null) {
            return null;
        }
        for (Account account : accounts) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        // Ищем счёт отправителя
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        if (sourceAccount == null) {
            return false; // счёт не найден
        }
        // Проверяем, хватает ли денег
        if (sourceAccount.getBalance() < amount || amount <= 0) {
            return false; // недостаточно средств
        }
        // Ищем счёт получателя
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (destinationAccount == null) {
            return false; // счёт не найден
        }
        // Выполняем перевод
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        return true;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
