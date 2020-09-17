class AccountService //<-- root entity
{
  Stack<Operation> stack = new Stack<Operation>(); //< value object
  Account acc = new Account(); //<-- entity
  
  public void withdraw(double amount){
    acc.withdraw(amount);
    Operation op = new Operation(1,amount);
    stack.push(op);
  }
  
  public void deposit(double amount){
    acc.deposit(amount);
    Operation op = new Operation(2,amount);
    stack.push(op)
  }
  
  public void undo(){
    Operation op = stack.pop();
    if(op.Type == 1)
      acc.deposit(op.amount);
    if(op.Type == 2)
      acc.withdraw(op.amount);
      
  }
  
}
