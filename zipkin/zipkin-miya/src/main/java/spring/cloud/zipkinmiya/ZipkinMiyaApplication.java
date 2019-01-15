package spring.cloud.zipkinmiya;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ZipkinMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinMiyaApplication.class, args);
	}

	private Log log= LogFactory.getLog(this.getClass());


	@Autowired
	RestTemplate restTemplate;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("hi")
	public String Hi(){
		log.info("calling miya  ");
		return restTemplate.getForObject("http://localhost:8988/info", String.class);
	}

	@RequestMapping("/miya")
	public String info(){
		log.info( "calling trace miya ");
		return "i'm miya";

	}

}

