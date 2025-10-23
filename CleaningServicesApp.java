public class CleaningServicesApp{
    private String serviceName;
    private int normalHours;
    private double normalHourlyRate;
    private double extraHourlyRate;

    public CleaningServicesApp(String s, double n, double e, int nh){

        serviceName = s;
        normalHourlyRate = n;
        extraHourlyRate = e;
        normalHours =nh;
    }
    public String getServiceName(){
        return serviceName;
    }

    public int getNormalHours(){
        return normalHours;
    }

    public double getNormalHourlyRate(){
        return normalHourlyRate;
    }

    public double getExtraHourlyRate(){
        return extraHourlyRate;
    }

    public double calculateServiceCost(){
         double cost =((double)normalHours*normalHourlyRate);

         return cost;
    }
}
