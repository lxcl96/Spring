package fullAnnationAop;

import org.springframework.stereotype.Repository;

/**
 * @FileName:BookDao.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */
@Repository
public class BookDao {

    public void delBook(String name) {
        System.out.println("bookDao 准备删除" + name);
    }
}
