package Unit4Day13.Question1;


    import java.util.function.Predicate;

public class CheckTest implements Predicate<Integer> {
 
	    @Override
	    public boolean test(Integer t) {
	         	
	    	 return t%2==0;
	    	
	    }
	    
	    

}

