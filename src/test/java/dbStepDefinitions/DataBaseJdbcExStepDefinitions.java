package dbStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DataBaseJdbcExStepDefinitions {

    @Given("I connect to Koala Resort Hotel database")
    public void i_connect_to_koala_resort_hotel_database() {
        DBUtils.getConnection();

    }

    @Given("I get the records of {string} from {string}")
    public void i_get_the_records_of_from(String table, String columnLabel) {

        String query = "SELECT "+table+" FROM dbo."+columnLabel;
        DBUtils.executeQuery(query);

    }

    @Given("I read the records from {string} column")
    public void i_read_the_records_from_column(String columnLabel) throws SQLException {

        DBUtils.getResultset().first();
        Object columnData = DBUtils.getResultset().getObject(columnLabel).toString();
        System.out.println("column data"+columnData);
    }

    @And("I get the records of {string} column label from {string}")
    public void iGetTheRecordsOfRowColumnLabelFrom(String table, String columnLabel) throws Exception {

        String query = "SELECT "+table+" FROM dbo."+columnLabel;
        DBUtils.executeQuery(query);
    }
    @Then("read and verify that the record of row <{int}> is matching with {string}")
    public void readAndVerifyThatTheRecordOfRowIsMatchingWith(int row, String roomType) throws SQLException {

        DBUtils.getResultset().absolute(row);
        String actual=DBUtils.getResultset().getObject("Price").toString();
        System.out.println(actual);

        Assert.assertEquals(roomType,actual);
    }
}
