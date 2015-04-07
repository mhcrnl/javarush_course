package com.javarush.test.level13.lesson11.bonus02;

<<<<<<< HEAD
public class Person
{
    private String name;
    private String namePadezh;

=======
public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;
    public String getNamePadezh(){
        return namePadezh;
    }
>>>>>>> 94bc308cbb890562561fdb13906956b26bfd92aa
    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }
<<<<<<< HEAD
=======
    public void pull(Person person){
        System.out.println(this.name+ " за "+person.namePadezh);
    }
>>>>>>> 94bc308cbb890562561fdb13906956b26bfd92aa
}
