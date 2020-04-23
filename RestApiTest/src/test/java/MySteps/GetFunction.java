package MySteps;

import Method.Get;
import io.cucumber.java.en.Given;


public class GetFunction {

    Get functionGET = new Get();

    @Given("we are send get request with endpoint - {string} and check it for NotNull")
    public void weAreSendGetRequest(String endpoint) {
        functionGET.assertNotNull(endpoint);
    }
}