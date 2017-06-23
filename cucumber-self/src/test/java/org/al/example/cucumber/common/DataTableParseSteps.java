package org.al.example.cucumber.common;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import org.al.example.service.LogUtility;

import java.util.List;

public class DataTableParseSteps {

    public DataTableParseSteps() {

    }


    @Given("^User sends first POST airSearchRQ rest request with following parameters$")
        public void sendPostRestRequestWithParameters(DataTable dataTable) {

//            cells(dataTable, 1, 0, 4);
            parseAll(dataTable);
        }

    private void parseAll(DataTable dataTable) {
        LogUtility.logInfo("parseAll() method");
        for(int i=0; i<dataTable.topCells().size(); i++) {
            String paramName = dataTable.topCells().get(i);
            String paramValue = dataTable.cells(1).get(0).get(i);
            LogUtility.logInfo("paramName: " + paramName + " : " + " paramValue: " + paramValue);
//            System.out.println(paramName + " :: " + paramValue);
        }

    }

    private void cells(DataTable dataTable, int firstRow, int lineNumber, int cellNumber) {
        String element = dataTable.cells(firstRow).get(lineNumber).get(cellNumber);
            System.out.println(element);

        }

        private void topCells(DataTable dataTable) {
            List<String> list = dataTable.topCells();
            list.forEach(element -> System.out.println(element + ":"));
        }

}
