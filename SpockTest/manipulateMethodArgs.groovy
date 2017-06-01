// manipulate method args - call method on args and pass mock data
1 * object.action(arg1, arg2) >> {arg1, arg2 -> arg2.setStatus(200)}


// VERIFY arguments - original: 1 * creditCardSevice.sale(1550, customer)
/*
* part of an object instance is used as mock argument
*/
1 * creditCardSevice.sale(1550, { client -> client.vip == false})

/*
* use full closures
*/
1 * creditCardSevice.sale({amount -> amount == basket.findOrderPrice()}, { client -> client.vip == false})


// use closure in Stubs
ShippingCalculator ShippingCalculator = Stub()
ShippingCalculator.findShippingCostFor(_, _) >> { Product Product, int count -> product.weight==0 ? 0 : 10*count }
