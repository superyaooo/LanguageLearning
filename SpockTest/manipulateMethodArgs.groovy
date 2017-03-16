// manipulate method args - call method on args and pass mock data

1 * object.action(arg1, arg2) >> {arg1, arg2 -> arg2.setStatus(200)}