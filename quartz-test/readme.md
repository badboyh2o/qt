
https://www.cnblogs.com/dzpykj/p/9117716.html

Spring4.3.5
Quartz2.2.3

1、建库，执行 src/main/files/tables_mysql_innodb.sql
2、修改jdbc, quartz jdbc
3、run


测试

测试Quartz分布式集群,分别两个端口启动Tomcat,各访访问一次,看控制台,在看数据库表,慢慢研究,可定会有收获

新增任务URL
http://127.0.0.1:8080/qt/addTask?jobName=UserVisitCountJob1&jobGroupName=UserVisitCountJobGroup1&triggerName=simpleTrigger1&triggerGroupName=triggerGroup1

删除任务URL
http://127.0.0.1:8080/qt/removeTask?jobName=UserVisitCountJob1&jobGroupName=UserVisitCountJobGroup1&triggerName=simpleTrigger1&triggerGroupName=triggerGroup1


