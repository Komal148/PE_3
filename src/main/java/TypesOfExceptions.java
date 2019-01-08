public class TypesOfExceptions {
    public int number;
    public static void main(String[] args) {
        try{
            int array[] = new int[-1];
        }catch (NegativeArraySizeException e){
            System.out.println(e);
        }

        try{
            int array[] = new int[10];
            System.out.println(array[10]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try{
            TypesOfExceptions object= new TypesOfExceptions();
            object = null;
            object.number=10;
        }catch (NullPointerException e){
            System.out.println(e);
        }


    }
}