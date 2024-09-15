package Visitor;

class InterestCalculator implements AccountVisitor {
    @Override
    public void visit(SavingsAccount savingsAccount) {
        double interest = savingsAccount.getBalance() * 0.03;
        System.out.println("Savings Account Interest: " + interest);
    }
    @Override
    public void visit(CheckingAccount checkingAccount) {
        double interest = checkingAccount.getBalance() * 0.01;
        System.out.println("Checking Account Interest: " + interest);
    }
    @Override
    public void visit(LoanAccount loanAccount) {
        double interest = loanAccount.getLoanAmount() * 0.05;
        System.out.println("Loan Account Interest: " + interest);
    }
}

