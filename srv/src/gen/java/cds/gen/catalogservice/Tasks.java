package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;

@CdsName("CatalogService.Tasks")
public interface Tasks extends CdsData {
  String DUEDATE = "duedate";

  String DESCRIPTION = "description";

  String ID = "ID";

  String TITLE = "title";

  String PRIORITY = "priority";

  LocalDate getDuedate();

  void setDuedate(LocalDate duedate);

  String getDescription();

  void setDescription(String description);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getTitle();

  void setTitle(String title);

  String getPriority();

  void setPriority(String priority);

  Tasks_ ref();

  static Tasks create() {
    return Struct.create(Tasks.class);
  }
}
