package assignment_7.qun_1;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.run();
            System.out.println();
        }
    }
}

//Time Complexity: O(n)=O(3)
//Space Complexity: O(n) =O(3), where n is the size of the array