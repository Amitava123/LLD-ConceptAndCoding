package SOLID_Principles.ISP.Without;

import java.util.List;

public class Waiter implements ResturantEmployee{
    @Override
    public void serveDish() {
        // Function to serve dish to customer
    }

    @Override
    public void takeOrder(List<String> orderList) {
        // Function to take order from customer
    }

    @Override
    public void cookOrder(List<String> orderList) {
        // Not a job of Waiter
    }

    @Override
    public void cleanDishes() {
        // Not a job of Waiter
    }
}
