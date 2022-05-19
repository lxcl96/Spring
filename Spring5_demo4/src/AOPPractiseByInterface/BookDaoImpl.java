package AOPPractiseByInterface;

import org.springframework.stereotype.Repository;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
@Repository
public class BookDaoImpl{

    public int delBook() {
        System.out.println("删除图书");
        return 0;
    }
}
