package cn.springbooot.springbooot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Index {
	
	   @RequestMapping(value="/")
	   @ResponseBody
	    public String index(){
	        return "欢迎访问首页!";
	    }
	  
	  
	   @RequestMapping(value="/test1",method=RequestMethod.GET)
	   @ResponseBody
	    public String test1(@RequestParam("test") String test){
		   System.out.println(test);
	        return "欢迎访问首页!"+test;
	    }
	  
	  
	   
	   
	  public static void main( String[] args )
	  {
            SpringApplication.run(Index.class, args);
	  }

}
