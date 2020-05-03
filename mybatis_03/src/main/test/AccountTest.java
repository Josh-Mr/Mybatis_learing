import com.josh.dao.IAccountDAO;
import com.josh.dao.IUserDAO;
import com.josh.entity.Account;
import com.josh.entity.User;
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
public class AccountTest {

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
        IAccountDAO mapper = sqlSession.getMapper(IAccountDAO.class);
        List<Account> all = mapper.findAll();
        for (Account account : all){
            System.out.println("-----------");
            System.out.println(account.toString());
        }
    }
}
