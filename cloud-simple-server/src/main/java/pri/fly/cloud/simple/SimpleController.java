package pri.fly.cloud.simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:SimpleController <br/>
 * @author   fly
 * @version  1.0
 * @since    2016年11月25日 上午11:16:22
 * @see 	 
 */

@RestController
public class SimpleController {
	@Value("${hello.world}")
	private String hello;
	
	@RequestMapping("/hello")
	public String hello(){
		return hello;
	}
}

