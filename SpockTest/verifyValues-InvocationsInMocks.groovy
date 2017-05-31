// VERIFY method calls for mocks
/*
* I don’t care about the arguments passed in to the 
* isAvailable() method; but I expect it to return "true"
*/

2 * sample.isAvailable(_, _) >> true


/*
* I do not care how many times the test() method is called
* but I expect the mocked behavior when the method is called
*/

_ * sample.test() >> mock behavior


// VERIFY non-interactions for mocks
/*
* I expect zero invocations for all other methods of 
* the sample class.
*/

0 * sample._


/* 
* I expect zero invocations for all other methods of all other classes 
* when the test runs.
*/

0 * _


// VERIFY types of arguments for mocks
/* 
* arguments aren't null 
*/

2 * sample.isAvailable(!null ,1) >> true


/*
* argument types
*/

2 * sample.isAvailable(_ as String, _ as Integer) >> false


// VERIFY arguments - original: 1 * creditCardSevice.sale(1550, customer)
/*
* part of an object instance is used as mock argument
*/

1 * creditCardSevice.sale(1550, { client -> client.vip == false})


/*
* use full closures
*/

1 * creditCardSevice.sale({amount -> amount == basket.findOrderPrice()}, { client -> client.vip == false})