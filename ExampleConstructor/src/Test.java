
public class Test {
	public static void main(String args[]) {
		
		System.out.println("Example Constructor Chaining");
		
		Dog dog1 = new Dog();
		
	}
}

abstract class Animal {
	Animal() {
		System.out.println("Making a Animal");
	}
}

class Canine extends Animal {
	Canine() {
		System.out.println("Making a Canine");
		System.out.println("......");
	}
}

class Dog extends Canine {
	Dog() {
		System.out.println("Making a Dog");
	}
}