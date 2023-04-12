public class operator {
    public static void main (String args[]){
        int x = 2 , y = 5 ;
        int exp1 = (x * y /x);
        int exp2 = ( x * (y/x));
     System.out.println(exp1 + " ");
     System.out.println(exp2);

     int a= 200 , b = 50 , c = 100 ;
     if(a>b && b>c){
        System.out.println(" hello");
     }
     if(c>b && c<a){
        System.out.println(" java ");
     }
     if ( ( b+200)<a && (b+150)< c){
        System.out.println(" hello java");
     }

    
    int s,t,u ;
    s = t = u =  2 ;
    s += t;
    t -=  u ;
    u /= (s+t);
   System.out.println( s + " " + t + " " + u);


int p = 9 , q = 12 ;
int  m = 2 , n = 4 ,  o =8;
int exp3 = 4/3 * (p + 34) + 9 * (m+n * o) + (3 + q  * ( 2+m )) / (m + n *q);
 System.out.println(exp3);



int i = 10 , j= 5 ;
int exp4 = (j * (i/j + i/j) );
int exp5 = (j*i/j + j*i/j  );
System.out.println(exp4);
System.out.println(exp5);







    }
    
}
