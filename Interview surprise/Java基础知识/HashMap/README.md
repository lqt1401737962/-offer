# HashMap

## 1. HashMap特性:

​	HashMap存储键值对，实现快速存取数据；允许null键/值；非同步；无序; 实现map接口

## 2. HashMap原理,内部结构:

​	**经典实现是数组加链表**,   				主要有get 和put方法

​	**java1.8后采用数组+红黑树**

## 3.HashMap 中 put 方法过程

1. 对key的hashCode做hash操作，然后再计算在bucket中的index（1.5 HashMap的哈希函数）；
2. 如果没碰撞直接放到bucket里；
3. 如果碰撞了，以链表的形式存在buckets后；
4. 如果节点已经存在就替换old value(保证key的唯一性)
5. 如果bucket满了(超过阈值，阈值=loadfactor*current capacity，load factor默认0.75)，就要resize。

## 4. HashMap中hash函数怎么是是实现的？还有哪些 hash 的实现方式？

1. 对key的hashCode做hash操作（高16bit不变，低16bit和高16bit做了一个异或）； 
2. h & (length-1); //通过位操作得到下标index。

　　还有数字分析法、平方取中法、分段叠加法、 **除留余数法**、 伪随机数法。

## 5.HashMap 怎样解决冲突？

​	链地址法(数组加链表)

## 6.**HashMap和HashTable有何不同？**

- HashMap允许key和value为null，而HashTable不允许。
- HashTable是同步的，而HashMap不是。所以HashMap适合单线程环境，HashTable适合多线程环境。
- 在Java1.4中引入了LinkedHashMap，HashMap的一个子类，假如你想要遍历顺序，你很容易从HashMap转向LinkedHashMap，但是HashTable不是这样的，它的顺序是不可预知的。
- HashMap提供对key的Set进行遍历，因此它是fail-fast的，但HashTable提供对key的Enumeration进行遍历，它不支持fail-fast。
- HashTable被认为是个遗留的类，如果你寻求在迭代的时候修改Map，你应该使用CocurrentHashMap。

