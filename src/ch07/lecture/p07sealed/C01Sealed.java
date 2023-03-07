package ch07.lecture.p07sealed;

public class C01Sealed {
	

}

sealed class Super01 permits Sub011, Sub012{
	
}

final class Sub011 extends Super01{}

final class Sub012 extends Super01{}
