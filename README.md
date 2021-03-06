# Collection_Java
Java集合类介绍  
===
HashMap  
---
* HashMap 是基于哈希表的 Map 接口的非同步实现。此实现提供所有可选的映射操作，并允许使用 null 值和 null 键。此类不保证映射的顺序，特别是它不保证该顺序恒久不变。  
* Hashmap 不是同步的，如果多个线程同时访问一个 HashMap，而其中至少一个线程从结构上（指添加或者删除一个或多个映射关系的任何操作）修改了，则必须保持外部同步，以防止对映射进行意外的非同步访问。 
* HashMap 就是通过这两个数据结构进行实现。HashMap实际上是一个“链表散列”的数据结构，即数组和链表的结合体。  
[代码](https://github.com/fengjiqiang/Collection_Java/blob/master/HashMap.java)解释：  
* 实现散列表需要的方法，初始化、设置key-value、删除key、通过key获取value、获取散列表元素个数。  
* 内部方法：对key的hash算法、空间扩容等。  
* 使用泛型实现。实现了判断是否为空、是否包含指定key，以及清空散列表的方法。  
* 在Java实现中，HashTable是线程安全的散列表，而普通的散列表是HashMap。  
* 需要Entry这个类作为一个存储元素。
