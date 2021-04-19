package th.ac.ku.MillionSquare.service;

import org.springframework.stereotype.Service;
import th.ac.ku.MillionSquare.model.Menu;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    private List<Menu> menuList;

    public void postConstruct(){
        this.menuList = new ArrayList<>();
    }


    public List<Menu> getMenuList(){
        return new ArrayList<>(this.menuList);
    }

}
