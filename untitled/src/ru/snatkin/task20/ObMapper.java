package ru.snatkin.task20;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: 18.06.2019 узнать что за Exception 
public class ObMapper {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try { String str = "{\n" +
                "  \"name\": \"http.cat\",\n" +
                "  \"version\": \"2.0.0\",\n" +
                "  \"priv\": true\n" +
                "}";
            User user = mapper.readValue(str, User.class);
            System.out.println(user);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


