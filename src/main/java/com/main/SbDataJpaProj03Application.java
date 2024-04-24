package com.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.main.entity.CallerTuneInfo;
import com.main.services.ICallerTuneService;
 

@SpringBootApplication
public class SbDataJpaProj03Application
{

	public static void main(String[] args) 
	{
		   ApplicationContext ctx = SpringApplication.run(SbDataJpaProj03Application.class, args);
		   ICallerTuneService service = ctx.getBean("docService", ICallerTuneService.class);
		   
		   //creating CallerTuneInfo record
			/* CallerTuneInfo c = new CallerTuneInfo("dil tu hi bata","kriss3");
			 System.out.println(service.saveCallerTune(c));*/
		    //update
			/* System.out.println(service.updateCallerTuneById(2, "test1", "test2"));*/
		   System.out.println(service.removeCallerTuneInfo(102));
		   
		  ((ConfigurableApplicationContext) ctx).close();
	}

}
