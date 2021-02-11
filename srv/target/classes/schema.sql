DROP VIEW IF EXISTS CatalogService_Tasks;

DROP TABLE IF EXISTS my_tasks_Tasks;

CREATE TABLE my_tasks_Tasks (
  ID INTEGER NOT NULL,
  title NVARCHAR(5000),
  description NVARCHAR(5000),
  priority NVARCHAR(5000),
  duedate DATE,
  PRIMARY KEY(ID)
);

CREATE VIEW CatalogService_Tasks AS SELECT
  Tasks_0.ID,
  Tasks_0.title,
  Tasks_0.description,
  Tasks_0.priority,
  Tasks_0.duedate
FROM my_tasks_Tasks AS Tasks_0;

