package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {



    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);// println은 레벨 이런것이 없고 그냥 찍힌다. 로그를 써야하는 이유

        log.trace("trace log={}", name); // log에는 레벨이 있다. application.properties 에서 trace, debug, info 레벨로 설정함에 따라 log가 설정에 맞게 찍히게 된다.
        log.debug("debug log={}", name); // LEVEL : TRACE > DEBUG > INFO > WARN > ERROR
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
