package lsp.correction;


public class PermanentEmployee extends Employee {
    public int calculateBonus(int salary) {

        return salary*100;
    }
    public int getMinimumSalary() {
        return 10000;
    }
}
