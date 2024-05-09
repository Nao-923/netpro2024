class Renshu {

    void printHello(){
      System.out.println("Hello World");
    }
    void printHello2(){
      for(int i = 0; i < 2;i++){
        printHello();
      }
    }
    void printHellos(int n){
      for(int i = 0; i < n;i++){
        printHello();
      }
    }
    void calc1(int x){
      if(x<10){
        System.out.println("small number");
      }
    }
    int calc2(int x){
      return x *2;
    }
    float calc3(float x){
      return x * 2;
    }
    int calc4(int x,int y){
      return (x + y)*2;
    }
    int calc5(int x,int y,int z){
      return (x+y+z)*2;
    }
    int sum(int n){
      int sum = 0;
      for(int i = 1; i <= n; i++){
        sum = sum +i;
      }
      return sum;
    }
    int sum(int p,int q){
      int sum = 0;
      for(int i = p; i <= q; i++){
        sum = sum + i;
      }
      return sum;
    }
    int sum(int[] a,int index){
      int sum = 0;
      if(0 <= index && index < a.length){
        for(int i = index;i<a.length;i++){
          sum = sum + a[i];
        }
        return sum;
      } else {
        System.err.println("Index Error!");
        return -1;
      }
    }
    int selectMaxValue(int[] a){
      int max = 0;
      for(int i = 0;i < a.length;i++){
        if(max<a[i]){
          max = a[i];
        }
      }
      return max;
    }
    int selectMaxIndex(int[] a){
      int number = 0;
      int max = selectMaxValue(a);
      for(int i = 0;i < a.length;i++){
        if(a[i] == max){
          number = i;
        }
      }
      return number;
    }
    int selectMinValue(int[] a){
      int min = 0;
      for(int i = 0;i < a.length;i++){
        if(min>a[i]){
          min = a[i];
        }
      }
      return min;
    }
    int selectMinIndex(int[] a){
      int number = 0;
      int min = selectMinValue(a);
      for(int i = 0;i < a.length;i++){
        if(a[i] == min){
          number = i;
        }
      }
      return number;
    }
    int selectDiffMaxMinValue(int[] p){
      int max = selectMaxValue(p);
      int min = selectMinValue(p);
      return max -min;
    }

    void swapArrayElements(int[] p,int i,int j){
      int ni = p[i];
      int nj = p[j];
      p[j] = ni;
      p[i] = nj;
    }
    int selectMaxIndex(int[] a,int i,int j){
      int max = 0;
      for (int  p = i; p < j; p++){
        if(max<a[p]){
          max = a[p];
        }
      }
      int number = 0;
      for (int  p = i; p < j; p++){
        if(max == a[p]){
          number = p;
        }
      }
     return number; 
    }
    boolean swapTwoArrays(int[] a,int[] b){
      if(a.length == b.length){
        int[] backUpA = a;
        int[] backUpB = b;
        System.out.println(a = b);
        System.out.println(b = backUpA);
        return true;
      } else {
        return false;
      }
    }

}