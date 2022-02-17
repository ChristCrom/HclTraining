package com.hcl.commondatastructure;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipMapTest {

public static void main (String args[])
{
Map<Integer,String>concurrentSkipListMap= new ConcurrentSkipListMap<Integer,String>();
concurrentSkipListMap.put(11,"audi");

Iterator<Integer> keyIterator = concurrentSkipListMap.keySet().iterator();
while (keyIterator.hasNext())
{
System.out.print(keyIterator.next());
concurrentSkipListMap.put(13,"bmw");
}
}

}