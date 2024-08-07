package com.example.madhu.csvmapping;


import org.springframework.util.StringUtils;

import com.opencsv.bean.BeanField;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class CustomerCsvMappingStrategy <T> extends ColumnPositionMappingStrategy<T>{
	
	public String[] generateHeader(){
		final int numColumns=findMaxFieldIndex();
		
		if(!isAnnotationDriven() || numColumns == -1) {
			try {
				return super.generateHeader(null);
			} catch (CsvRequiredFieldEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			BeanField beanField;
			for(int i=0;i<=numColumns;i++) {
				beanField=findField(i);
				String ColumnHeaderName =profile;
			}
			return null;
	}
	
	

	private int findMaxFieldIndex() {
		// TODO Auto-generated method stub
		return 0;
	}



	private String extractHeaderName(final 	BeanField beanField) {
		if(beanField==null || beanField.getField()== null || beanField.getField()
				.getDeclaredAnnotationsByType(CsvBindByName.class).length==0) {
			return StringUtils.isEmpty(beanField);
		}
		final CsvBindByName bindByNameAnnotation=beanField.getField().getAnnotationsByType(CsvBindByName.class)[0];
		
		return bindByNameAnnotation.column();
		}

	
		
}
