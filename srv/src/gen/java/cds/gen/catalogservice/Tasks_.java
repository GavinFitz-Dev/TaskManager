package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;

@CdsName("CatalogService.Tasks")
public interface Tasks_ extends StructuredType<Tasks_> {
  String CDS_NAME = "CatalogService.Tasks";

  ElementRef<LocalDate> duedate();

  ElementRef<String> description();

  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<String> priority();
}
