package cn.edu.ccut.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.dao.BlogDao;

@Repository
public class BlogDaoImpl implements BlogDao {
	
	@PersistenceContext(name="entityManagerFactory")//该注解表示从工厂中拿出对象
	private EntityManager entityManager;

	@Override
	public Blog selectBlog(Integer id) {
		return entityManager.find(Blog.class, id);
	}

	@Override
	public List<Blog> selectAllBlog() {
		Query query=entityManager.createQuery("from Blog");
		return query.getResultList();
	}

	@Override
	public void createBlog(Blog blog) {
		entityManager.persist(blog);
	}

}
