package kiss.correction;

public class Month {
    public String getMonth(int month){
        if(month <1 || month >12)
            return "Wrong input";
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return months[month-10];
    }
}
//KISS => Keep It Simple Stupid
//less lines, more simple, more easy to understand