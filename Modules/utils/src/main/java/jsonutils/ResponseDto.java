package jsonutils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseDto {

    public static <T> T responseAsDto(String response, Class<T> elementClass){
        try {
            return  new ObjectMapper().readValue(response, elementClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}
