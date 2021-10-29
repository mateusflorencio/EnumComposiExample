package Program;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department's name:");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name:");
        String workerName = sc.nextLine();
        System.out.print("Level:");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary:");
        double workerSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Departament(departamentName));

        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract " + i + "# data:");
            Date date = sdf.parse(sc.next());
            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours):");
            int hours = sc.nextInt();

            HourContract hourContract = new HourContract(date, valuePerHour, hours);
            x.addContract(hourContract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income: " + monthAndYear + ": " + worker.income(month, year));


        sc.close();
    }
}
