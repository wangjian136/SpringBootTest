package cn.edu.ccut.dao;

import java.util.List;


import cn.edu.ccut.bo.Blog;

public interface BlogDao {

	public Blog selectBlog(Integer id);
	
	public List<Blog> selectAllBlog();
	
	public void createBlog(Blog blog);
}
