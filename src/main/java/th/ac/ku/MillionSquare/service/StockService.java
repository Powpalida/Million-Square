//package th.ac.ku.MillionSquare.service;
//
//import org.springframework.stereotype.Service;
//import th.ac.ku.MillionSquare.model.Menu;
//import th.ac.ku.MillionSquare.model.Stock;
//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class StockService {
//
//    private List<Stock> stockList;
//
//    @PostConstruct
//    public void postConstruct(){
//        this.stockList=new ArrayList<>();
//    }
//
//    public void createProduct(Stock product){
//        stockList.add(product);
//    }
//
//    public  Stock findProduct(int id){
//        for (Stock bankAccount : stockList){
//            if (bankAccount.getProductId() == id)
//                return bankAccount;
//        }
//        return null;
//    }
//
//    //checkId
//    public  Stock checkId(Stock inputProductId){
//        //หา product ที่มี id ตรงก่อน
//        Stock storedProduct = findProduct(inputProductId.getProductId());
//
//        if (storedProduct != null){
//            return  storedProduct;
//        }
//        return null;
//    }
//
//
//    public List<Stock> getProductList(){
//        return new ArrayList<>(this.stockList);
//    }
//
//
//
//}
