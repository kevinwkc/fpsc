import MyList._
val a = List(1,2,3,4)
a
List.prod[Int](a, 1)(_ * _)
List.sum4[Int](a, 0)(_ + _)
List.prd4[Int](a, 1)(_ * _)
List.len4(a)
val x = List("x","y","z","w","q")
List.len4(x)
List.reverse(a)
List.reverse(x)
List.rev2(x)
List.adder1(a)
List.adder(a)
val z = List(3.14159, 2.718182, 1.4142)
List.double2str(z)
List.map[Int,Int](a)((x) => x+100)
List.filter[Int](a)(x => x>2)
List.filter_1[Int](a)(x => x>2)
val b = List(6,7,8,9)
List.append(a,b)
val A = List(List(1,2,3), List(4,5,6), List(7,8,9))
List.concat(A)
List.concat2(A)
List.flatMap(x)(a => List(a,a))
List.filterViaFlatMap[Int](a)(x => x>2)
List.addPairwise(a,b)
List.zipWith(a,b)((x,y) => y/x)