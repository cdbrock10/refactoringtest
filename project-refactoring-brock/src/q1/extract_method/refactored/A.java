package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      // other implementation
	  extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
	  extractedMethod(edgeList, p);
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   
   <T extends Graph> void extractedMethod(List<T> objects, String p)
   {
	   	for (T obj : objects)
	   	{
	   		if (obj.contains(p))
	   			System.out.println(obj);
	   	}
	   	//return null; <- This was in the example in the slide but causes errors.
   }
}

class Graph {
	String name;
	boolean contains(String p)
	{
		return name.contains(p);
	}
}

class Node extends Graph{ /*Do something*/ }
class Edge extends Graph{ /*Do something*/ } 

