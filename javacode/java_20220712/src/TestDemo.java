import java.util.Arrays;

public class TestDemo {
    public static boolean isUp(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public TestDemo() {
    }

    //    public static void main(String[] args) {
//        int[] arr = {1};
//        System.out.println(isUp(arr));
//        int[][] arr = {{1,2},{1,3}};
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
//        System.out.println("=====");
//        for(int[] tmp: arr) {
//            for(int val: tmp) {
//                System.out.println(val);
//            }
//        }
//        System.out.println("=====");
//        System.out.println(Arrays.deepToString(arr));
//        int[] arr1 = new int[2];
//        for(int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
//    }
    public static void main(String[] args) {
//        Person p = new Person(); // 实例化一个对象
//        System.out.println(p.getM_name());
//        System.out.println(Person.m_addr);
//        System.out.println(p.m_addr);
//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//        Person person4 = new Person();

//        person1.m_age++;
//        person2.m_age++;
//        person3.m_age++;
//        person4.m_age++;
//        System.out.println(person1.toString());
//        new Person().print();
        java.util.Date date = new java.util.Date();
    }
}

class Person {
    public String m_name;
    public int m_age;
    public String m_sex;
    public String m_addr;
    {
        System.out.println("实例代码块");
    }
    static {
        System.out.println("静态代码块");
    }
    Person() {
        m_name = "tom";
        m_age = 10;
        m_sex = "man";
    }
    public void print() {
        System.out.println("helloworld");
    }


    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public int getM_age() {
        return m_age;
    }

    public void setM_age(int m_age) {
        this.m_age = m_age;
    }

    public String getM_sex() {
        return m_sex;
    }

    public void setM_sex(String m_sex) {
        this.m_sex = m_sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "m_name='" + m_name + '\'' +
                ", m_age=" + m_age +
                ", m_sex='" + m_sex + '\'' +
                ", m_addr='" + m_addr + '\'' +
                '}';
    }

    public String getM_addr() {
        return m_addr;
    }

    public void setM_addr(String m_addr) {
        this.m_addr = m_addr;
    }
}
