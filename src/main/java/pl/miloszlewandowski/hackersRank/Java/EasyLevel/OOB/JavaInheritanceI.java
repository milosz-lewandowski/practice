package pl.miloszlewandowski.hackersRank.Java.EasyLevel.OOB;

public class JavaInheritanceI {
}
    class Animal{
        void walk()
        {
            System.out.println("I am walking");
        }
    }
    class Bird extends Animal
    {
        void fly()
        {
            System.out.println("I am flying");
        }

        void sing()
        {
            System.out.println("I am singing");
        }
    }

    class Solution2{

        public static void main(String args[]){

            Bird bird = new Bird();
            bird.walk();
            bird.fly();
            bird.sing();

        }
    }

