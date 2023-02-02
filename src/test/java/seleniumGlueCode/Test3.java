package seleniumGlueCode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Test3 {
    @Given("I have a table with the below values")
    public void i_have_a_table_with_the_below_values(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();
        List<List<String>> myList = dataTable.asLists();
        System.out.println(myList.size());

        System.out.print(myList.get(0).get(0));
        System.out.println(myList.get(0).get(1));

        System.out.print(myList.get(1).get(0));
        System.out.println(myList.get(1).get(1));

        System.out.print(myList.get(2).get(0));
        System.out.println(myList.get(2).get(1));

        System.out.print(myList.get(3).get(0));
        System.out.println(myList.get(3).get(1));
        List<Map<String,String>> listOfMaps= dataTable.asMaps();

        System.out.println(listOfMaps);
        System.out.println(listOfMaps.get(2).get("users"));

    }
    @When("using the data and capturing one {string} integer")
    public void using_the_data_and_capturing_one_integer(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("end of the test")
    public void end_of_the_test() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
