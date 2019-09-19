package com.deng.controller;



import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/user")
public class Fileupdate {
     @RequestMapping("/uploadfile")
	public String uploadfile(HttpServletRequest request,MultipartFile upload) throws Exception {
		
    	String path=request.getSession().getServletContext().getRealPath("/uploads/");
    	 File file=new File(path);
    	 if(!file.exists()) {
    		 file.mkdir();
    	 }
    	 
		String filename=upload.getOriginalFilename();
		String uuid=UUID.randomUUID().toString().replace("-", "");
		filename=uuid+"_"+filename;
		
		upload.transferTo(new File(path,filename));
    	 System.out.println(path+"         "+filename);
		return "success";
	}
	
}
