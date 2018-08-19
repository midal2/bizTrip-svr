package dz.biztrip.svc.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("test/")
public class RestControllerSample {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    SampleDAO sampleDAO;

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json; charset=utf8")
    public List<Map<String,Object>> index(@RequestBody SampleVO prm) {
        logger.debug("로그기록!!!!!");
        return sampleDAO.getSampleInfo(prm);

    }
}