using System;
namespace ACM.BL
{
    public class OrderRepository
    {
        public Order Retrieve(int orderId)
        {
            Order order = new Order(orderId);

            if(orderId == 10) 
            {
                order.OrderDate = new DateTimeOffset(2014, new TimeSpan());
            }

            return order;
        }

        public bool Save()
        {
            return true;
        }
    }
}
