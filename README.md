设计模式--JAVA写一个常用典型的单例模式类

单例模式，是一种常用的软件设计模式。在它的核心结构中只包含一个被称为单例的特殊类。通过单例模式可以保证系统中，确保某个类只有一个实例.
而且自行实例化并向整个系统提供这个实例。在计算机系统中，线程池、缓存、日志对象等常被设计成单例。

此实现是现成安全的，JVM加载此类是，对于static属性的初始化只能由一个线程执行且仅一次。
