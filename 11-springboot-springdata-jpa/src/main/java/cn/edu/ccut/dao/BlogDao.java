package cn.edu.ccut.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import cn.edu.ccut.bo.Blog;
/**
 * �̳�JpaRepository<T, ID>�ӿ�
 * T���뵱ǰ������ʵ���࣬ID����������������
 * @author jwang
 *
 */
public interface BlogDao extends JpaRepository<Blog, Integer>{
 
	
}