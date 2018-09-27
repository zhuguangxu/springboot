package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.BookServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/book")
public class BookController {

    private static final String BOOK_DETAIL_PATH_NAME = "bookDetail";
    private static final String BOOK_LIST_PATH_NAME = "bookList";

    @Resource
    BookServices bookServices;

    /**
     * 获取 Book 列表
     * 处理 "/book" 的 GET 请求，用来获取 Book 列表
     * 数据存入ModelMap，返回Thymeleaf页面
     */

    @GetMapping("/all")
    public String getBookList(ModelMap map) {
        map.addAttribute("bookList",bookServices.getAll());
        return BOOK_LIST_PATH_NAME;
    }

    /**
     * 获取 Book
     * 处理 "/book/{id}" 的 GET 请求
     */
    @GetMapping(value = "/{id}")
    public String getBook(@PathVariable Integer id,ModelMap map) {
       map.addAttribute("book",bookServices.get(id));
        return BOOK_DETAIL_PATH_NAME;
    }

}
