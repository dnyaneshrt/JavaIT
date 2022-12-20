package java8;
//Annonymous inner class.
//is an inner class which does not have name.

//lamda expressions:  Annonymous function
///it is function which does not have name

//we cannot replace annonymous inner class by lamda in all scenario.
//only in case of functional Interface we can replace it.

@FunctionalInterface
interface College
{
   void collegeDetails();
//   void takeAdmission();
    default void takeAdmission()
    {
        System.out.println("i am from admission method" );
    }

}


class JSPM implements College
{
    @Override
    public void collegeDetails() {
        System.out.println(" this is JSPM college");
    }
}


class AISSMS implements College
{
    @Override
    public void collegeDetails() {
        System.out.println(" this is AISSMS college");
    }

}

public class LamdaTest {
    public static void main(String[] args) {
        College c1=new JSPM();
        c1.collegeDetails();
        c1.takeAdmission();

        College c2=new AISSMS();
        c2.collegeDetails();
        c2.takeAdmission();

         College GIT=new College() {
             @Override
             public void collegeDetails() {
                 System.out.println(" i am from GIT college");
             }
         };
         GIT.collegeDetails();

        College ITP=()->{
            System.out.println("i am from ITP college");
        };
        ITP.collegeDetails();

    }
}
