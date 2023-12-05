package FLCC;

/*
Jacob Stein
3/6/23
To use a while loop
 */
public class WhileLoopA {
    public static void main(String[] args) {
        useWhile();
    }
    public static void useWhile(){
        System.out.println("BEGIN");
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("END");

    }
}
