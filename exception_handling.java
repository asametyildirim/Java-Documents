public class Main {

    public static void main(String[] args) {

        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[8]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (Exception exception){
            System.out.println(exception);
        }


        finally {
            System.out.println("I run in any way");
        }
    }
}
