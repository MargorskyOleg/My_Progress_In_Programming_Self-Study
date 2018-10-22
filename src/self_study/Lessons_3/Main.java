package self_study.Lessons_3;

public class Main {
    public static void main(String[] args) {

        int w = 5;
        int h = 2;
        int a = computeArea(w,h);
        System.out.println("Area is " + a);
        //Area is 10
    }

    public static int computeArea(int width, int height){
        int area;
        area = width * height;
        return area;
    }







//        System.nanoTime();
//        int arr[] = new int[];

//        int[] arr = {3,5,1,2,4,7,6,9,0,8};
//        int i = +1;
//        int a = arr[i];
//        int b = arr[i+1];

//        for (int i = 0;i < arr.length;i++){
//
//        }

//        swap(a,b);
//    }

    public static boolean swap(int a, int b){
        if(a > b){
            int t = b;
            b = a;
            a = t;
            return true;
        }else {
            return false;
        }
    }

}