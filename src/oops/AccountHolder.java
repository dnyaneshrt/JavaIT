package oops;

//we cannot create object for abstract class
//we cannot create object for interface
//inner class means defining one class inside anather class.
//Annonymous inner class means, the inner class which does not have name.
//empty interface is called as marker interface. eg. Serializable,Cloneable
//if an interface is having only one abstract method is called as functional interface.
//functional interfaces we can implement by using lamda expressions. (java 8 faetures.)
//lamda expression is java 8 feature to reduce length of code and provide functional programmings
interface Bank
{
  void provideLoanInfo();
}
class Axis implements Bank
{
    @Override
    public void provideLoanInfo() {
        System.out.println("Axis bank provides loan @10.00 ROI");
    }
}

class SBI implements Bank
{

    @Override
    public void provideLoanInfo() {
        System.out.println("SBI bank provides loan @8.5 ROI");
    }
}

public class AccountHolder {
    public void applyLoan(Bank bank)
    {
        bank.provideLoanInfo();
    }
    public static void main(String[] args) {
        AccountHolder vaibhav=new AccountHolder();//object creation
        vaibhav.applyLoan(new Axis());//calling method
        vaibhav.applyLoan(new SBI());
        //Parent p=new Child();

        //Annonymous inner class
        vaibhav.applyLoan(new Bank(){
            @Override
            public void provideLoanInfo() {
                System.out.println("PNB bank provides loan @9.5 ROI");
            }
        });

        vaibhav.applyLoan(()->{
            System.out.println("Fino bank provides loan @12.5 ROI");
        });
        Bank hdfc=new Bank(){

            @Override
            public void provideLoanInfo() {
                System.out.println("HDFC bank provides loan @7.5 ROI");
            }
        };
        hdfc.provideLoanInfo();

        Bank hsbc=()-> {
                System.out.println("HSBC bank provides loan @8.9 ROI");
        };
        hsbc.provideLoanInfo();
    }
}
