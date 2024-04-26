import java.util.Arrays;

class FlippingImage {
    public static void main(String[] args) {
        int[][]arrImg = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arrImg);
        for (int[]row:arrImg) {
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++) {
            flipHorizontal(image,i,0,image[i].length-1);
        }
        return image;

    }
    static void flipHorizontal(int[][]arr,int i,int jStart,int jEnd) {
        while(jStart<=jEnd){
            int temp = arr[i][jStart]^1;
            arr[i][jStart] = arr[i][jEnd]^1;
            arr[i][jEnd] = temp;
            jStart++;
            jEnd--;
        }

    }
}