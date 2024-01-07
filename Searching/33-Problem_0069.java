//Leetcode Problem 0069
//Sqrt(x) : https://leetcode.com/problems/sqrtx/



class Solution {
  public int mySqrt(int x) {
      if (x <= 1) {
          return x;
      }

      int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
      int right = left + 1;
      return (long)right * right > x ? left : right;
  }
}

// class Solution {
//   public int mySqrt(long x) {
//       int min = 0;
//       int max = 0;
      
//       if(x<100){
//           min = 0;
//           max = (int)x;
//       }
//       else{
//           long upLimit = reductionOne(x);
//           min = reductionTwo(x, upLimit);
//           max = min*2;
//       }

//       System.out.println("min and max : "+min+" "+max);
//       long i=0;
//       for(i=min; i<=max; i++){
//           if(((long)i*i)==x){
//               return (int)i;
//           }
//           else if(((long)i*i)>x){
//               return (int)i-1;
//           }
//       }
//       return (int)i;
//   }

//   public long reductionOne(long x){
//       int count = 0; int digits; long upLimit=x;
//       if(x==0){
//           count = 1;
//       }
//       for(long i = x; i>0; i/=10){
//           count++;
//       }
//       if(count/2==0){
//           System.out.println("Even");
//           digits = count/2;
//       }
//       else{
//           System.out.println("Odd");
//           digits = count/2+1;
//       }
//       for(int i = 1; i<=count-digits; i++){
//           upLimit/=10;
//       }
//       System.out.println("Upper Limit : "+upLimit);
//       return upLimit;
//   }

//   public int reductionTwo(long x, long upLimit){
//       for(long i=upLimit/10; i<=upLimit; i+=upLimit/10){
//           System.out.println("Red 2 i : "+i);
//           if(i*i>x){
//               System.out.println("min : "+(i-upLimit/10));
//               return (int)(i-upLimit/10);
//           }
//         }
//       System.out.println("max = upLimit : "+upLimit);
//       return (int)upLimit;
//   }
// }