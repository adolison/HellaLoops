package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int a;
        int b;
        String sum = "";
        for (a = 1; a <= 5; ++a) {
            sum = sum +"\"";
            for (b = 1; b <= 5; ++b) {
                sum = sum + " "+ a * b+" "+"|";

                if (b%5==0){
                    sum = sum + "\\n\""+ "\n";
                }
                /*System.out.print(sum);
                if(sum < 10){
                    System.out.print("    ");
                }else if(sum >= 100){
                    System.out.print("  ");
                }else if(sum >= 10){
                    System.out.print("   ");
                }

            }
            System.out.println();*/
            }
        }
        return sum;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
