package com.kingsila.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awscredentials = new BasicAWSCredentials(
           "AKIAUMSWAB5XBYMKTB7B",
                "i6S1owVcJZ4vC3be/BUx8egaw0nAjncCC0UppuWB"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("sa-east-1")
                .withCredentials(new AWSStaticCredentialsProvider(awscredentials))
                .build();
    }
}
