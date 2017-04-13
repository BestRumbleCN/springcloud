package pri.fly.cloud.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:App <br/>
 * @author   fly
 * @version  1.0
 * @since    2016年11月25日 上午10:51:14
 * @see 	 
 */
@EnableEurekaServer
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}

