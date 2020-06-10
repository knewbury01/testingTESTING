import testDep.MainClassForDep;

public class MainClassForJar {

    public static void main(String[] args){
	try{
	MainClassForDep.containsMisuse();
	} catch (Exception e) {
	    System.out.println("Uh oh");
	}
    }


    }
