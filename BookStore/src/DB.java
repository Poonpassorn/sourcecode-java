import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {

	void getData(String id) {

		String sql = "SELECT * FROM USER WHERE  id=?";
		// try-resources-catch ใส่วงเล็บ ใช้เสร็จมันจะ close ให้เลย
		try (
				Connection connect = DriverManager.getConnection("");
				PreparedStatement preparedStatement = connect.prepareStatement(sql);) {

			preparedStatement.setString(1, id);
			// TODO
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
