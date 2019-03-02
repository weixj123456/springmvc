package com.temptation.controller;


import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {		    
	    @RequestMapping(value="/{formName}")
	    public String loginForm(@PathVariable String formName){
	        return formName;
	    }

	    @RequestMapping(value="/gotoAction.do",method=RequestMethod.POST)
	    public String upload(@RequestParam("file") MultipartFile file,HttpServletRequest request){
	    	String storePath="/home/uploadfiles";//存放我们上传的文件路径 
	        if (!file.isEmpty()) {
	            String contextPath = request.getContextPath();//"/SpringMvcFileUpload"
	            String servletPath = request.getServletPath();//"/gotoAction"
	            String scheme = request.getScheme();//"http"
	            String setfilepath=request.getParameter("savefilepath");
                System.out.println("接收保存路径成功setfilepath:"+setfilepath);
                storePath=setfilepath ;  //存放服务器地址，我们上传的文件路径
                if(setfilepath.equals("")) {
//                	System.out.println("当前输入路径为空！！！,将采用默认保存路径");
                    storePath= "/home/wasadmin/cmisfile/zxreport/20190116"+"/";
                    System.out.println("当前输入路径为空！！！,将采用默认保存路径："+storePath);
                }
//	            String storePath= "E:\\uploadfiles";//存放我们上传的文件路径                 
//	            String storePath= "/home/wasadmin/cmisfile/zxreport/20190116"+"/";//存放服务器地址，我们上传的文件路径	            
	            String fileName = file.getOriginalFilename();
	            File filepath = new File(storePath, fileName);
	            if (!filepath.getParentFile().exists()) {
	                filepath.getParentFile().mkdirs();//如果目录不存在，创建目录
	            }
	            try {
	                file.transferTo(new File(storePath+File.separator+fileName));//把文件写入目标文件地址
	            } catch (Exception e) {
	                e.printStackTrace();
	                return "error";
	            }
	            return "success";//返回到成功页面
	        }else {
	            return "error";//返回到失败的页面
	        }
	    }
}