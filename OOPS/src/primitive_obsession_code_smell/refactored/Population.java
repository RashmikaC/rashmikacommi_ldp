package primitive_obsession_code_smell.refactored;

public class Population {
    Integer adults;
    Integer kids;
    public Population(Integer a, Integer k){
        this.adults=a;
        this.kids=k;
    }
    public Integer getAdults() {
        return adults;
    }
    public void setAdults(Integer adults) {
        this.adults = adults;
    }
    public Integer getKids() {
        return kids;
    }
    public void setKids(Integer kids) {
        this.kids = kids;
    }
}
