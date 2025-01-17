package info.nemoworks.udo.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.junit.jupiter.api.Test;

public class UdoTests {

    @Test
    public void testUdoSchema() {

        String jsonString = "{'id': 1001, " + "'firstName': 'Lokesh'," + "'lastName': 'Gupta',"
                + "'email': 'howtodoinjava@gmail.com'}";

        JsonObject data = new Gson().fromJson(jsonString, JsonObject.class);

        UdoType type = new UdoType(data);
        type.setId("type-1");

        JsonObject object = type.toJsonObject();
        System.out.println(object);

        assertNotNull(type.toJsonObject());

    }

}
