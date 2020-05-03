import com.josh.dao.IAccountDAO;
import com.josh.dao.IRoleDAO;
import com.josh.entity.Account;
import com.josh.entity.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName UserTest.java
 * @Description TODO
 * @createTime 2020-04-20 23:05:00
 */
public class RoleTest {

    private InputStream inputStream;
    private SqlSessionFactoryBuilder sqlSessionFactoryBuilder;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }
    @After
    public void destroy() throws IOException {
        // 手动提交
        sqlSession.commit();
        inputStream.close();
        sqlSession.close();
    }


    @Test
    public void TestFindAll(){
        IRoleDAO mapper = sqlSession.getMapper(IRoleDAO.class);
        List<Role> roles = mapper.findAll();
        for (Role role : roles){
            System.out.println("-----------");
            System.out.println(role.toString());
        }
    }
}
