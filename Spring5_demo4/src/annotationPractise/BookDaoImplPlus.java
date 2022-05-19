package annotationPractise;

import org.springframework.stereotype.Repository;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
@Repository
public class BookDaoImplPlus implements BookDao{
    @Override
    public void add() {
        System.out.println("BookDaoImplPlus de add....");
    }
}
