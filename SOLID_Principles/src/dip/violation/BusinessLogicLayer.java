package dip.violation;

public class BusinessLogicLayer {
    private DataAccessLayer DAL;
    public BusinessLogicLayer(){
        DAL=new DataAccessLayer();
    }
    public void save(Object details)
    {
        DAL.save(details);
    }
}
