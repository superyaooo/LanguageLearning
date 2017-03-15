/* 
 * exception handling in Spock test 
 */


// as returned 
1 * object.action(_) >> { throw new ExceptionName()}
		
		
// when exception is expected to be thrown
def "test Constructor(#message, #throwable)"() {
	given:
	Throwable tr = Mock()

	when:
	Class exp = new Class("test", tr)

	then:
	Exception e = thrown(RuntimeException)
	e.message == "This constructor cannot be called"
	0 * tr._
}


// catch exception thrown
then:
1 * object.action(_) >> {throw new ExceptionName()}

then:
Throwable t = thrown()