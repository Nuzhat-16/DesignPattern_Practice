package Visitor;

class StatementGenerator implements AccountVisitor {
    @Override
    public void visit(SavingsAccount savingsAccount) {
        System.out.println("Generating statement for Savings Account. Balance: " + savingsAccount.getBalance());
    }
    @Override
    public void visit(CheckingAccount checkingAccount) {
        System.out.println("Generating statement for Checking Account. Balance: " + checkingAccount.getBalance());
    }
    @Override
    public void visit(LoanAccount loanAccount) {
        System.out.println("Generating statement for Loan Account. Loan Amount: " + loanAccount.getLoanAmount());
    }
}