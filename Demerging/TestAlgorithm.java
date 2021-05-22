package Demerging;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestAlgorithm {
    public static void main(String[] args) {
        Queue <Person> nam = new LinkedList<>();
        Queue <Person> nu = new LinkedList<>();
        ArrayList<Person> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng người:");
        int size = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i<size;i++){
            System.out.println("nhập tên:");
            String name = sc.nextLine();
            System.out.println("nhập giới tính nam or nữ");
            String gender = sc.nextLine();
            System.out.println("nhập tuổi:");
            int age = sc.nextInt();
            sc.nextLine();
            arrayList.add(new Person(name,gender,age));
        }
        System.out.println("trước sắp xếp");
        System.out.println(arrayList);
        ArrayList<Person> newArr = new ArrayList<>();
       for (Person person : arrayList){
           if (person.getGender().equals("nam")){
               nam.add(person);
           }else {
               nu.add(person);
           }
       }
       while (!nu.isEmpty()){
           newArr.add(nu.poll());
       }
       while (!nam.isEmpty()){
           newArr.add(nam.poll());
       }
        System.out.println("Sau khi sắp xếp:");
        System.out.println(newArr);
    }
}
