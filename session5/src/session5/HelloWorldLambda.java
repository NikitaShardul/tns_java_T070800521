package session5;

public class HelloWorldLambda {
       public static void main(String[] args) {
		HelloWorldInterface h = () -> "Hello, I am Nikita!!";
		System.out.println(h.sayHelloWorld());
		
		IncByFourInterface i = (x) -> {
			return x + 4;
		};
		System.out.println("Increment By Four = "+ i.IncByFour(45));
		
		ConcatenateInterface c = (a,b) -> 
		System.out.println(a.concat(b));
		c.strConcat("Nikita", " Shardul" );
	}
}
