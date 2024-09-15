package Visitor;


interface AccountVisitor {
    void visit(SavingsAccount savingsAccount);
    void visit(CheckingAccount checkingAccount);
    void visit(LoanAccount loanAccount);
}
