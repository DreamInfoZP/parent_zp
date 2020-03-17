package com.zp.objects.lambda.example02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhoupeng
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] arr = {new Person("柳岩", 38),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 28)};

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });


        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        Arrays.sort(arr, (Comparator.comparingInt(Person::getAge)));


        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
