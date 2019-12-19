package cn.edu.ccut.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import cn.edu.ccut.bo.Blog;
/**
 * 继承JpaRepository<T, ID>接口
 * T传入当前操作的实体类，ID传入该类的主键类型
 * @author jwang
 *
 */
public interface BlogDao extends JpaRepository<Blog, Integer>{
 
	
}