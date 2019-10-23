package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author: MJJ 
* @time: 2019年10月23日 上午11:51:45 
* 类说明 ：
*/
@RestController
public class TestController {

	@RequestMapping("test")
	public String test(){
		return "hello!";
	}

	@RequestMapping("test2")
	public String test2(){
		return "hello2!";
	}
}
