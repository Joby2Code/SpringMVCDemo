package com.santosh.spring.view;

import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.santosh.spring.EmpDetails;

public class EmployeeListExcelView extends AbstractExcelView {

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse respone)
			throws Exception {
		// TODO Auto-generated method stub
		HSSFSheet sheet = workbook.createSheet("Employee Details");
		sheet.setDefaultColumnWidth((short) 10);
		getCell(sheet, 0, 0).setCellValue("EmpNo");
		getCell(sheet, 0, 1).setCellValue("Employee Name");
		getCell(sheet, 0, 2).setCellValue("Job");
		getCell(sheet, 0, 3).setCellValue("Manager ID");
		getCell(sheet, 0, 4).setCellValue("HireDate");
		getCell(sheet, 0, 5).setCellValue("Salary");
		getCell(sheet, 0, 6).setCellValue("Commision");
		getCell(sheet, 0, 7).setCellValue("DeptNo");

		Collection<EmpDetails> empdetails = (Collection<EmpDetails>) model
				.get("empdetails");
		if ((empdetails == null) || empdetails.isEmpty()) {
			getCell(sheet, 2, 2).setCellValue("No employees found");
			return;
		}
		int row = 2;
		for (EmpDetails emp : empdetails) {
			getCell(sheet, row, 0).setCellValue(emp.getEmpno());
			getCell(sheet, row, 1).setCellValue(emp.getName());
			getCell(sheet, row, 2).setCellValue(emp.getJob());
			getCell(sheet, row, 3).setCellValue(emp.getMgr());
			getCell(sheet, row, 4).setCellValue(emp.getHiredate());
			getCell(sheet, row, 5).setCellValue(emp.getSal());
			getCell(sheet, row, 6).setCellValue(emp.getComm());
			getCell(sheet, row, 7).setCellValue(emp.getDeptno());
			row++;
		}
	}

}
