package com.santosh.spring.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.santosh.spring.EmpDetails;

public class EmployeeDetailsPDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map model, Document doc,
			PdfWriter pdfWriter, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		EmpDetails emp = (EmpDetails) model.get("empdetails");
		if (emp == null) {
			doc.add(new Paragraph(
					"There are no records matching your search criteria"));
			return;
		}
		System.out.println(emp.getName() + "Works as always in pdf");
		Paragraph p = new Paragraph("Employee Search Resullts");
		p.setAlignment("center");
		p.setSpacingAfter(15);
		doc.add(p);
		Table empTable = new Table(2);
		empTable.setWidth(50);
		empTable.setBorder(0);
		empTable.setDefaultCellBorder(0);
		empTable.backgroundColor();
		doc.add(new Paragraph("Welcome "+(String) emp.getName()+" Congrats on your first PDF doc"));
		empTable.addCell("EmpNo");
		empTable.addCell(emp.getEmpno() + " ");
		empTable.addCell("Employee Name");
		empTable.addCell(emp.getName());
		empTable.addCell("Job");
		empTable.addCell(emp.getJob());
		empTable.addCell("Manager ID");
		empTable.addCell(emp.getMgr()+"");
		empTable.addCell("HireDate");
		empTable.addCell(emp.getHiredate()+"");
		empTable.addCell("Salary");
		empTable.addCell(emp.getSal()+"");
		empTable.addCell("Commision");
		empTable.addCell(emp.getComm() + "");
		empTable.addCell("Commision");
		empTable.addCell(emp.getDeptno() + "");

	}

}
