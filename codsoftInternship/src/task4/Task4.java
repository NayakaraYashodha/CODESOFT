package task4;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;
	public class Task4 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        Map<String, Double> exchangeRates = new HashMap<>();
		        exchangeRates.put("USD_TO_EUR", 0.85);
		        exchangeRates.put("EUR_TO_USD", 1.18);
		        exchangeRates.put("USD_TO_INR", 74.15);
		        exchangeRates.put("INR_TO_USD", 0.0135);
		        exchangeRates.put("EUR_TO_INR", 87.45);
		        exchangeRates.put("INR_TO_EUR", 0.0114);

		        Map<String, String> currencySymbols = new HashMap<>();
		        currencySymbols.put("USD", "$");
		        currencySymbols.put("EUR", "€");
		        currencySymbols.put("INR", "₹");

		        System.out.println("Choose the base currency (USD, EUR, INR): ");
		        String baseCurrency = scanner.nextLine().toUpperCase();

		        System.out.println("Choose the target currency (USD, EUR, INR): ");
		        String targetCurrency = scanner.nextLine().toUpperCase();

		        System.out.println("Enter the amount to convert: ");
		        double amount = scanner.nextDouble();

		        String exchangeKey = baseCurrency + "_TO_" + targetCurrency;

		        if (exchangeRates.containsKey(exchangeKey)) {
		            double exchangeRate = exchangeRates.get(exchangeKey);

		            double convertedAmount = amount * exchangeRate;

		            System.out.println("Converted Amount: " + currencySymbols.get(targetCurrency) + convertedAmount);
		        } else {
		            System.out.println("Sorry, conversion rate for " + baseCurrency + " to " + targetCurrency + " is not available.");
		        }

		        scanner.close();
		    }
		}
