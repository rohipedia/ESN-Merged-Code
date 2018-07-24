package com.emt.config;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EsnConfig {

	@Value("${rmsServiceWsdlLocation}")
	private String rmsServiceWsdlLocationPropertyValue;
    
    @Bean
    public String rmsServiceWsdlLocationPropertyValue() throws IOException{
        return "file:"+new File(".").getCanonicalPath()+rmsServiceWsdlLocationPropertyValue;
    }	
    
	@Value("${queryDeviceInfoServiceWsdlLocation}")
	private String queryDeviceInfoServiceWsdlLocationPropertyValue;
	
	@Bean
    public String queryDeviceInfoServiceWsdlLocationPropertyValue() throws IOException{
        return "file:"+new File(".").getCanonicalPath()+queryDeviceInfoServiceWsdlLocationPropertyValue;
    }
}
