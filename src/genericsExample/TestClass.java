package genericsExample;



public class TestClass {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1l);
        user.setFirstName("Otgo");
        user.setLastName("AJK");

        Account account = new Account();
        account.setId(1L);
        account.setAccountNumber(4354353453L);
        account.setYouBalance(5000.34);

        UserRepository userRepository = new UserRepository();
        userRepository.save(user);

        AccountRepository accountRepository = new AccountRepository();
        accountRepository.save(account);
    }
}
