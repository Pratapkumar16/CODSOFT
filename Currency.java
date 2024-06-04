import java.util.Scanner;

//Task 4 of the CodSoft Internship program batch 'May 05 2024' to 'June 05 2024'
public class Currency {

    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.println("Select a country:");
        System.out.println("1. United States Of America (USD)");
        System.out.println("2. United Kingdom (GBP)");
        System.out.println("3. India (INR)");
        System.out.println("4. Canada (CAD)");
        System.out.print("Enter your choice (1/2/3/4): ");

        int choice = pk.nextInt();
        double baseValue;

        switch (choice) {
            case 1:
                System.out.print("Enter the base amount in USD: ");
                baseValue = pk.nextDouble();
                convertion(baseValue, "USD (United States Of America)");
                break;
            case 2:
                System.out.print("Enter the base amount in GBP: ");
                baseValue = pk.nextDouble();
                convertion(baseValue, "GBP(United Kingdom)");
                break;
            case 3:
                System.out.print("Enter the base amount in INR: ");
                baseValue = pk.nextDouble();
                convertion(baseValue, "INR(India)");
                break;
            case 4:
                System.out.print("Enter the base amount in CAD: ");
                baseValue = pk.nextDouble();
                convertion(baseValue, "CAD(Canada)");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
        }
    }

    public static void convertion(double baseValue, String baseCurrency) {
        double exchangeRateUSD = 0.0120;
        double exchangeRateGBP = 0.01139;
        double exchangeRateINR = 1.0; // 1 INR = 1 INR
        double exchangeRateCAD = 0.0163;

        Scanner pk = new Scanner(System.in);
        System.out.print("Enter the target currency (USD/GBP/INR/CAD): ");
        String targetCurrencySymbol = pk.nextLine().toUpperCase();

        double convertedAmount;

        switch (targetCurrencySymbol) {
            case "USD":
                convertedAmount = baseValue * exchangeRateUSD;
                break;
            case "GBP":
                convertedAmount = baseValue * exchangeRateGBP;
                break;
            case "INR":
                convertedAmount = baseValue * exchangeRateINR;
                break;
            case "CAD":
                convertedAmount = baseValue * exchangeRateCAD;
                break;
            default:
                System.out.println("Invalid target currency symbol.");
                return;
        }
        System.out.printf("Your Converted amount is:\n %.2f %s = %.2f %s%n", baseValue, baseCurrency, convertedAmount,
                targetCurrencySymbol);
    }
}
