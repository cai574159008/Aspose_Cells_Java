/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithrowsandcolumns.deletingrowsandcolumns.java;

import com.aspose.cells.*;

public class DeletingRowsandColumns
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithrowsandcolumns/deletingrowsandcolumns/data/";
        
        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "workbook.xls");

        //Accessing the first worksheet in the Excel file
        Worksheet worksheet = workbook.getWorksheets().get(0);

        // ================== DELETING ROWS ==================
        
        //Deleting a row from the worksheet at 6th position
        worksheet.getCells().deleteRow(5);
        
        //Deleting 3 rows from the worksheet starting from 7th row
        worksheet.getCells().deleteRows(6,3,true);

        // ================== DELETING COLUMNS ===============

        //Deleting a column from the worksheet at 4th position
        worksheet.getCells().deleteColumn(3);

        //Deleting 3 columns from the worksheet at 5th position
        worksheet.getCells().deleteColumns(4,3,true);
        
        //Saving the modified Excel file in default (that is Excel 2000) format
        workbook.save(dataDir + "workbook.out.xls");
        
        //Print message
        System.out.println("Rows and Columns deleted successfully.");           
    }
}