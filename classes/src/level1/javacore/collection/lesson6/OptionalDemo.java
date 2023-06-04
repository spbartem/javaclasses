package level1.javacore.collection.lesson6;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String name = "Артём";

        Optional<String> nameOptional = Optional.ofNullable(name);

        System.out.println("Is container empty? " + nameOptional.isEmpty());

        nameOptional.ifPresent(myName -> System.out.println("Container isn't empty, content = " + myName));
        //если содержимое контейнера не пусто, то выведи значение
        //myName -> System.out.println("Container isn't empty, content = " + myName) - это lambda

        //nameOptional.get();
        //если нет данных, get() кинет исключение

        System.out.println("Content from optional: " + nameOptional.orElseGet(() -> "no name"));

        nameOptional
                .filter(myName -> myName.equals("Артём")) //хотим пойти дальше по нашему коду, если container содержит имя Артём
                .map(String::length)
                .ifPresent(length -> System.out.println("Hi, Artyom! Name contains " + length + " letters"));

//ofnullable
//isempty
//ispresent
//ifpresent
//get
//orelse
//orelseget
//filter
//map
    }
}
