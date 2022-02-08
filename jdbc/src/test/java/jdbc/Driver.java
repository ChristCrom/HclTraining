package jdbc;

import java.sql.*;

@SuppressWarnings("unused")
public class Driver {

	public static void main(String[] args) {
		
		DBInsert.DBInser();
		DBSelectAll.DBSelectAl();
		SelectSal.DBSelectSalary();
		DBUpdate.DBUpdat();
		DBSelectAll.DBSelectAl();
		DBDelete.DBDelet();
		DBSelectAll.DBSelectAl();
		DBInsert.DBInser();
		DBSelectAll.DBSelectAl();
		DBSelectCond.DBSelectCon();
		DBDelete.DBDelet();

	}
}
