package webLogic.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webLogic.dao.SaveDataDaoInterface;
import webLogic.entity.AllDayEntity;
import webLogic.entity.ProductComputationlyEntity;
import webLogic.entity.ProductEntity;
import webLogic.service.Additional.StructProduct;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yansolo on 07.09.2018.
 */
@Service("XSLXwork")
public class XSLXwork implements XSLXworkInterface {

    public String pathTemplate = "c:\\Code (-_-)\\BioFactory(server)\\src\\main\\resource\\base file template.xls";
    public String pathEdit = "c:\\Code (-_-)\\BioFactory(server)\\src\\main\\resource\\Result File.xls";

    @Autowired
    public SaveDataDaoInterface saveDataDaoImp;

    public void testMethod()
    {
        System.out.println("XSLXwork : testMethod");

        createXSLbyDate("2018-09-06","2018-09-07");
    }

    public void createXSLbyDate(String dateLater, String dateBefore) {
        //  List allDaysList = saveDataDaoImp.getAllDayByDates(dateLater,dateBefore);

        //  System.out.println(allDaysList + "");


        // createCopyFile();

        //HSSFWorkbook book = readWorkbook(pathTemplate);

        // writeWorkbook(book,pathEdit);
        try {
            HSSFWorkbook book = readWorkbook(pathTemplate);

            List allDaysList = saveDataDaoImp.getAllDayByDates(dateLater,dateBefore);

            addSheetInFile(book,allDaysList);

            pushDataFromAllDayList(book,allDaysList);



            createCopyFile();

            writeWorkbook(book,pathEdit);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }

    public List<StructProduct> initStructProduct(List<AllDayEntity> allDayList)
    {
        List<StructProduct> structProductList = new LinkedList<>();
        for (AllDayEntity allDayEntity:allDayList)
        {
    //        structProductList.name
        }

        return null;
    }

    public void createGraficInExcel(HSSFWorkbook book, List<AllDayEntity> allDayList)
    {


    }

    public void pushDataFromAllDayList(HSSFWorkbook book, List<AllDayEntity> allDayList)
    {
        int sheetCount = 2;
        //int rowCount = 3;
        for (AllDayEntity allDayEntity : allDayList) {
            Sheet sheet = book.getSheetAt(sheetCount);
            int rowCount = 3;
            for (ProductComputationlyEntity prod : allDayEntity.getProductComputationlyEntities())
            {
                Row row = sheet.getRow(rowCount);
                setDataFromProductInRow(row,prod);
                rowCount++;
            }
            setDataFromAllDayInRow(sheet,allDayEntity);
            sheetCount++;
        }
    }

    //
    public void setDataFromProductInRow(Row row, ProductComputationlyEntity prodComp)
    {
        ProductEntity product = saveDataDaoImp.getProductByIdProduct(prodComp.getUniqueId_Product() +"");
        row.getCell(0).setCellValue(product.get_name());
        row.getCell(11).setCellValue(prodComp.getDayMass());
        row.getCell(12).setCellValue(prodComp.getNightMass());
        row.getCell(15).setCellValue(prodComp.getDayMassSV());
        row.getCell(16).setCellValue(prodComp.getDayMassWater());
        row.getCell(17).setCellValue(prodComp.getNightMassSV());
        row.getCell(18).setCellValue(prodComp.getNightMassWater());
        row.getCell(21).setCellValue(prodComp.getMetanDay());
        row.getCell(22).setCellValue(prodComp.getMetanNight());
    }

    public void setDataFromAllDayInRow(Sheet sheet,AllDayEntity allDayEntity)
    {
        //int rowCount = 23;
        sheet.getRow(23).getCell(1).setCellValue("" + allDayEntity.get_allMass());
        sheet.getRow(24).getCell(1).setCellValue("" + allDayEntity.get_allMassSV());
        sheet.getRow(25).getCell(1).setCellValue("" + allDayEntity.get_relationAllSV());
        sheet.getRow(26).getCell(1).setCellValue("need GPA");

    }


    public void createCopyFile() {

        File file = new File(pathEdit);
        file.getParentFile().mkdirs();
        pathEdit = file.getPath();
    }

    public void addSheetInFile(HSSFWorkbook book,List<AllDayEntity> allDaysList)
    {
        int i = 2;
        for (AllDayEntity alldayEntity : allDaysList) {

            Sheet sheetTempLate =  book.cloneSheet(1);

            book.setSheetName(i,"Day " + alldayEntity.getDate());
            i++;
        }
    }


    public static HSSFWorkbook readWorkbook(String filename) {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(filename));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            return wb;
        }
        catch (Exception e) {
            return null;
        }
    }

    public static void writeWorkbook(HSSFWorkbook wb, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            wb.write(fileOut);
            fileOut.close();
        }
        catch (Exception e) {
            //Обработка ошибки
        }
    }

    public static String parse(String fileName) {
        //инициализируем потоки
        String result = "";
        InputStream inputStream = null;
        HSSFWorkbook workBook = null;
        try {
            inputStream = new FileInputStream(fileName);
            workBook = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //разбираем первый лист входного файла на объектную модель
        Sheet sheet = workBook.getSheetAt(0);
        Iterator<Row> it;
        it = sheet.iterator();
        //проходим по всему листу
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();
                //перебираем возможные типы ячеек
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        result += cell.getStringCellValue() + "=";
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        result += "[" + cell.getNumericCellValue() + "]";
                        break;

                    case Cell.CELL_TYPE_FORMULA:
                        result += "[" + cell.getNumericCellValue() + "]";
                        break;
                    default:
                        result += "|";
                        break;
                }
            }
            result += "\n";
        }

        return result;
    }
}
