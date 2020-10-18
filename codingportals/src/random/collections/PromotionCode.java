package random.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PromotionCode {


    public static void main(String[] args) {
        //   List<List<String>> codeList1 = new ArrayList<>(Arrays.asList(Arrays.asList("apple", "apple"), Arrays.asList("banana", "anything", "banana")));
        //   List<String> shoppingList1 = new ArrayList<String>(Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana"));

        //    System.out.println("Result1 = " + isCustomerWinner(shoppingList1, codeList1));

        /// List<List<String>> codeList2 = new ArrayList<>(Arrays.asList(Arrays.asList("apple", "apple"), Arrays.asList("banana", "anything", "banana")));
        //   List<String> shoppingList2 = new ArrayList<String>(Arrays.asList("apple", "apple", "orange", "orange", "banana", "apple", "banana", "banana"));

        //   System.out.println("Result2 = " + isCustomerWinner(shoppingList2, codeList2));

        List<List<String>> codeList3 = new ArrayList<>(Arrays.asList(Arrays.asList("apple", "apple"), Arrays.asList("banana", "anything", "banana")));
        List<String> shoppingList3 = new ArrayList<String>(Arrays.asList("banana", "orange", "banana", "apple", "apple"));

        System.out.println("Result3 = " + isCustomerWinner(shoppingList3, codeList3));

      /*    List<List<String>> codeList4 = new ArrayList<>(Arrays.asList(Arrays.asList("apple", "apple"), Arrays.asList("banana", "anything", "banana")));
        List<String> shoppingList4 = new ArrayList<String>(Arrays.asList("apple", "banana", "apple", "banana", "orange", "banana"));

        System.out.println("Result4 = " + isCustomerWinner(shoppingList4, codeList4));

        List<List<String>> codeList5 = new ArrayList<>(Arrays.asList(Arrays.asList("apple", "apple"), Arrays.asList("apple", "apple", "banana")));
        List<String> shoppingList5 = new ArrayList<String>(Arrays.asList("apple", "apple", "apple", "banana"));

        System.out.println("Result5 = " + isCustomerWinner(shoppingList5, codeList5));

        List<List<String>> codeList6 = new ArrayList<>(Arrays.asList(Arrays.asList("apple", "anything"), Arrays.asList("anything", "anything", "banana")));
        List<String> shoppingList6 = new ArrayList<String>(Arrays.asList("apple", "apple", "orange", "banana", "orange", "banana"));

        System.out.println("Result6 = " + isCustomerWinner(shoppingList6, codeList6));*/
    }


    public static int isCustomerWinner(List<String> shoppingList, List<List<String>> codeLists) {

        if (codeLists == null || codeLists.isEmpty()) {
            return 1;
        }

        if (shoppingList == null || shoppingList.isEmpty()) {
            return 0;
        }

        int codeList = 0, code = 0;
        int shoppingItem = 0;

        while (codeList < codeLists.size() && shoppingItem < shoppingList.size()) {

            List<String> currentList = codeLists.get(codeList);
            while (code < currentList.size() && shoppingItem < shoppingList.size()) {

                System.out.println(" shoppingItem " + shoppingItem + " code " + code);
                if (shoppingList.get(shoppingItem).equals(currentList.get(code)) || currentList.get(code).equals("anything")) {
                    code++;
                }

                shoppingItem++;
            }


            if (code < currentList.size())
                return 0;

            codeList++;
            code = 0;

        }

        if (codeList == codeLists.size())
            return 1;

        return 0;
    }


}

