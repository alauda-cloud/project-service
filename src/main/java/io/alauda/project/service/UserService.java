package io.alauda.project.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
public interface UserService {

    @RequestMapping(method = RequestMethod.GET,value="/user_project_ref?userId={userId}")
    Long[] getUserProjects(@PathVariable("userId") String userId);
}
