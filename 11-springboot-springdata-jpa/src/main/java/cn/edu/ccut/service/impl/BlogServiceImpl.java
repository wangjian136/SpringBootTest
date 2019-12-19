package cn.edu.ccut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.dao.BlogDao;
import cn.edu.ccut.service.BlogService;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogDao blogDao;

	@Override
	public List<Blog> selectAll() {
		return blogDao.selectAllBlog();
	}

	@Override
	public void saveBlog(Blog blog) {
		blogDao.createBlog(blog);
	}

	@Override
	public Blog selectBlogById(Integer id) {
		return blogDao.selectBlog(id);
	}

}
