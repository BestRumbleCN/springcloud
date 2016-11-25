package pri.fly.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ConfigServerApplication <br/>
 * 
 * @author fly
 * @version 1.0
 * @since 2016年11月25日 上午9:42:49
 * @see
 */
@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServerApplication {
	
	@Value("#{hello.world}")
	private String hello;

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return hello;
	}
}
