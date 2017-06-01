// create a stub
Object obj = Stub()
obj.isAvailable(_, _) >> true
obj.counts >> 7

// compact way of stubbing
Object obj = Stub() {
  isAvailable(_, _) >> false
  counts >> 7
  isEmpty() >> true
}


/*
* right-shift operator (>>>) with sequential stubs
*/

Object obj = Stub()
obj.isValid(_) >>> true >> false        // first call returns true, second call returns false
obj.isAvailable(_, _) >>> [false, true]    // iterate on a collection for ordered responses: 1st returns false, 2nd returns true
