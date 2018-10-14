package io.alauda.project.service;

import io.alauda.project.vo.Card;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("todo-service")
public interface TodoService {

    @PostMapping("/cards/batch")
    void batchCreateCard(@RequestBody List<Card> cardList);
}
