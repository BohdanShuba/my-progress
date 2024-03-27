package ua.shuba.myprogress.adapter;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/v1/progress")
public class ProgressController {
    void get() {
        List<Object> newList = List.of("a   ", "b");
        Object o = newList.get(0);
        if (o instanceof String) {
            String trimA = ((String) o).trim();
        }

        if (o instanceof String s) {
            String trimS = s.trim();
        }

    }
}
