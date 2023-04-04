package lsp.correction;

public class TemporaryEmployee extends Employee {
    public int calculateBonus(int salary) {

        return salary*50;
    }
    public int getMinimumSalary() {
        return 10000;
    }
}
