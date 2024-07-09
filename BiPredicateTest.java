import java.util.function.BiPredicate;
public class BiPredicateTest {
	public static <T>void resultBi(BiPredicate<T,T> biP, T arg1, T arg2) {
		if(biP.test(arg1, arg2)) {
			System.out.printf("The BiPredicate is true for values %S and %S\n", arg1, arg2);
		}
		else {
			System.out.printf("The BiPredicate is false for values %S and %S\n", arg1, arg2);
		}
	}

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPred = (int1, int2)-> (int1>2);
	
		for(Integer x =1;x<5;x++) {
			for(Integer y =1;y<5;y++){
				BiPredicate<Integer,Integer> biPred1 =(int1,int2)->int2<int1;
				BiPredicate<Integer,Integer> biPred2= biPred.and(biPred1);
				resultBi(biPred2.negate(),x,y);
			}
		}
	}

}
