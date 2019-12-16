package cn.edu.ccut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.mapper.BlogMapper;
import cn.edu.ccut.service.BlogService;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogMapper blogMapper;

	@Override
	public List<Blog> selectAll() {
		return blogMapper.selectAllBlog();
	}

	@Override
	public void saveBlog(Blog blog) {
		blogMapper.createBlog(blog);
		int a = 1/0;
	}

	@Override
	public Blog selectBlogById(Integer id) {
		return blogMapper.selectBlog(id);
	}

}
