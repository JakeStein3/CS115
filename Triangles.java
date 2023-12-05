package FLCC;

/*
Jacob Stein
1/30/23
To print two triangles
 */
public class Triangles {
    public static void main(String[] args) {

        drawTri(); //Draw first triangle
        System.out.println();
        drawTr(); // Draw second triangle
    
    }

    private static void drawTr() {

        /*
        Using space at an increasing amount
        4 then 3,2,1
         */
        for (int i = 0; i< 3; i++){


        }
        String a = "    #";
        String b = "   ##";
        String c = "  ###";
        String d = " ####";
        String e = "#####";
        for(int i =0; i<1; ++i){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
        }



    }

    public static void drawTri(){
        String a = "#";
        String b = a+ a;
        String c = b +a;
        String d = c + a;
        String e = d + a;
        for(int i =0; i<1; ++i){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
        }

    }

}
/*
Where did you struggle with this coding work?
I did not
What was easy?
Yes, I found it easy
What questions do you still have?
None at the moment
*/
