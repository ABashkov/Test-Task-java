package Method;

import org.json.JSONObject;
import org.testng.Assert;
import Client.Client;
import java.util.Map;

public class Post {

    public void matchChecking(String endpoint, Map<String, String> body) {
        JSONObject requestBody = new JSONObject(body);
        JSONObject response = new JSONObject(Client.requestPOST("https://reqres.in/api/" + endpoint, requestBody)
                .getBody().asString());
        for (Map.Entry<String, Object> entry : requestBody.toMap().entrySet()) {
            Assert.assertEquals(entry.getValue(), response.get(entry.getKey()));

        }
    }

}
