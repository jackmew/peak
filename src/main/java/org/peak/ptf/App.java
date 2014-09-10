package org.peak.ptf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ptf : Personal/Task/Finance
 *
 */
@Configuration
@EnableAutoConfiguration
@RestController
public class App 
{
	
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("/")
    public String test(){
    	return "test";
    }
    
    @RequestMapping("/2")
    public String test2(){
    	return "fuck";
    }
    
    @RequestMapping("/3")
    public String tes3(){
    	return "damn";
    }
}
