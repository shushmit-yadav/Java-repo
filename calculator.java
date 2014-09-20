import java.util.Scanner;
class calculator{
  public static void main(String[] args){
    System.out.println("Enter Array Length");
    Scanner scan=new Scanner(System.in);
    int size=scan.nextInt();
    int[] array=new int[];
    System.out.println("Enter the Array Elements");
    for(int i=0;i<size;i++){
      //Enter array
       array[i]=scan.nextInt();  
      }
    System.out.println("Enter the number to search");
    int number = scan.nextInt();
    linearSearch ls=new linearSearch();
   System.out.println(ls.LinearSearch(array,number));
  }  
}