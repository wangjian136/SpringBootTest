package cn.edu.ccut.controller;
 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.service.BlogService;
 
@Controller
@RequestMapping("/blog")
public class BlogController {
 
    @Autowired
    private BlogService blogService;
 
    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> list(){
    	Map<String, Object> map = new HashMap<String, Object>();
    	List<Blog> blogs = blogService.selectAll();
    	map.put("blogs", blogs);
        return map;
    }
}