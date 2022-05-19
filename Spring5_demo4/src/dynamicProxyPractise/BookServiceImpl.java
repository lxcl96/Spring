package dynamicProxyPractise;

import org.springframework.stereotype.Service;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
@Service
public class BookServiceImpl implements BookService{
    @Override
    public void addBook() {
        System.out.println("BookServiceImpl  增加一本书");
    }
}
