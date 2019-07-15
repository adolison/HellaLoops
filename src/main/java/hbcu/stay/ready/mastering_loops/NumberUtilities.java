package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        //int i = 0;
        //while (i%2=0)
        String ans = "";

        for (int i=start; i<stop; i++){
            if ((i & 1)==0) {
                ans = ans + i;
            }
        }
        return ans;
    }


    public static String getOddNumbers(int start, int stop) {
        String ans = "";
        for (int i=start; i<stop; i++){
            if ((i & 1)==1) {
                ans = ans + i;
            }
        }
        return ans;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String ans = "";
        for (int i=start; i<stop;i+=step){
            int square = i*i;
            ans=ans+square;
        }
        return ans;
    }

    public static String getRange(int stop) {
       // for (int i=0;i)
        String ans = "";
        for (int i=0; i<stop; i++){
            ans=ans+i;
        }
        return ans;
    }

    public static String getRange(int start, int stop) {
        String ans = "";
        for (int i=start; i<stop; i++){
            ans=ans+i;
        }
        return ans;
    }


    public static String getRange(int start, int stop, int step) {
        String ans = "";
        for (int i=start; i<stop;i+=step){
            ans=ans+i;
        }
        return ans;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String ans = "";
        for (int i=start; i<stop;i+=step){
            int square = (int)Math.pow(i,exponent);
            //int square = i^exponent;
            ans=ans+square;
        }
        return ans;
    }
}
