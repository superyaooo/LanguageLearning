// VERIFY method calls for mocks
/*
* I do not care how many times the test() method is called
* but I expect the mocked behavior when the method is called
*/

_ * sample.test() >> mock behavior



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
