

1) convert array from arrayList

    list.stream().mapToInt(i -> i).toArray();

2) Declare graph for storing node as array and connection as list

    List<Integer>[] graph=new List[size];
 
 