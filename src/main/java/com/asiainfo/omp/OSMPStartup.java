package com.asiainfo.omp;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@PropertySource({"classpath:config/datasource.properties",//如果是相同的key，则最后一个起作用 
				 "classpath:config/freemarker.properties"})
public class OSMPStartup {
	private static Logger logger = Logger.getLogger(OSMPStartup.class);
    
    public static void main(String[] args) {
        // 程序启动入口
        SpringApplication.run(OSMPStartup.class,args);
        logger.info("=============================================");
        logger.info("||         R  E  A  D  Y  !                ||");
        logger.info("=============================================");
    }
}
