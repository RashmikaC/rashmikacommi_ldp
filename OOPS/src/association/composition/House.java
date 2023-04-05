package association.composition;

public class House {
    private Kitchen kitchen;
    public House(){
        kitchen=new Kitchen();
        kitchen.setFood("Pizza");
    }
    public String getFood() {
        return kitchen.getFood();
    }
}
// when you create house obj, it creates kitchen obj.
// when you destroy house obj it will destroy kitchen obj
// we can say that kitchen is part of house