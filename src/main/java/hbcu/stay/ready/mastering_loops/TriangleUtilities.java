package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        return null;
    }

    public static String getRow(int width) {
        String ans= "";
        //int width =20;
        for (int i = 0; i<width; i++){
            ans = ans+"*";
        }
        return ans;
    }

    public static String getSmallTriangle() {
        /*String ans= "";
        //int numberOfRows
        for (int i=0;i<10;i++){
            ans += ans+"*";
            ans += ans+ "" + (int)(i*"*")
        }*/
        return null;
    }

    public static String getLargeTriangle() {

        //String ans= "";
        /*for (int i=1;i<5;i++){
            ans = ans+"*";
        }
        return ans;*/
         String ans= "";
        String numOfStars = "";

        for (int i=0;i<8;i++) {
            numOfStars = numOfStars +"\"";
            for (int j = 0; j <= i; j++){
                //numOfStars = numOfStars +"\"";
                numOfStars =numOfStars + "*";
            //int numOfStars = string;
            //ans = ans + i*"*";
            }
            //for (int k =0;k<i;k++){

                numOfStars = numOfStars + "\\n" + "\"" +" +" +"\n";
               // ans =

        }
        numOfStars.split("/+");
        return numOfStars;
    }
}
