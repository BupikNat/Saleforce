package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class LogsTest {

    @Test
    public void checkLogs() {
        log.fatal("fatal");  //по сути тот же самый SystemOutPrintln - выводит сообщения в консоли
        log.error("error");
        log.warn("warning");
        log.info("info");
        log.debug("debug");
        log.trace("trace");
    }
}
