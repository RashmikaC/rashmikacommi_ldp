package lsp.correction;

public abstract class Employee implements IEmployee, IEmployeeBonus{

    int id;
    String name;
    public abstract int calculateBonus(int salary);
}
