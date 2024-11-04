package SOLID_Principles.ISP.With;

import java.util.List;

public interface ResturantWaiter {
    public void serveDish();
    public void takeOrder(List<String> orderList);
}
