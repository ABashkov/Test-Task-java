package Method;

import org.json.JSONObject;
import org.testng.Assert;
import Client.Client;

import java.util.Map;

public class Get {

    public void assertNotNull (String endpoint) {
        JSONObject json = new JSONObject(Client.requestGET("https://reqres.in/api/" + endpoint).getBody().asString());
        for (Map.Entry<String, Object> entry : json.toMap().entrySet()) {
            Assert.assertNotNull(entry.getValue(), entry.getKey() + " isNull");
        }
        System.out.println(json);
    }
}
