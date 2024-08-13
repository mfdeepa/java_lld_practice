package designPattern.creationalDesignPattern.factoryDesignPattern;

import java.io.*;

//generating bills bby using class getplan.
public class GenerateBills {
    public static void main(String[] args) throws IOException {
        //creating object of getplan class.
        GetPlan plan1 = new GetPlan();

        System.out.print("Enter the name of plan for bill generation: ");

        //create a object of bufferreader class used to read text from a char based input stream.
        // it can be used data line by line
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //creating a variable of String type.
        String planName = br.readLine();

        System.out.print("Enter the number of units consumed: ");
        int units = Integer.parseInt(br.readLine());

        //creating a variable of plan type
        Plan p = plan1.getplan(planName);

        System.out.print(
                "Bill amount for " + planName + " of  " + units + " units is: "
        );
        p.getRate();
        System.out.println();
        p.calculatedBill(units);
    }

}
