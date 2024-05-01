Streams: 

There are two types of operations: 

1. Intermediate: Operations that are applied to a stream and returns a new stream.
                 Used for processing and transforming information from the elements provided. 
                 These are lazy operations. Meaning, they don't process until a terminal operation is invoked. 
                 Examples -> map(), filter(), sorted(), distinct() returns Stream<T>

2. Terminal: Operations that consume the stream and produce an output.
             Once terminal operation is invoked. Stream cannot be reused. 
             Examples -> forEach(), findAny(), FindFirst(), reduce(), anyMatch(), noneMatch() //returns void, Object but not stream.