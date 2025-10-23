
   // Author: Ayaa Sibisi
   // Date: October 2025
   // Description: A class representing a cleaning service with rates and cost calculation.

import java.util.Scanner;
import java.text.DecimalFormat;
public class TestCleaningServicesApp{
    public static  void main(String []args){
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("Enter the type of service you are requesting(Cleaner, Gardner, Handy Man):");
        String serviceType = input.nextLine();

        System.out.println("Enter the number of hours required for the service:");
        int hours = input.nextInt();

        System.out.println("Enter the normal hourly rate per day:");
        double serviceRate = input.nextDouble();
        
        System.out.println("Enter the extra hourly rate per day");
        double extraHoursRate = input.nextDouble();

        CleaningServicesApp service = new CleaningServicesApp(serviceType, serviceRate, extraHoursRate, hours);

        System.out.println("================Service Required=========================");
        System.out.println("Service Required: "+service.getServiceName());
        System.out.println("Normal Hours: "+service.getNormalHours());
        System.out.println("Normal Hourly Rate: R"+service.getNormalHourlyRate());
        System.out.println("Extra Rate: R"+service.getExtraHourlyRate());
        System.out.println("Total Service Fee: R"+service.calculateServiceCost());

    }

}
