package com.example.demo.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AnswerService {
    private static final String API_URL= "https://api.groq.com/openai/v1/chat/completions";

    private static final String API_KEY= "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";

//    @Autowired
//    private RestTemplate restTemplate;

    public String getAnswer(String prompt){
        String ans="hello";
//        restTemplate.exchange(ans, HttpMethod.POST,null,);
        return ans;
    }
//    JSONObjectcat

}
