//Fibonacci Sequence


private static int index = 0;  
private static int stoppingPoint = 40;  
  
public static void main (String[] args) {  
  int n1 = 0;  
  int n2 = 1;  
  System.out.println("index: " + index + " -> " +n1);  
  fibonacciSequence(n1, n2);  
}  
  
public static void fibonacciSequence(int n1, int n2) {  
  System.out.println("index: " + index + " -> " +n2);  
    
  // basecase  
  if (index == stoppingPoint)  
    return;  

  index++;  
    
  fibonacciSequence(n2, n1+n2);  
}  

//monopoly roll original

public int randomInt() {
	double number = Math.random() * 6;
	number = number + 1;
	return (int) number;
}

public int monopolyRoll() {
	int firstRole = randomInt();
	int secondRole = randomInt();
	int sum = firstRole + secondRole;

	if (firstRole == secondRole) {
		int thirdRole = randomInt();
		int fourthRole = randomInt();
		sum = sum + thirdRole + fourthRole
	}
	return sum
}

//monopoly dice role recursive
public int randomInt() {
	double number = Math.random() * 6;
	number = number + 1;
	return (int) number;
}

	int firstRole = randomInt();
	int secondRole = randomInt();
	int sum = firstRole + secondRole;

//recursive function
public int monopolyRecursiveRoll() {
	int firstRole = randomInt();
	int secondRole = randomInt();
	int sum = firstRole + secondRole;

	System.out.println("roll total: "+ sum)
	if (firstRole == secondRole)
		return sum;
	}
	monopolyRecursiveRoll()
}







