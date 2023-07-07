package com.eks.eksArtifact;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EKSController {
	
	@GetMapping("/agent-metadata/metadata")
    public String getMetaData1()
    {
		
		System.out.println("Got the get request");
        return "GET SuccessFull";
    }
   
   @PostMapping("/agent-metadata/metadata")
   public String postMetaData1() {
	  
		System.out.println("Got the post request");
	   return "POST SuccessFull";
   }
   

}
