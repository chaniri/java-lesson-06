package kr.easw.lesson06;

/**
 * 이 클래스는 인터페이스에 대해 좀 더 친숙해지기 위해 구성된 문제입니다.
 *
 * Dog 클래스를 참고하여, Cat과 Horse 클래스가 Animal 인터페이스를 구현하도록 만들어보세요.
 * 이 예제는 일부러 오류가 나도록 설정되어 있으며, Animal을 구현하지 않은 클래스에서는 오류가 발생합니다.
 */
public class ImplementationExample {

    public static void main(String[] args) {
        new Dog().speak();
        new Cat().speak();
        new Horse().speak();
    }

    // 인터페이스는 클래스의 설계도와 비슷한 개념으로, 실질적인 데이터를 가질 수 없으며, 인스턴스를 생성할 수 없습니다.
    // 자바 8 이전에는 인터페이스에서 몸체(body)가 있는 메서드를 사용할 수 없었으나, 자바 8부터는 default 키워드로 몸체가 있는 메서드를 사용할 수 있습니다.
    // 이번 예제에서는 default 메서드는 사용하지 않습니다.
    interface Animal {
        void speak(); // 인터페이스를 상속한 클래스는 이 메서드를 반드시 구현해야 합니다.
    }

    // Dog 클래스는 final로 선언되어 있어 상속할 수 없습니다.
    final static class Dog implements Animal {
        private void bark() {
            System.out.println("Bark!");
        }

        @Override
        public void speak() {
            bark();
        }
    }

    // Cat 클래스도 Animal 인터페이스를 구현합니다.
    static class Cat implements Animal {
        private void meow() {
            System.out.println("Meow!");
        }

        @Override
        public void speak() {
            meow();
        }
    }

    // Horse 클래스도 Animal 인터페이스를 구현합니다.
    static class Horse implements Animal {
        private void neigh() {
            System.out.println("Neigh!");
        }

        @Override
        public void speak() {
            neigh();
        }
    }
}
