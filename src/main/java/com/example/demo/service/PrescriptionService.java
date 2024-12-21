package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {
    private static final String API_URL= "https://api.groq.com/openai/v1/chat/completions";

    private static final String API_KEY= "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";


    public String getAnswer(String prompt){
//        restTemplate.exchange(ans, HttpMethod.POST,null,);
        return prompt;
    }

}
