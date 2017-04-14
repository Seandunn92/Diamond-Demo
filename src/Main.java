public class Main {
    public static final int ourDiamond = 10;
    public static boolean switchTime = false;

    public static void main(String[] args) {
	// write your code here
        DiamondPrint2(10);
        DiamondPrint1(9);

    }

    //bottom half of diamond
    public static void DiamondPrint1(int count){
        if(count<=0)
            return;
        for (int i=0; i<ourDiamond-count; i++ ){
            System.out.print(' ');
        }

        for (int i=0; i< count; i++){
            System.out.print("* ");
        }
        System.out.println();
        DiamondPrint1(count-1);
    }

    //front half of diamond
    public static void DiamondPrint2(int count){
        if(count<=0)
            return;



        DiamondPrint2(count-1);

        for (int i=0; i<ourDiamond-count; i++ ){
            System.out.print(' ');
        }

        for (int i=0; i< count; i++){
            System.out.print("* ");
        }
        System.out.println();

    }

}
