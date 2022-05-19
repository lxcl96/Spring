package aopxml;

/**
 * @FileName:BookDao.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description: 被代理类
 */
public class BookDao {

    public void delBook(String name){
        System.out.println("dao 方法删除图书... " + name);
    }
}
