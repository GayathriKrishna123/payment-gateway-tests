package config;

public class BaseConfig {
    public String baseUrl;
    public String browser;
    public String environment;
    public String paymentProvider;

    public BaseConfig(String baseUrl, String browser, String environment, String paymentProvider) {
        this.baseUrl = baseUrl;
        this.browser = browser;
        this.environment = environment;
        this.paymentProvider = paymentProvider;
    }
}