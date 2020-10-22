package bunkerchain.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> handlerException(Exception exception) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errorCode", 500);
//		map.put("errorMsg", exception.toString());
		map.put("errorMsg", "this is customer error");
		return map;
	}

}
