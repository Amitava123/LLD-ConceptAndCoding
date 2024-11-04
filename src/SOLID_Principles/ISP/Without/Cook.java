package SOLID_Principles.ISP.Without;

import java.util.List;

public class Cook implements ResturantEmployee{
    @Override
    public void serveDish() {
        // Not a job of Cook
    }

    @Override
    public void takeOrder(List<String> orderList) {
        // Not a job of Cook
    }

    @Override
    public void cookOrder(List<String> orderList) {
        // Function to process food items by cook
    }

    @Override
    public void cleanDishes() {
        // Not a job of Cook
    }
}
