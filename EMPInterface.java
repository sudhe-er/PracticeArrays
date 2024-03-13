package awt;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBConnect;

public class EMPInterface extends WindowAdapter {
	Frame frame;
	DBConnect dbconnection;
	Connection connection;
	Choice tablesDropDown;
	Choice columnsDropDown;
	DatabaseMetaData metaData;

	public EMPInterface() {
		frame = new Frame("Data Dictionary");
		tablesDropDown = new Choice();
		columnsDropDown = new Choice();
		tablesDropDown.setBounds(100, 100, 250, 75);
		columnsDropDown.setBounds(500, 100, 250, 50);
		tablesDropDown.add("Tables...");
		columnsDropDown.add("Retrieving Columns from the Database...");
		frame.add(tablesDropDown);
		frame.add(columnsDropDown);
		frame.setSize(1150, 1500);
		frame.setLayout(null);

	}

	public void interfaceFrame() {

		// fetching tables from the database
		try {
			connection = DBConnect.connect();
			metaData = connection.getMetaData();
			ResultSet tables = metaData.getTables(null, null, "%", new String[] { "TABLE" });
			while (tables.next()) {
				tablesDropDown.add(tables.getString("TABLE_NAME"));
			}

			// add action to a selected table in tablesDropDown menu
			tablesDropDown.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					String selectedTable = tablesDropDown.getSelectedItem();
					if (selectedTable != null) {
						PreparedStatement statement;
						try {
							String query = "SELECT COLUMN_NAME FROM information_schema.columns WHERE TABLE_NAME=? ";
							statement = connection.prepareStatement(query);
							statement.setString(1, selectedTable);
							ResultSet columnConstraints = statement.executeQuery();
							if (columnConstraints != null)
								System.out.println("not empty");
							while (columnConstraints.next()) {
								columnsDropDown.add(columnConstraints.getString("COLUMN_NAME"));
							}

						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
					columnsDropDown.removeAll();
				}
			});

		} catch (SQLException e) {
			e.printStackTrace();
		}
		frame.addWindowListener(this);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		EMPInterface obj = new EMPInterface();
		obj.interfaceFrame();
	}

	public void windowClosing(WindowEvent e) {
		// Call dispose() method
		System.exit(0);

	}

}
