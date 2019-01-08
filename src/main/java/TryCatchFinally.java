public class TryCatchFinally {


    public static void main(String[] args) {
        try{
            throw new Exception("Exception Thrown");
        }catch (Exception e){
            System.out.println("Inside Exception Block and raised the below given Exception:");
            System.out.println(e);
        }finally {
            System.out.println("Inside Finally Block");
        }
    }
}