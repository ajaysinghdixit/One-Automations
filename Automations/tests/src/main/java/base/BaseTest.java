package base;

import org.testng.annotations.BeforeSuite;
import readers.Environment;
import readers.LoadEnvironmentProperties;
import readers.Services;
import restassured.auth.Api;
import restassured.client.Client;
import restassured.paypal.login.Login;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public LoadEnvironmentProperties envProps = new LoadEnvironmentProperties();
    public final Environment env = envProps.getEnvironment();
    public final Services paypal = env.getServices().stream().filter(data -> data.getName().equals("Paypal")).toList().get(0);
    public Client cl = new Client(env.getBase_url());


    @BeforeSuite
    public void beforeSuit() {
        System.out.print("Base test run");

        Api.signIn(cl, paypal.getUser(), paypal.getPassword());
    }


}
