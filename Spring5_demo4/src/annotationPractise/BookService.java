package annotationPractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
@Service
public class BookService {
    @Value(value = "10086")
    private Integer id;

//    @Autowired
//    @Qualifier(value = "bookDaoImpl")
    @Resource(name = "bookDaoImplPlus")
    private BookDao bookDao;

    public BookService() {
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BookService(Integer id, BookDao bookDao) {
        this.id = id;
        this.bookDao = bookDao;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "id=" + id +
                ", bookDao=" + bookDao +
                '}';
    }
}
