 package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double Divide(double a, double b) throws IllegalArgumentException{
		if(b != 0.0) {
		double answer = a / b;
		return answer;
		}
		else {
			throw new IllegalArgumentException();			
			}
		}
	
	public static String reverse(String s) throws IllegalArgumentException {
		String reversed = "";
		if(s.equals("")) {
			throw new IllegalArgumentException();
		}
		else {
			for(int i = 0; i < s.length(); i++) {
				reversed += (s.charAt(s.length() - i - 1));
			}
		}
		return reversed;
		
	}
	}

