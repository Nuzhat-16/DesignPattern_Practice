package Visitor;


interface BankAccount {
    void accept(AccountVisitor visitor);
}

