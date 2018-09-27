package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.SspService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/ssp")
public class SspController {

    private static final String SSP_DETAIL_PATH_NAME = "sspDeatil";
    private static final String SSP_LIST_PATH_NAME = "sspList";

    @Resource
    private SspService sspService;

    @GetMapping("/all")
    public String getSspList(ModelMap map) {
        map.addAttribute("sspList",sspService.getAll());
        return SSP_LIST_PATH_NAME;
    }

    /**
     * 获取 SSP
     * 处理 "/ssp/{id}" 的 GET 请求
     */
    @GetMapping(value = "/{id}")
    public String getSsp(@PathVariable Integer id, ModelMap map) {
        map.addAttribute("sspDeatil",sspService.get(id));
        return SSP_DETAIL_PATH_NAME;
    }

}
