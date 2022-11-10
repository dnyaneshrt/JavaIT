package exception;

//create a class as Child class of java.lang.Exception class.
//pass exception message to  super(); to Parent class constructor.
public class InvalidCredentialsException extends Exception {
    InvalidCredentialsException()
    {
        super("Enter Valid Credentials");//is used pass parameters to parent class constrctor
    }

}
