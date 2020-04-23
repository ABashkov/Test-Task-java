package MySteps;

import Method.Post;
import io.cucumber.java.en.Then;
import java.util.Map;

public class PostFunction {

    Post testAPI = new Post();

    @Then("test api with endpoint - {string}")
    public void testApi(String endpoint, Map<String, String> body) {
        testAPI.matchChecking(endpoint, body);

    }
}