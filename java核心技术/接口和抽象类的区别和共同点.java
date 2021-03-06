
1.概念：

	--抽象类概念：抽象类是对一种事物的抽象，即对类抽。.抽象类是对整个类整体进行抽象，包括属性、行为。Java抽象类和Java接口一样，
		都用来声明一个新的类型。并且作为一个类型的等级结构的起点。
	--接口概念：接口是对行为的抽象。接口是对类局部（行为）进行抽象。

2.抽象类和接口的相同点：

	--都不能被实例化

	--接口的实现类或抽象类的子类都只有实现了接口或抽象类中的方法后才能被实例化


3.不同点：

	--接口只有定义，其方法不能再接口中实现，只有实现接口的类才能实现接口中定义的方法，而抽象类的方法可以再抽象类中被实现。

	--接口需要用implements实现,抽象类只能被继承（extends）。

	--设计理念不同，接口是"has - a "，抽象类是"is -a "

	--接口中定义的成员变量默认修饰符为public static final（静态不能被修改），而且必须给其赋初值。抽象类可以有自己的数据成员变量，
		也可以有非抽象的成员变量，而且抽象类中的成员变量默认为default(本包可见)。抽象类中的方法前面有abstract修饰，不能用private、
		static、synchronize、native修饰，同时方法必须以分号结尾，不带花括号。