package th.ac.ku.MillionSquare.service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import th.ac.ku.MillionSquare.model.Stock;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StockService {
    private RestTemplate restTemplate;


    public StockService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    //ของ BankAccount ทั้งหมด
    public List<Stock> getAllStock(){
        String url = "http://localhost:8091/api/stock/";

        ResponseEntity<Stock[]> response =
                restTemplate.getForEntity(url,Stock[].class); //การ get ที่ไปต่อกับ API
        Stock[] accounts = response.getBody();
        return Arrays.asList(accounts);
    }

    public void openStockPage(Stock stock){
        String url = "http://localhost:8091/api/stock";

        restTemplate.postForObject(url,stock,Stock.class);
    }

    public Stock getStock(int id){
        String url = "http://localhost:8091/api/stock/" + id;
        ResponseEntity<Stock> response =
                restTemplate.getForEntity(url,Stock.class);
        return response.getBody();

    }

    public void editStock(Stock stock,int id){
        String url = "http://localhost:8091/api/stock/" + id;
        System.out.println(id);
        restTemplate.put(url,stock);
    }
    public void deleteStock(Stock stock,int id){
        String url = "http://localhost:8091/api/stock/" + id;
        restTemplate.delete(url,stock);
    }

}
