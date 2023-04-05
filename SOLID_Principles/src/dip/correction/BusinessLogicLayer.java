package dip.correction;
public class BusinessLogicLayer {
    private IRepositoryLayer DAL;
    public BusinessLogicLayer(IRepositoryLayer repositoryLayer){

        DAL=repositoryLayer;
    }
    public void save(Object details)
    {
        DAL.save(details);
    }
}
