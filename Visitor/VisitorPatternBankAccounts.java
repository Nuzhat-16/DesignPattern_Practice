package Visitor;

public class VisitorPatternBankAccounts {
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount savings = new SavingsAccount(1000.0);
        BankAccount checking = new CheckingAccount(500.0);
        BankAccount loan = new LoanAccount(2000.0);
        AccountVisitor interestCalculator = new InterestCalculator();
        AccountVisitor statementGenerator = new StatementGenerator();
        System.out.println("Interest Calculation:");
        savings.accept(interestCalculator);
        checking.accept(interestCalculator);
        loan.accept(interestCalculator);
        System.out.println("\nStatement Generation:");
        savings.accept(statementGenerator);
        checking.accept(statementGenerator);
        loan.accept(statementGenerator);
    }
}