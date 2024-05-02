package kr.easw.lesson06;

/**
 * 이 클래스는 추상 클래스에 대한 이해를 돕기 위해 만들어졌습니다.
 *
 * Vehicle 클래스를 참고하여 Car, Bicycle, Motorcycle 클래스를 구현하세요.
 * 이 예제는 일부러 오류가 나도록 설정되어 있으며, Vehicle을 상속하지 않은 클래스에서는 오류가 발생합니다.
 */
public class AbstractionExample {

    public static void main(String[] args) {
        new Car("Car").run();
        new Bicycle("Bicycle").run();
        new Motorcycle("Motorcycle").run();
    }

    // 추상 클래스는 인터페이스와 유사하지만, 인터페이스와 달리 변수를 가질 수 있고,
    // 자바 8 이후로는 인터페이스도 default 키워드를 사용하여 메서드에 몸체를 구현할 수 있습니다.
    // 추상 클래스는 일반 클래스와 비슷하지만 추상 메서드(abstract)를 포함할 수 있으며, 인스턴스를 직접 생성할 수 없습니다.
    //
    // abstract 키워드는 해당 메서드가 구현부가 없음을 명시하며, 이 메서드는 상속받는 클래스에서 반드시 구현되어야 합니다.
    // 상속받는 클래스가 추상 클래스인 경우에는 이 메서드를 구현하도록 강제되지 않습니다.
    abstract static class Vehicle {
        private final String name;

        public Vehicle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void run();
    }

    static class Car extends Vehicle {
        public Car(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Car is running!");
        }
    }

    static class Bicycle extends Vehicle {
        public Bicycle(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Bicycle is running!");
        }
    }

    static class Motorcycle extends Vehicle {
        public Motorcycle(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Motorcycle is running!");
        }
    }
}
