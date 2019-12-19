package test;

import com.el.ShardingJdbcTwo;
import com.el.dao.ProductDao;
import com.el.entity.ProductInfo;
import com.el.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author roman zhangfei
 * @Date 2019/12/5 10:59
 * @Version V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcTwo.class)
public class ShardingTest {

    @Autowired
    ProductService productService;
    @Autowired
    ProductDao productDao;

    //添加商品
    @Test
    public void testCreateProduct(){
        for (int i = 0; i < 10; i++) {
            ProductInfo productInfo = new ProductInfo();
            productInfo.setStoreInfoId(2L);//店铺id
            productInfo.setProductName("Java编程思想"+i);//商品名称
            productInfo.setSpec("大号");
            productInfo.setPrice(new BigDecimal(60));
            productInfo.setRegionCode("110100");
            productInfo.setDescript("Java编程思想不错！！！"+i);//商品描述
            productService.createProduct(productInfo);
        }
    }

    /**
     * 查询商品
     */
    @Test
    public void testQueryProduct(){
        List<ProductInfo> productInfos = productService.queryProduct(2, 4);
        System.out.println(productInfos);
    }

    /**
     * 统计商品数
     */
    @Test
    public void testSelectCount(){
        int i = productDao.selectCount();
        System.out.println(i);
    }

    @Test
    public void testSelectProductGroupList(){
        List<Map> maps = productDao.selectProductGroupList();

        System.out.println(maps);
    }
}