package Convert.Currency.money.service;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    public double convert(double amount, String fromCurrency, String toCurrency) {
        // Заменить на динамическое получение курсов валют
        double fromRate = getExchangeRate(fromCurrency);
        double toRate = getExchangeRate(toCurrency);

        return (amount / fromRate) * toRate;
    }

    private double getExchangeRate(String currency) {
        return switch (currency.toUpperCase()) {
            case "USD" -> 1.0;
            case "EUR" -> 0.85;
            case "KZT" -> 480.0;
            default -> throw new IllegalArgumentException("Unknown currency: " + currency);
        };
    }
}
