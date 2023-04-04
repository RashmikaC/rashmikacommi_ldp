package lsp.violation;

public class ContractEmployee extends Employee{
    public int calculateBonus(int salary) {
        //no bonus so returns an exception
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
