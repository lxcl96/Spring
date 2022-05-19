package annotationPractise;

import org.springframework.stereotype.Repository;

/**
 * @Author : Ly
 * @Date : 2022/5/19
 * @Description :
 */
@Repository
public class BookDaoImpl implements BookDao{
    private String name;

    public BookDaoImpl() {
    }

    public BookDaoImpl(String name) {
        this.name = name;
    }

    public void add(){
        System.out.println("dao 层add函数");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "name='" + name + '\'' +
                "and hashcode=" + hashCode() + '}';
    }
}
