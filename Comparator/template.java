import java.util.*;

class Student
{
    String name;
    int age;
    Student(String n, int a)
    {
        name = n;
        age = a;
    }
}

class check implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        if(a.age!=b.age)
        {
            return a.age - b.age;
        }
        else
        {
            return a.name.compareTo(b.name);
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("arya",17));
        arr.add(new Student("bhavya",12));
        arr.add(new Student("bhavin",12));
        arr.add(new Student("arya",15));
        Collections.sort(arr,new check());
        for(Student a : arr)
        {
            System.out.println(a.name+","+a.age);
        }
        
    }
}

/*
bhavin,12
bhavya,12
arya,15
arya,17
*/
