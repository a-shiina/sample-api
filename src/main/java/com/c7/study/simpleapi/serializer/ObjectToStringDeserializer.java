package com.c7.study.simpleapi.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ObjectToStringDeserializer extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonToken jsonToken = parser.getCurrentToken();
        if (jsonToken == JsonToken.VALUE_STRING) {
            return parser.getValueAsString();
        }
        return parser.readValueAsTree().toString();
    }
}
