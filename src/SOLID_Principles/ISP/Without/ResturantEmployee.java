package SOLID_Principles.ISP.Without;

import java.util.List;

public interface ResturantEmployee {
    void serveDish();
    void takeOrder(List<String> orderList);
    void cookOrder(List<String> orderList);
    void cleanDishes();
}
