package ch07.lecture.p07sealed;

public class C02Sealed {

}

sealed class Super02 permits Sub021 {

}

sealed class Sub021 extends Super02 permits Sub022 {
}

final class Sub022 extends Sub021 {
}