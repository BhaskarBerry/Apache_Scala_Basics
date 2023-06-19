var count = 0

// The last statement is returned as a function so count is incremented only one
// during the creation of the function
List(1,2,3,4,5).map{count += 1; _ + 1}

count

// Now the count increment is within the function
List(1,2,3,4,5).map{i=>count += 1; i+ 1}
count

//The previous example demonstrates a Gotcha if I ever saw one.
// Map expects a function so the block essentially constructs a function.
// The last statement being the function.
// The first line count += 1 executed only once because it is part of creating the function not part of the resulting
// function. This is equivalent to:

val x  = {count += 1; i : Int => i+ 1}
List(1,2,3,4,5).map(x)

//Beginning a block with the parameter list signals that the entire block is a function.
//Rule of thumb: Functions with placeholder parameters should be a single statement

//I think I found a place where it makes sense:
List(5,6,7,8).map{var num = 0; i:Int=> {num = num+1; num.toString + "_" + i}}
//I'm using the part that is executed only once to do some initialization,
// and the rest of the block (the function) is executed once per element in the list, using the initialized values.
