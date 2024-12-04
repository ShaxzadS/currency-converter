package Convert.Currency.money.model;

public class ConversionResponse {
    private double amount;
    private String fromCurrency;
    private String toCurrency;
    private double convertedAmount;

    public ConversionResponse(double amount, double convertedAmount, String fromCurrency, String toCurrency) {
        this.amount = amount;
        this.convertedAmount = convertedAmount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public ConversionResponse(double amount, String fromCurrency, String toCurrency, double result) {
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }
}
