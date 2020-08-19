
public class Recursion {
	
   static char chars[] = new char[] { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };

	public static void main(String[] args) {

		
		System.out.println(convert(9098,20,0,""));
		System.out.println(convert(692,2,0,""));
		System.out.println(convert(753,16,0,""));


	}



    public static String convert ( int num, int base, int pos, String result )
    {
        if ( num < Math.pow(base, pos + 1) )
        {
            return chars[(num / (int)Math.pow(base, pos))] + result;
        }
        else
        {
            int remainder = (num % (int)Math.pow(base, pos + 1));
            return convert (  num - remainder, base, pos + 1, chars[remainder / (int)( Math.pow(base, pos) )] + result );
        }
    }
}